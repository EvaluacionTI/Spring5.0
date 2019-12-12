package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE0105v01VizcachaAutowireConstructor;

public class CV0105v01DeclararBeanWithTagAutowireConstructor {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0105v01DeclararBeanWithTagAutowireConstructor.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("====> [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0105v01-declarar-tag-autowire-constructor.xml");
		
		MOLOG.info("[EVL] Contexto ==> {} ", moCntx );
		MOLOG.info("[EVL] Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("[EVL] Context ==> {}", moCntx );
		MOLOG.info("[EVL] Environment==> {} ", moCntx.getEnvironment());
		
		CE0105v01VizcachaAutowireConstructor oCEVizcacha = (CE0105v01VizcachaAutowireConstructor) moCntx.getBean("idCEVizcacha");
		
		MOLOG.info("====> Created Instance ==> {} ", moCntx.getStartupDate());
		
		MOLOG.info("====> CEVizcacha ==> {} {} {}", oCEVizcacha, oCEVizcacha.getColor(), oCEVizcacha.getNombre() );
		
		MOLOG.info("====> [ End - main(String[] args) ] <====");
	}

}
