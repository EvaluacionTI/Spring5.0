package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE06BeanStatic;

public class CV02DeclaracionBeanStatic {
private static Logger MOLOG = LoggerFactory.getLogger(CV02DeclaracionBeanStatic.class);
	
	private static ApplicationContext moCntx;
	public static void main(String[] args) {
		
		MOLOG.info("====> [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring-bean-static.xml");
		
		MOLOG.info("====> Contexto ==> {} ", moCntx );
		MOLOG.info("====> Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("====> Context ==> {}", moCntx );
		MOLOG.info("====> Environment==> {} ", moCntx.getEnvironment());
		
		CE06BeanStatic oCEBeanStatic = (CE06BeanStatic) moCntx.getBean("idCEBeanStatic");
		
		MOLOG.info("====> CE06BeanStatic ==> {} ",oCEBeanStatic );

		MOLOG.info("====> [ End - main(String[] args) ] <====");
	}

}
