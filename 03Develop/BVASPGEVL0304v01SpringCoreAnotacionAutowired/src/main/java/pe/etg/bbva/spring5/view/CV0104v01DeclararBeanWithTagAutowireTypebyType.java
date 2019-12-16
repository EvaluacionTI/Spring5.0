package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE0104v01CuyAutowireByType;

public class CV0104v01DeclararBeanWithTagAutowireTypebyType {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0104v01DeclararBeanWithTagAutowireTypebyType.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring5/spring0104v01-declarar-tag-autowire-byType.xml");
		
		MOLOG.info("[EVL] Contexto ==> {} ", moCntx );
		MOLOG.info("[EVL] Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("[EVL] Context ==> {}", moCntx );
		MOLOG.info("[EVL] Environment==> {} ", moCntx.getEnvironment());
		
		CE0104v01CuyAutowireByType oCECuy = (CE0104v01CuyAutowireByType) moCntx.getBean("idCECuy");
		MOLOG.info("[EVL] Created Instance ==> {} ", moCntx.getStartupDate());
		
		MOLOG.info("[EVL] Animal llama : {} {} {} {} {}",oCECuy, oCECuy.getNombre(), oCECuy.getColor(), oCECuy.getColor().getBasePiel(), oCECuy.getColor().getTexturaPiel() );
		
		MOLOG.info("[EVL] [ End - main(String[] args) ] <====");
		((ClassPathXmlApplicationContext) moCntx).close();
	}

}
