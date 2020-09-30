package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE03PersonaBeanAnidado;

public class CV0303SeeBeanReferenciaNombre {
	private static final Logger LOG = LoggerFactory.getLogger("CV0303SeeBeanReferenciaNombre");
	public static void main(String[] args) {
		LOG.info("[EVL] Start ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context0303-beanReferenciaNombre.xml");
		
		CE03PersonaBeanAnidado oCEPersona = (CE03PersonaBeanAnidado) oCntx.getBean("personAnidado");
		
		LOG.info("[EVL] Context : {}", oCntx);
		LOG.info("[EVL] Instance CEPersona : {}", oCEPersona);
		
		LOG.info("[EVL] Oracion Persona : {}", oCEPersona.getId() + " " + oCEPersona.getNombre() + " " + oCEPersona.getPais().getNombre() + " " + oCEPersona.getPais().getCiudad().getNombre());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
