package pe.etg.bbva.spring.view;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE01ColorAnimal;
import pe.etg.bbva.spring.entity.CE02LlamaAutowireNo;
import pe.etg.bbva.spring.entity.CE03PumaAutowireByName;
import pe.etg.bbva.spring.entity.CE04CuyAutowireByType;
import pe.etg.bbva.spring.entity.CE05VizcachaAutowireConstructor;



public class CVMostrarContextWithPropertyAutowire {
	private static Logger MOLOG = LoggerFactory.getLogger(CVMostrarContextWithPropertyAutowire.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("====> [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:*spring-context-autowire.xml");
		
		MOLOG.info("====> Contexto ==> {} ", moCntx );
		MOLOG.info("====> Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("====> Context ==> {}", moCntx );
		MOLOG.info("====> Environment==> {} ", moCntx.getEnvironment());
		
		CE01ColorAnimal oCEColorAnimal = (CE01ColorAnimal) moCntx.getBean("idCEColorAnimal");
		CE02LlamaAutowireNo oCELlama = (CE02LlamaAutowireNo) moCntx.getBean("idCELlama");
		CE03PumaAutowireByName oCEPuma = (CE03PumaAutowireByName) moCntx.getBean("idCEPuma");
		CE04CuyAutowireByType oCECuy = (CE04CuyAutowireByType) moCntx.getBean("idCECuy");
		CE05VizcachaAutowireConstructor oCEVizcacha = (CE05VizcachaAutowireConstructor) moCntx.getBean("idCEVizcacha");
		
		MOLOG.info("====> Created Instance ==> {} ", moCntx.getStartupDate());
		
		MOLOG.info("====> CEColorAnimal ==> {} ",oCEColorAnimal );
		MOLOG.info("====> CELlama ==> {} ",oCELlama );
		MOLOG.info("====> CEPuma==> {} ",oCEPuma );
		MOLOG.info("====> CECuy ==> {} ", oCECuy);
		MOLOG.info("====> CEVizcacha ==> {} ", oCEVizcacha );
		
		MOLOG.info("====> [ End - main(String[] args) ] <====");
	}

}
