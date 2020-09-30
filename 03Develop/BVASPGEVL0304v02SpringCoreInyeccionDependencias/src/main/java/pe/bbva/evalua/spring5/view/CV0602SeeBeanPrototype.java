package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE03PersonaBeanAnidado;

public class CV0602SeeBeanPrototype {
	private static final Logger LOG = LoggerFactory.getLogger("CV0602SeeBeanPrototype");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Start");
		LOG.info("[EVL] Permite diferentes instancias");
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context0602-beanPrototype.xml");

		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		
		CE03PersonaBeanAnidado oAfiliado = oCntx.getBean(CE03PersonaBeanAnidado.class);
		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		LOG.info("[EVL] Instancia de Afiliado : {}", oAfiliado);
	
		LOG.info("[EVL] Afiliado : {}", oAfiliado.getId() + " " + oAfiliado.getNombre() + " " + oAfiliado.getApodo());
		LOG.info("[EVL] Afiliado Pais : {}", oAfiliado.getId() + " " + oAfiliado.getNombre() + " " + oAfiliado.getApodo() + " " + oAfiliado.getPais().getNombre());
		
		LOG.info("[EVL] Afiliado Pais Ciudad : {}", oAfiliado.getId() + " " + oAfiliado.getNombre() + " " + oAfiliado.getApodo() + " " + oAfiliado.getPais().getNombre() + " " + oAfiliado.getPais().getCiudad().getNombre());

		
		CE03PersonaBeanAnidado oAfiliado1 = oCntx.getBean(CE03PersonaBeanAnidado.class);
		LOG.info("[EVL] Instancia de Afiliado1 : {}", oAfiliado1);
		LOG.info("[EVL] Afiliado1 Pais Ciudad : {}", oAfiliado1.getId() + " " + oAfiliado1.getNombre() + " " + oAfiliado1.getApodo() + " " + oAfiliado1.getPais().getNombre() + " " + oAfiliado1.getPais().getCiudad().getNombre());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
