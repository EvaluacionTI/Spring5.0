package etb.bbva.evalua.spring.vista;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import etg.bbva.evalua.spring.modelo.CDSpringConfiguration;
import etg.bbva.evalua.spring.servicio.impl.CM0101v01ProductoServicioImplementar;

//@SpringBootApplication
public class CV0101v01ListaProducto {
	
	private static AbstractApplicationContext oCntx;

	public static void main(String[] args) {
		oCntx = new AnnotationConfigApplicationContext(CDSpringConfiguration.class);
		String sNombreBean = "idCI0101v01ProductoServicio";

		System.out.println("AbstractApplicationContext -----> " + oCntx);
		System.out.println("Bean definido sin XML -----> " + oCntx.getBean(sNombreBean));
		System.out.println("Identificador de bean -----> " + oCntx.getId());
		System.out.println("Nombre bean -----> " + oCntx.getDisplayName());
		System.out.println("Fecha -----> " + oCntx.getStartupDate());
		
		CM0101v01ProductoServicioImplementar oCMProductoServicio = oCntx.getBean(sNombreBean, CM0101v01ProductoServicioImplementar.class);
		
		System.out.println("Instancia del Bean " + oCMProductoServicio);
		System.out.println("Cantidad de Productos " + oCMProductoServicio.listaProductos().size());
		System.out.println(" Productos 1 :" + oCMProductoServicio.listaProductos().get(0).getDescription());
		System.out.println(" Productos 2 :" + oCMProductoServicio.listaProductos().get(1).getDescription());
		System.out.println(" Productos 3 :" + oCMProductoServicio.listaProductos().get(2).getDescription());

		oCntx.close();
	}

}
