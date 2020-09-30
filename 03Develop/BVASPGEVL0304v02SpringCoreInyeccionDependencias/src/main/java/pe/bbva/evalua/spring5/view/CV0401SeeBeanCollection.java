package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE0202Ciudad;
import pe.bbva.evalua.spring5.entity.CE04PersonaBeanCollection;

public class CV0401SeeBeanCollection {
	private static final Logger LOG = LoggerFactory.getLogger("CV0401SeeBeanCollection");
	public static void main(String[] args) {
		LOG.info("[EVL] Start ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context0401-beanCollection.xml");
		
		CE04PersonaBeanCollection oCEPersona = (CE04PersonaBeanCollection) oCntx.getBean("idCE04Persona");
		
		LOG.info("[EVL] Context : {}", oCntx);
		LOG.info("[EVL] Instance CEPersona : {}", oCEPersona);
		
		for (CE0202Ciudad oCiudad: oCEPersona.getPais().getListCiudad()) {
			LOG.info("[EVL] Ciudad : {}", oCiudad.getNombre());
		}
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
