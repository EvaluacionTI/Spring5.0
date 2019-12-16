package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE0103v01PumaAutowireByName;

public class CV0103v01DeclararBeanWithTagAutowireTypebyName {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0103v01DeclararBeanWithTagAutowireTypebyName.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring5/spring0103v01-declarar-tag-autowire-byName.xml");
		
		MOLOG.info("[EVL] Contexto ==> {} ", moCntx );
		MOLOG.info("[EVL] Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("[EVL] Context ==> {}", moCntx );
		MOLOG.info("[EVL] Environment==> {} ", moCntx.getEnvironment());
		
		CE0103v01PumaAutowireByName oCELlama = (CE0103v01PumaAutowireByName) moCntx.getBean("idCEPuma");
		MOLOG.info("[EVL] Created Instance ==> {} ", moCntx.getStartupDate());
		
		MOLOG.info("[EVL] Animal llama : {} {} {} {} {}",oCELlama, oCELlama.getNombre(), oCELlama.getColor(), oCELlama.getColor().getBasePiel(), oCELlama.getColor().getTexturaPiel() );
		
		MOLOG.info("[EVL] [ End - main(String[] args) ] <====");
		((ClassPathXmlApplicationContext) moCntx).close();
	}

}
