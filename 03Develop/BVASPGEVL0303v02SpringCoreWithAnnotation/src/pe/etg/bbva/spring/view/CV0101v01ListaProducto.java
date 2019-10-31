package pe.etg.bbva.spring.view;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pe.etg.bbva.spring.model.CD0101v01SpringConfiguration;
import pe.etg.bbva.spring.service.impl.CM0101v01ProductoServicioImplementar;

//@SpringBootApplication
public class CV0101v01ListaProducto {
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01ListaProducto.class); 
	private static AbstractApplicationContext oCntx;

	public static void main(String[] args) {
		MOLOG.info("[EVL] Iniciando ");
		oCntx = new AnnotationConfigApplicationContext(CD0101v01SpringConfiguration.class);
		MOLOG.info("[EVL] Contexto {}", oCntx);
		String sNombreBean = "idCI0101v01ProductoServicio";

		System.out.println("AbstractApplicationContext -----> " + oCntx);
		System.out.println("Bean definido sin XML -----> " + oCntx.getBean(sNombreBean));
		System.out.println("Identificador de bean -----> " + oCntx.getId());
		System.out.println("Nombre bean -----> " + oCntx.getDisplayName());
		System.out.println("Fecha -----> " + oCntx.getStartupDate());
		
		CM0101v01ProductoServicioImplementar oCMProductoServicio = oCntx.getBean(sNombreBean, CM0101v01ProductoServicioImplementar.class);
		MOLOG.info("[EVL] oCMProductoServicio {}", oCMProductoServicio);
		System.out.println("Instancia del Bean " + oCMProductoServicio);
		System.out.println("Cantidad de Productos " + oCMProductoServicio.listaProductos().size());
		System.out.println(" Productos 1 :" + oCMProductoServicio.listaProductos().get(0).getDescription());
		System.out.println(" Productos 2 :" + oCMProductoServicio.listaProductos().get(1).getDescription());
		System.out.println(" Productos 3 :" + oCMProductoServicio.listaProductos().get(2).getDescription());
		System.out.println(" Productos 4 :" + oCMProductoServicio.listaProductos().get(3).getDescription());

		oCntx.close();
	}

}
