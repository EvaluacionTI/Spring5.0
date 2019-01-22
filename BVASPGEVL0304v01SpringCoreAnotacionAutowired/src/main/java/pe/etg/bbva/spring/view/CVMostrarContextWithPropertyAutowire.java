package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE0101v01ColorAnimal;
import pe.etg.bbva.spring.entity.CE0102v01LlamaAutowireNo;
import pe.etg.bbva.spring.entity.CE0103v01PumaAutowireByName;
import pe.etg.bbva.spring.entity.CE0104v01CuyAutowireByType;
import pe.etg.bbva.spring.entity.CE0105v01VizcachaAutowireConstructor;

public class CVMostrarContextWithPropertyAutowire {
	private static Logger MOLOG = LoggerFactory.getLogger(CVMostrarContextWithPropertyAutowire.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("====> [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0101v01-anotacion-autowired.xml");
		
		MOLOG.info("[EVL] Contexto ==> {} ", moCntx );
		MOLOG.info("[EVL] Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("[EVL] Context ==> {}", moCntx );
		MOLOG.info("[EVL] Environment==> {} ", moCntx.getEnvironment());
		
		CE0101v01ColorAnimal oCEColorAnimal = (CE0101v01ColorAnimal) moCntx.getBean("idCEColorAnimal");
		CE0102v01LlamaAutowireNo oCELlama = (CE0102v01LlamaAutowireNo) moCntx.getBean("idCELlama");
		CE0103v01PumaAutowireByName oCEPuma = (CE0103v01PumaAutowireByName) moCntx.getBean("idCEPuma");
		CE0104v01CuyAutowireByType oCECuy = (CE0104v01CuyAutowireByType) moCntx.getBean("idCECuy");
		CE0105v01VizcachaAutowireConstructor oCEVizcacha = (CE0105v01VizcachaAutowireConstructor) moCntx.getBean("idCEVizcacha");
		
		MOLOG.info("====> Created Instance ==> {} ", moCntx.getStartupDate());
		
		MOLOG.info("====> CEColorAnimal ==> {} {} {}",oCEColorAnimal, oCEColorAnimal.getBasePiel(), oCEColorAnimal.getTexturaPiel() );
		MOLOG.info("====> CELlama ==> {} {} {} ", oCELlama, oCELlama.getColor(), oCELlama.getNombre() );
		MOLOG.info("====> CEPuma==> {} {} {}", oCEPuma, oCEPuma.getColor(), oCEPuma.getNombre() );
		MOLOG.info("====> CECuy ==> {} {} {}", oCECuy, oCECuy.getColor(), oCECuy.getNombre());
		MOLOG.info("====> CEVizcacha ==> {} {} {}", oCEVizcacha, oCEVizcacha.getColor(), oCEVizcacha.getNombre() );
		
		MOLOG.info("====> [ End - main(String[] args) ] <====");
	}

}
