package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;

import pe.unjfsc.daw.spring5.entity.CEConfigExpression;

public class CV02AppSpelExpressionUseStrings {

	private static final Logger LOG = LoggerFactory.getLogger("CV02AppSpelExpressionUseStrings");

	private static String MSG_CONCAT = "'Desarrollo Aplicaciones Web'.concat(' Ciclo IX')";
	private static String MSG_UPPER = "'Desarrollo Aplicaciones Web'.toUpperCase()";
	private static String MSG_LENGTH = "'Desarrollo Aplicaciones Web'.length()";
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Instancia de la Annotacion : {}", oCntx);
		
		LOG.info("[DAW] Registro de la Annotacion : {}");
		oCntx.register(CEConfigExpression.class);
		oCntx.refresh();
		
		LOG.info("[DAW] Instancia de la clase CEConfigExpression : {}", oCntx);
		
		ExpressionParser oParser = (ExpressionParser) oCntx.getBean("oExpresionParser");
		Expression expression = oParser.parseExpression(MSG_CONCAT);
		LOG.info("CONCAT of expression : {}",expression.getValue());

		expression = oParser.parseExpression(MSG_UPPER);
		LOG.info("UPPER CASE of expression : {}",expression.getValue());
		
		expression = oParser.parseExpression(MSG_LENGTH);
		LOG.info("LENGTH of expression : {}",expression.getValue());
	}

}
