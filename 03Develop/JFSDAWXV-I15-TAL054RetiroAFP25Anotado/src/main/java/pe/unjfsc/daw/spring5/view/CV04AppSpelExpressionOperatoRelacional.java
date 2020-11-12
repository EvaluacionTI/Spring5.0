package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class CV04AppSpelExpressionOperatoRelacional {
	private static final Logger LOG = LoggerFactory.getLogger("CV04AppSpelExpressionOperatoRelacional");

	private static String MSG_MENOR = "15 < 17";
	private static String MSG_MAYOR = "17 > 20";
	private static String MSG_IGUAL = "20 == 27";
	private static String MSG_DISTINTO = "27 != 20";
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		ExpressionParser expressionParser = new SpelExpressionParser();
		LOG.info("[EVL] Clase ExpressionParser : {}", expressionParser);
		
		Expression expression = expressionParser.parseExpression(MSG_MENOR);
		LOG.info("MENOR of expression : {}",expression.getValue());
		
		expression = expressionParser.parseExpression(MSG_MAYOR);
		LOG.info("MAYOR of expression : {}",expression.getValue());
		
		expression = expressionParser.parseExpression(MSG_IGUAL);
		LOG.info("IGUAL of expression : {}",expression.getValue());

		expression = expressionParser.parseExpression(MSG_DISTINTO);
		LOG.info("DISTINTO of expression : {}",expression.getValue());

	}
}
