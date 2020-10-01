package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV02RevisionContextBeanAnidado {
	private static final Logger LOG = LoggerFactory.getLogger("CV01RevisionContext");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-beanAnidado.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
