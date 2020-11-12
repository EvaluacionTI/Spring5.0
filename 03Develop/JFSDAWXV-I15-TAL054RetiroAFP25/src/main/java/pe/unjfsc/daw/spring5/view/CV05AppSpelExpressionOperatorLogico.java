package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class CV05AppSpelExpressionOperatorLogico {
	private static final Logger LOG = LoggerFactory.getLogger("CV05AppSpelExpressionOperatorLogico");

	private static String MSG_AND = "250 > 170 && 100 < 1700";
	private static String MSG_OR = "250 < 170 || 100 < 1700";
	private static String MSG_NOT = "!(120 < 27)";
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		ExpressionParser expressionParser = new SpelExpressionParser();
		LOG.info("[EVL] Clase ExpressionParser : {}", expressionParser);
		
		Expression expression = expressionParser.parseExpression(MSG_AND);
		LOG.info("AND of expression : {}",expression.getValue());
		
		expression = expressionParser.parseExpression(MSG_OR);
		LOG.info("OR of expression : {}",expression.getValue());
		
		expression = expressionParser.parseExpression(MSG_NOT);
		LOG.info("NOT of expression : {}",expression.getValue());

	}
}
