package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE0101v01ColorAnimal;

public class CV0101v01DeclararBean {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0101v01DeclararBean.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0101v01-declerar-bean.xml");
		
		MOLOG.info("[EVL] Contexto ==> {} ", moCntx );
		MOLOG.info("[EVL] Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("[EVL] Context ==> {}", moCntx );
		MOLOG.info("[EVL] Environment==> {} ", moCntx.getEnvironment());
		
		CE0101v01ColorAnimal oCEColorAnimal = (CE0101v01ColorAnimal) moCntx.getBean("idCEColorAnimal");
		MOLOG.info("[EVL] Created Instance ==> {} ", moCntx.getStartupDate());
		
		MOLOG.info("[EVL] CEColorAnimal ==> {} {} {}",oCEColorAnimal, oCEColorAnimal.getBasePiel(), oCEColorAnimal.getTexturaPiel() );
		
		MOLOG.info("[EVL] [ End - main(String[] args) ] <====");
		((ClassPathXmlApplicationContext) moCntx).close();
	}

}
