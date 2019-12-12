package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE0102v01LlamaAutowireNo;

public class CV0102v01DeclararBeanWithTagAutowireTypeNo {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0102v01DeclararBeanWithTagAutowireTypeNo.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0102v01-tag-autowire-no.xml");
		
		MOLOG.info("[EVL] Contexto ==> {} ", moCntx );
		MOLOG.info("[EVL] Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("[EVL] Context ==> {}", moCntx );
		MOLOG.info("[EVL] Environment==> {} ", moCntx.getEnvironment());
		
		CE0102v01LlamaAutowireNo oCELlama = (CE0102v01LlamaAutowireNo) moCntx.getBean("idCELlama");
		MOLOG.info("[EVL] Created Instance ==> {} ", moCntx.getStartupDate());
		
		MOLOG.info("[EVL] Animal llama : {} {} {} {} {}",oCELlama, oCELlama.getNombre(), oCELlama.getColor(), oCELlama.getColor().getBasePiel(), oCELlama.getColor().getTexturaPiel() );
		
		MOLOG.info("[EVL] [ End - main(String[] args) ] <====");
		((ClassPathXmlApplicationContext) moCntx).close();
	}

}
