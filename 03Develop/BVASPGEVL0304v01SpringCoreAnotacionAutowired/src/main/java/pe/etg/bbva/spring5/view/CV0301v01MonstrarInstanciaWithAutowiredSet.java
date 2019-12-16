package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.controller.CC0301v01IntanciarWithSetAnimalAutowired;
import pe.etg.bbva.spring5.entity.CE0301v01AnimalAutowired;

public class CV0301v01MonstrarInstanciaWithAutowiredSet {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0301v01MonstrarInstanciaWithAutowiredSet.class);
	private static ApplicationContext oCntx;
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new ClassPathXmlApplicationContext("classpath:/spring5/spring0301v01-animal-autowired.xml");

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0301v01AnimalAutowired oCEAnimal = (CE0301v01AnimalAutowired) oCntx.getBean("idCEAnimal");
		CC0301v01IntanciarWithSetAnimalAutowired oCCAnimal = (CC0301v01IntanciarWithSetAnimalAutowired) oCntx.getBean("idCEAutowiredSet");
		
		MOLOG.info("[EVL] Instancia CEAnimal    : {} {} {} ", oCEAnimal, oCEAnimal.getBasePiel(), oCEAnimal.getTexturaPiel());
		// Inyectando con set para tener la instanacia de la clase
		oCCAnimal.setoCEAnimal(oCEAnimal);
		MOLOG.info("[EVL] Instancia CCAnimal    : {} {} ", oCCAnimal, oCCAnimal.mostrar());
		
//		MOLOG.info("[EVL] Objeto y atributo   : {} {} ", oCEAnimal, oCEAnimal.());
		
		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	

	}

}
