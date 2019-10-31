package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pe.etg.bbva.spring.entity.CE0201v01Canal;
import pe.etg.bbva.spring.model.CD0201v01ConfiguracionCanal;

public class CV0201v01ListaCanalWithAnotaciones {
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0201v01ListaCanalWithAnotaciones.class); 
	private static AbstractApplicationContext oCntx;

	public static void main(String[] args) {
		MOLOG.info("[EVL] Iniciando ");
		oCntx = new AnnotationConfigApplicationContext(CD0201v01ConfiguracionCanal.class);
		
		String sNombreBean = "oCECanal";
		
		System.out.println("AbstractApplicationContext -----> " + oCntx);
		System.out.println("Bean definido anotaciones  -----> " + oCntx.getBean(sNombreBean));
		System.out.println("Identificador de bean -----> " + oCntx.getId());
		System.out.println("Nombre bean -----> " + oCntx.getDisplayName());
		System.out.println("Fecha -----> " + oCntx.getStartupDate());
		
		CE0201v01Canal oCanal = (CE0201v01Canal) oCntx.getBean(sNombreBean);
		
		System.out.println("Instancia Canal -----> " + oCanal);
		System.out.println("Id Canal -----> " + oCanal.getId());
		System.out.println("Descripcion Canal -----> " + oCanal.getNombre());
		MOLOG.info("[EVL] Cerrando ");
		oCntx.close();
		
	}
}
