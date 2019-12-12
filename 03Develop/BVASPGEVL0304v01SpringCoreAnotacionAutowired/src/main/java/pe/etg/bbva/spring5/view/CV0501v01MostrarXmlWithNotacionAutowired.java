package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE0501v01ColorAnimal;
import pe.etg.bbva.spring5.entity.CE0502v01ToroConstructor;
import pe.etg.bbva.spring5.entity.CE0503v01ToroSetter;
import pe.etg.bbva.spring5.entity.CE0504v01ToroField;

public class CV0501v01MostrarXmlWithNotacionAutowired {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0501v01MostrarXmlWithNotacionAutowired.class);
	
	private static ApplicationContext moCntx;
	
	public static void main(String[] args) {
		MOLOG.info("====> [ Start - main(String[] args) ] <====");
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0501v01-declarar-anotacion-autowired.xml");
		
		MOLOG.info("====> Contexto ==> {} ", moCntx );
		MOLOG.info("====> Number Beans ==> {}", moCntx.getBeanDefinitionNames().length );
		MOLOG.info("====> Context ==> {}", moCntx );
		MOLOG.info("====> Environment==> {} ", moCntx.getEnvironment());
		
		CE0501v01ColorAnimal oCEColor = (CE0501v01ColorAnimal) moCntx.getBean("idCEAnimal");
		CE0502v01ToroConstructor oCEToroCon = moCntx.getBean("idCEToroConstructor", CE0502v01ToroConstructor.class );
		CE0503v01ToroSetter oCEToroSet = (CE0503v01ToroSetter) moCntx.getBean("idCEToroSetter");
		CE0504v01ToroField oCEToroFie = moCntx.getBean("idCEToroField", CE0504v01ToroField.class);

		MOLOG.info("====> Created Instance ==> {} ", moCntx.getStartupDate());

		MOLOG.info("====> CE0503v01ToroSetter ==> {} ",oCEToroSet );
		MOLOG.info("====> CE0502v01ToroConstructor ==> {} ",oCEToroCon );
		MOLOG.info("====> CE0504v01ToroField ==> {} ",oCEToroFie );

		oCEColor.setBasePiel("Black");
		oCEColor.setTexturaPiel("Fino");
		
		oCEToroSet.setNombre("Asignando por Setter una instancia");
		oCEToroSet.setColor(oCEColor);

		MOLOG.info("====> Instancia con Setter ==> {} ",oCEToroSet );
		
		oCEColor = new CE0501v01ColorAnimal();
		oCEColor.setBasePiel("Brown");
		oCEColor.setTexturaPiel("Aspero");
		
		oCEToroCon.setNombre("Asignando por Constructor");
		oCEToroCon.setColor(oCEColor);
		
		MOLOG.info("====> CE0502v01ToroConstructor ==> {} ",oCEToroCon );
		
		oCEColor = new CE0501v01ColorAnimal();
		oCEColor.setBasePiel("Yellow");
		oCEColor.setTexturaPiel("Grumoso");
		
		oCEToroFie.setNombre("Asignando por Field");
		oCEToroFie.setColor(oCEColor);
		
		MOLOG.info("====> CE0504v01ToroField ==> {} ",oCEToroFie );
		
		MOLOG.info("====> [ End - main(String[] args) ] <====");		
	}

}
