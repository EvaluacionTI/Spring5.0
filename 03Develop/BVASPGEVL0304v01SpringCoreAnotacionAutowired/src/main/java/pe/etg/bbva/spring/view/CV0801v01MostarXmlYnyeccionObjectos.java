package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.controller.CC0301v01IntanciarWithSetAnimalAutowired;
import pe.etg.bbva.spring.entity.CE0301v01AnimalAutowired;

public class CV0801v01MostarXmlYnyeccionObjectos {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0801v01MostarXmlYnyeccionObjectos.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0301v01-animal-autowired.xml");

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0301v01AnimalAutowired oCEAnimal = (CE0301v01AnimalAutowired) oCntx.getBean("CEAnimal");
		
		MOLOG.info("[EVL] Instancia Animal    : {} ", oCEAnimal);
		
		CC0301v01IntanciarWithSetAnimalAutowired oCEAutowired = (CC0301v01IntanciarWithSetAnimalAutowired) oCntx.getBean("idCEAutowiredSet");
		
		oCEAnimal.setBasePiel("CANELA");
		oCEAnimal.setTexturaPiel("blanca");
		oCEAutowired.setoCEAnimal(oCEAnimal);
		MOLOG.info("[EVL] Inyeccion Controlador : {} {} ", oCEAutowired, oCEAutowired.getoCEAnimal());
		MOLOG.info("[EVL] Objeto Person Pais  : {} {} {} {} {} ", oCEAutowired, oCEAutowired.getoCEAnimal(), oCEAutowired.getoCEAnimal().getBasePiel(), oCEAutowired.getoCEAnimal().getTexturaPiel());
		
		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}
}
