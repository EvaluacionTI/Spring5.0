package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE0705PersonaCycleLifePostPreInterface;

public class CV0705SeeBeanCycleLifeAllInterface {
	private static final Logger LOG = LoggerFactory.getLogger("CV0705SeeBeanCycleLifeAllInterface");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Start");

		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context0705-beanCycleLifePostPreInterface.xml");

		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		
		CE0705PersonaCycleLifePostPreInterface oAfiliado = oCntx.getBean(CE0705PersonaCycleLifePostPreInterface.class);
		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		LOG.info("[EVL] Instancia de Afiliado : {}", oAfiliado);
	
		LOG.info("[EVL] Afiliado : {}", oAfiliado.getId() + " " + oAfiliado.getNombre() + " " + oAfiliado.getApodo());
		LOG.info("[EVL] Afiliado Pais : {}", oAfiliado.getId() + " " + oAfiliado.getNombre() + " " + oAfiliado.getApodo() + " " + oAfiliado.getPais().getNombre());
		
		LOG.info("[EVL] Afiliado Pais Ciudad : {}", oAfiliado.getId() + " " + oAfiliado.getNombre() + " " + oAfiliado.getApodo() + " " + oAfiliado.getPais().getNombre() + " " + oAfiliado.getPais().getCiudad().getNombre());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
