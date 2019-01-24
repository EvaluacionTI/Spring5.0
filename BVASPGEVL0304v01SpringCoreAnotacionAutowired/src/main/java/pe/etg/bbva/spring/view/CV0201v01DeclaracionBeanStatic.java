package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE0201v01BeanStatic;

public class CV0201v01DeclaracionBeanStatic {
private static Logger MOLOG = LoggerFactory.getLogger(CV0201v01DeclaracionBeanStatic.class);
	
	private static ApplicationContext moCntx;
	public static void main(String[] args) {
		
		MOLOG.info("====> [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0201v01-bean-static.xml");
		
		MOLOG.info("====> Contexto ==> {} ", moCntx );
		MOLOG.info("====> Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("====> Context ==> {}", moCntx );
		MOLOG.info("====> Environment==> {} ", moCntx.getEnvironment());
		
		CE0201v01BeanStatic oCEBeanStatic = (CE0201v01BeanStatic) moCntx.getBean("idCEBeanStatic");
		
		MOLOG.info("====> CE0201v01BeanStatic ==> {} ",oCEBeanStatic );

		MOLOG.info("====> [ End - main(String[] args) ] <====");
	}

}
