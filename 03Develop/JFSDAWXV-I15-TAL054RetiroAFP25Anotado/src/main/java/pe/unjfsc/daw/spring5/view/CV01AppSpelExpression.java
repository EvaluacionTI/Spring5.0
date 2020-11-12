package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;

import pe.unjfsc.daw.spring5.entity.CEConfigExpression;

public class CV01AppSpelExpression {

	private static final Logger LOG = LoggerFactory.getLogger("CV01AppSpelExpression");
	private static String MSG_SPEL = "'Desarrollo Aplicaciones Web'";
	
	public static void main(String[] args) {
		LOG.info("[DAW] Iniciando execute");
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Instancia de la Annotacion : {}", oCntx);
		
		LOG.info("[DAW] Registro de la Annotacion : {}");
		oCntx.register(CEConfigExpression.class);
		oCntx.refresh();
		
		LOG.info("[DAW] Instancia de la clase CEConfigExpression : {}", oCntx);
		
		ExpressionParser oParser = (ExpressionParser) oCntx.getBean("oExpresionParser");
		
		Expression expression = oParser.parseExpression(MSG_SPEL);
		LOG.info("String expression : {}",expression.getValue());
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
