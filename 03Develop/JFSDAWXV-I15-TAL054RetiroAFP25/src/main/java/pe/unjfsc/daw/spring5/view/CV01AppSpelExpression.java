package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class CV01AppSpelExpression {

	private static final Logger LOG = LoggerFactory.getLogger("CV01AppSpelExpression");
	// SpelExpressionParser la cual nos permite evaluar expresiones sin necesidad de iniciar el contexto de Spring framework
	private static String MSG_SPEL = "'Desarrollo Aplicaciones Web'";
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		ExpressionParser expressionParser = new SpelExpressionParser();
		LOG.info("[EVL] Clase ExpressionParser : {}", expressionParser);
		
		Expression expression = expressionParser.parseExpression(MSG_SPEL);
		LOG.info("String expression : {}",expression.getValue());
	}

}
