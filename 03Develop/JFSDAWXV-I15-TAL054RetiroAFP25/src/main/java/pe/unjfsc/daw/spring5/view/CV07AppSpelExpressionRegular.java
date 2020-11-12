package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public class CV07AppSpelExpressionRegular {
	private static final Logger LOG = LoggerFactory.getLogger("CV07AppSpelExpressionRegular");

	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		ExpressionParser expressionParser = new SpelExpressionParser();
		LOG.info("[EVL] Clase ExpressionParser : {}", expressionParser);
		
		CESaldoAfiliado oCESaldo = new CESaldoAfiliado("456dentrance","devsPractice");
		
		Expression expression = expressionParser.parseExpression("codigo matches '[a-zA-Z]+'");
		LOG.info("Regex of expression : {}",expression.getValue(oCESaldo));

		expression = expressionParser.parseExpression("codigoAfiliado matches '[a-zA-Z]+'");
		LOG.info("Regex of expression : {}",expression.getValue(oCESaldo));

	}
}
