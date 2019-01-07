package pe.etg.bbva.spring.view.formaI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE01ColorAnimal;
import pe.etg.bbva.spring.entity.formaI.CE01ToroSetter;
import pe.etg.bbva.spring.entity.formaI.CE02ToroConstructor;
import pe.etg.bbva.spring.entity.formaI.CE03ToroField;
import pe.etg.bbva.spring.view.CVMostrarContextWithPropertyAutowire;

public class CVMostrarContextWithNotacionAutowired {
	private static Logger MOLOG = LoggerFactory.getLogger(CVMostrarContextWithPropertyAutowire.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("====> [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring-anotacion-autowired.xml");
		
		MOLOG.info("====> Contexto ==> {} ", moCntx );
		MOLOG.info("====> Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("====> Context ==> {}", moCntx );
		MOLOG.info("====> Environment==> {} ", moCntx.getEnvironment());
		
		CE01ToroSetter oCEToroSet = (CE01ToroSetter) moCntx.getBean("idCEToroSetter");
		CE02ToroConstructor oCEToroCon = moCntx.getBean("idCEToroConstructor", CE02ToroConstructor.class );
		CE03ToroField oCEToroFie = moCntx.getBean("idCEToroField", CE03ToroField.class);

		MOLOG.info("====> Created Instance ==> {} ", moCntx.getStartupDate());

		MOLOG.info("====> CE01ToroSetter ==> {} ",oCEToroSet );
		MOLOG.info("====> CE02ToroConstructor ==> {} ",oCEToroCon );
		MOLOG.info("====> CE03ToroField ==> {} ",oCEToroFie );

		CE01ColorAnimal oCEColor = new CE01ColorAnimal();
		
		oCEColor.setBasePiel("Black");
		oCEColor.setTexturaPiel("Fino");
		oCEToroSet.setNombre("Asignando por Setter una instancia");
		oCEToroSet.setColor(oCEColor);
		

		MOLOG.info("====> Instancia con Setter ==> {} ",oCEToroSet );
		
		oCEColor = new CE01ColorAnimal();
		oCEColor.setBasePiel("Brown");
		oCEColor.setTexturaPiel("Aspero");
		
		oCEToroCon.setNombre("Asignando por Constructor");
		oCEToroCon.setColor(oCEColor);
		
		MOLOG.info("====> CE02ToroConstructor ==> {} ",oCEToroCon );
		
		oCEColor = new CE01ColorAnimal();
		oCEColor.setBasePiel("Yellow");
		oCEColor.setTexturaPiel("Grumoso");
		
		oCEToroFie.setNombre("Asignando por Field");
		oCEToroFie.setColor(oCEColor);
		
		MOLOG.info("====> CE03ToroField ==> {} ",oCEToroFie );
		
		MOLOG.info("====> [ End - main(String[] args) ] <====");		
	}

}
