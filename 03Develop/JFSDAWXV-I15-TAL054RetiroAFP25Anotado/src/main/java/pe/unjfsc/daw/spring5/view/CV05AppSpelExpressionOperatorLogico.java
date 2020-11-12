package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;

import pe.unjfsc.daw.spring5.entity.CEConfigExpression;

public class CV05AppSpelExpressionOperatorLogico {
	private static final Logger LOG = LoggerFactory.getLogger("CV05AppSpelExpressionOperatorLogico");

	private static String MSG_AND = "250 > 170 && 100 < 1700";
	private static String MSG_OR = "250 < 170 || 100 < 1700";
	private static String MSG_NOT = "!(120 < 27)";
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Instancia de la Annotacion : {}", oCntx);
		
		LOG.info("[DAW] Registro de la Annotacion : {}");
		oCntx.register(CEConfigExpression.class);
		oCntx.refresh();
		
		LOG.info("[DAW] Instancia de la clase CEConfigExpression : {}", oCntx);
		
		ExpressionParser oParser = (ExpressionParser) oCntx.getBean("oExpresionParser");
		Expression expression = oParser.parseExpression(MSG_AND);
		LOG.info("AND of expression : {}",expression.getValue());
		
		expression = oParser.parseExpression(MSG_OR);
		LOG.info("OR of expression : {}",expression.getValue());
		
		expression = oParser.parseExpression(MSG_NOT);
		LOG.info("NOT of expression : {}",expression.getValue());

	}
}
