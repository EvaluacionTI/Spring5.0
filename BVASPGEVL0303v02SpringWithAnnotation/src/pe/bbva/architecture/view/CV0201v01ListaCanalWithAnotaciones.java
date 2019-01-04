package pe.bbva.architecture.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.architecture.model.CDConfiguracionCanal;
import pe.etg.bbva.spring.entity.CECanal;

public class CV0201v01ListaCanalWithAnotaciones {
	
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new AnnotationConfigApplicationContext(CDConfiguracionCanal.class);
		
		String sNombreBean = "oCECanal";
		
		System.out.println("AbstractApplicationContext -----> " + oCntx);
		System.out.println("Bean definido anotaciones  -----> " + oCntx.getBean(sNombreBean));
		System.out.println("Identificador de bean -----> " + oCntx.getId());
		System.out.println("Nombre bean -----> " + oCntx.getDisplayName());
		System.out.println("Fecha -----> " + oCntx.getStartupDate());
		
		CECanal oCanal = (CECanal) oCntx.getBean(sNombreBean);
		
		System.out.println("Instancia Canal -----> " + oCanal);
		System.out.println("Id Canal -----> " + oCanal.getId());
		System.out.println("Descripcion Canal -----> " + oCanal.getNombre());
		
	}
}
