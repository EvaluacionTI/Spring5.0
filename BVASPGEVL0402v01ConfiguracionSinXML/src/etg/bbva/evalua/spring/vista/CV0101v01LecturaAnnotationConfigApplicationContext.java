package etg.bbva.evalua.spring.vista;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import etg.bbva.evalua.spring.modelo.CDSpringConfiguration;
import etg.bbva.evalua.spring.servicio.impl.CMHelloService;

public class CV0101v01LecturaAnnotationConfigApplicationContext {

	public static void main(String[] args) {
		AbstractApplicationContext oCntx = new AnnotationConfigApplicationContext(CDSpringConfiguration.class);
		String sNombreBean = "idCIHelloService";
		System.out.println("AbstractApplicationContext -----> " + oCntx);
		System.out.println("Bean definido sin XML -----> " + oCntx.getBean(sNombreBean));
		System.out.println("Identificador de bean -----> " + oCntx.getId());
		System.out.println("Nombre bean -----> " + oCntx.getDisplayName());
		System.out.println("Fecha -----> " + oCntx.getStartupDate());
		
		CMHelloService oCMSaluda = oCntx.getBean(sNombreBean, CMHelloService.class);

		oCMSaluda.saludar();
		oCMSaluda.mensajeEntelgy();
		oCMSaluda.mensajeBbva();
		
		oCntx.close();
	}
}