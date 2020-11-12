package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class CV03AppSpelExpressionOperatoAritmetico {
	private static final Logger LOG = LoggerFactory.getLogger("CV03AppSpelExpressionOperatoAritmetico");

	private static String MSG_SUMA = "15 + 17";
	private static String MSG_RESTA = "17 - 20";
	private static String MSG_MULTI = "20 * 27";
	private static String MSG_DIVI = "27 / 20";
	private static String MSG_REST0 = "20 mod 10";
	private static String MSG_EXPO = "15 ^ 5";
	private static String MSG_OPERA = "(5^3)*10+27";
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		ExpressionParser expressionParser = new SpelExpressionParser();
		LOG.info("[EVL] Clase ExpressionParser : {}", expressionParser);
		
		Expression expression = expressionParser.parseExpression(MSG_SUMA);
		LOG.info("SUMA of expression : {}",expression.getValue());
		
		expression = expressionParser.parseExpression(MSG_RESTA);
		LOG.info("RESTA of expression : {}",expression.getValue());
		
		expression = expressionParser.parseExpression(MSG_MULTI);
		LOG.info("MULTI of expression : {}",expression.getValue());

		expression = expressionParser.parseExpression(MSG_DIVI);
		LOG.info("DIVI of expression : {}",expression.getValue());

		expression = expressionParser.parseExpression(MSG_REST0);
		LOG.info("RESTO of expression : {}",expression.getValue());

		expression = expressionParser.parseExpression(MSG_EXPO);
		LOG.info("EXPO of expression : {}",expression.getValue());

		expression = expressionParser.parseExpression(MSG_OPERA);
		LOG.info("OPERA of expression : {}",expression.getValue());
	}
}
