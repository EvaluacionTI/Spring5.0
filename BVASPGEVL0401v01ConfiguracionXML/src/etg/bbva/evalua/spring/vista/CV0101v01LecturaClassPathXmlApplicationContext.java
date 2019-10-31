package etg.bbva.evalua.spring.vista;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import etg.bbva.evalua.spring.servicio.impl.CMHelloService;

public class CV0101v01LecturaClassPathXmlApplicationContext {

	public static void main(String[] args) {
		AbstractApplicationContext oCntx = new ClassPathXmlApplicationContext("springXMLConfig.xml");
		
		System.out.println("1. Lectura de SpringXMLConfig : " + oCntx.getId());
		
		CMHelloService oCMSaluda = oCntx.getBean("idCMHelloService", CMHelloService.class);
		System.out.println("2. Lectura de CMHelloService : " + oCMSaluda.getClass());
		
		System.out.println("3. Imprimir en consola : ");
		oCMSaluda.saludar();
		oCMSaluda.mensajeEntelgy();
		oCMSaluda.mensajeBbva();
		
		oCntx.close();
	}
}