package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE05AfiliadoAutowire;

public class CV0501SeeBeanAutowireByName {
	private static final Logger LOG = LoggerFactory.getLogger("CV0501SeeBeanAutowireByName");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Start");
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context0501-beanAutowireByName.xml");

		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		
		CE05AfiliadoAutowire oAfiliado = oCntx.getBean(CE05AfiliadoAutowire.class);
		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		LOG.info("[EVL] Instancia de Afiliado : {}", oAfiliado);
	
		LOG.info("[EVL] Afiliado : {}", oAfiliado.getId() + " " + oAfiliado.getCodeAfiliado() + " " + oAfiliado.getNameAfiliado());
		LOG.info("[EVL] Afiliado Pais : {}", oAfiliado.getId() + " " + oAfiliado.getCodeAfiliado() + " " + oAfiliado.getNameAfiliado() + " " + oAfiliado.getPais().getNombre());
		
		LOG.info("[EVL] Afiliado Pais Ciudad : {}", oAfiliado.getId() + " " + oAfiliado.getCodeAfiliado() + " " + oAfiliado.getNameAfiliado() + " " + oAfiliado.getPais().getNombre() + " " + oAfiliado.getPais().getCiudad().getNombre());
				
		((ConfigurableApplicationContext) oCntx).close();
	}

}
