package pe.unjfsc.daw.spring5.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@ComponentScan("pe.unjfsc.daw.spring5")
@Configurable
public class CEConfigExpression {
	private static final Logger LOG = LoggerFactory.getLogger("CEConfigExpression");

	@Bean
	public ExpressionParser oExpresionParser() {
		LOG.info("[DAW] Generando la instancia de la clase ExpressionParser");
		return new SpelExpressionParser();
	}
}
