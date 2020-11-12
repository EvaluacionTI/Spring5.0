package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class CV06AppSpelExpressionOperatorCondicional {
	private static final Logger LOG = LoggerFactory.getLogger("CV06AppSpelExpressionOperatorCondicional");

	private static String MSG_CONDI = "(15==17) ? 'Identifico':'Compromiso'";
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		ExpressionParser expressionParser = new SpelExpressionParser();
		LOG.info("[EVL] Clase ExpressionParser : {}", expressionParser);
		
		Expression expression = expressionParser.parseExpression(MSG_CONDI);
		LOG.info("CONDI of expression : {}",expression.getValue());
		
	}
}
