package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import pe.bbva.evalua.spring5.entity.CE02Afiliado;

/*
 * Caso 1: Definir un objeto con referencia Afiliado con Pais
 * Caso 2: Definir un objeto con referencia Afiliado con Pais y Ciudad
 */
public class CV02MostrarInyeccionObjetos {
	private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarInyeccionObjetos");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Revisando inyeccion dependencias por constructor");
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context02-inyeccion-objetos.xml");

		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		
		CE02Afiliado oAfiliado = oCntx.getBean(CE02Afiliado.class);
		LOG.info("[EVL] Instancia de Context : {}", oCntx);
		LOG.info("[EVL] Instancia de Afiliado : {}", oAfiliado);
		
		LOG.info("[EVL] Afiliado : {}", oAfiliado.getId() + " " + oAfiliado.getCodeAfiliado() + " " + oAfiliado.getNameAfiliado() + " " + oAfiliado.getPais().getNombre() + " " + oAfiliado.getPais().getCiudad().getNombre());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
