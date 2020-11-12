package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEAfiliado;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public class CV01v01AppSpelAnotado {
	private static final Logger LOG = LoggerFactory.getLogger("CV01v01AppSpelAnotado");

	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context01-spelXMLAnotado.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CESaldoAfiliado oCESaldo = oCntx.getBean(CESaldoAfiliado.class);
		LOG.info("[EVL] CESaldoAfiliado : {}", oCESaldo);
		
		CEAfiliado oCEAfiliado = oCntx.getBean(CEAfiliado.class);
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado);
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getEmpId());
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getOfficeAddress().getCity());
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getOfficeAddress().getAddress(null));
		
		((ConfigurableApplicationContext) oCntx).close();
//https://www.w3spoint.com/spel-spring-expression-language
		//https://knpcode.com/spring/spring-expression-language-spel-tutorial/
		//https://www.netjstech.com/2016/12/run-time-injection-using-spring-expression-language-spel.html ---
		//https://dzone.com/articles/evaluating-expressions-using
		//https://dzone.com/articles/learn-spring-expression-language-with-examples
		//https://dzone.com/articles/beginners-guide-to-spring-expression-language-with
		//https://www.javatpoint.com/spring-expression-language-tutorial
		//https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/expressions.html
		//https://www.baeldung.com/spring-expression-language
		
	}
}
