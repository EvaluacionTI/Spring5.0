package pe.bbva.evalua.spring5.view.constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE01Afiliado;

/*
 * Caso 1: Instancias a la clase CE01Afiliado sin constructor
 * Caso 2: Instancias a la clase CE01Afiliado con constructor sin parametros
 * Caso 3: Instancias a la clase CE01Afiliado con constructor 1 parametros
 * Caso 4: Instancias a la clase CE01Afiliado con constructor 2 parametros
 * Caso 5: Instancias a la clase CE01Afiliado con constructor 3 parametros
 */
public class CV01MostrarInyeccionConstructor {
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarInyeccionConstructor");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revisando inyeccion dependencias por constructor");
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-constructor.xml");

		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		
		CE01Afiliado oAfiliado = oCntx.getBean(CE01Afiliado.class);
		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		LOG.info("[EVL] Instancia de Afiliado : {}", oAfiliado);
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
