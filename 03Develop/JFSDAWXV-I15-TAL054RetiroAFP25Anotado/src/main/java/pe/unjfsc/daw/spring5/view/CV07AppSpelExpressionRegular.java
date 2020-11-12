package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;

import pe.unjfsc.daw.spring5.entity.CEConfigExpression;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public class CV07AppSpelExpressionRegular {
	private static final Logger LOG = LoggerFactory.getLogger("CV07AppSpelExpressionRegular");

	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Instancia de la Annotacion : {}", oCntx);
		
		LOG.info("[DAW] Registro de la Annotacion : {}");
		oCntx.register(CEConfigExpression.class);
		oCntx.refresh();
		
		LOG.info("[DAW] Instancia de la clase CEConfigExpression : {}", oCntx);
		CESaldoAfiliado oCESaldo = (CESaldoAfiliado) oCntx.getBean(CESaldoAfiliado.class);
		LOG.info("[DAW] Instancia CESaldoAfiliado : {}", oCESaldo);
		
		oCESaldo = new CESaldoAfiliado("456dentrance","devsPractice");
		LOG.info("[DAW] Registro de la CESaldoAfiliado : {}", oCESaldo);
		
		
		ExpressionParser oParser = (ExpressionParser) oCntx.getBean("oExpresionParser");
		Expression expression = oParser.parseExpression("codigo matches '[a-zA-Z]+'");
		
		LOG.info("Regex of expression : {}",expression.getValue(oCESaldo));

		expression = oParser.parseExpression("codigoAfiliado matches '[a-zA-Z]+'");
		LOG.info("Regex of expression : {}",expression.getValue(oCESaldo));

	}
}
