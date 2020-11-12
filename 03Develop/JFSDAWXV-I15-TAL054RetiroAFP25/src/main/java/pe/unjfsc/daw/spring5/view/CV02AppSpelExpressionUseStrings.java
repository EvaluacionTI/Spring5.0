package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class CV02AppSpelExpressionUseStrings {

	private static final Logger LOG = LoggerFactory.getLogger("CV02AppSpelExpressionUseStrings");

	private static String MSG_CONCAT = "'Desarrollo Aplicaciones Web'.concat(' Ciclo IX')";
	private static String MSG_UPPER = "'Desarrollo Aplicaciones Web'.toUpperCase()";
	private static String MSG_LENGTH = "'Desarrollo Aplicaciones Web'.length()";
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		ExpressionParser expressionParser = new SpelExpressionParser();
		LOG.info("[EVL] Clase ExpressionParser : {}", expressionParser);
		
		Expression expression = expressionParser.parseExpression(MSG_CONCAT);
		LOG.info("CONCAT of expression : {}",expression.getValue());
		
		expression = expressionParser.parseExpression(MSG_UPPER);
		LOG.info("UPPER CASE of expression : {}",expression.getValue());
		
		expression = expressionParser.parseExpression(MSG_LENGTH);
		LOG.info("LENGTH of expression : {}",expression.getValue());
	}

}
