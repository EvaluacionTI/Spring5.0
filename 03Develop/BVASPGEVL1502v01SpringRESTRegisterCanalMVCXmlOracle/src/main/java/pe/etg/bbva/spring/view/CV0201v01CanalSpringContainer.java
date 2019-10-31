package pe.etg.bbva.spring.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE01Canal;

public class CV0201v01CanalSpringContainer {

	public static void main (String[] psArgs) {
		// Lectura del contenedor por medio de XML
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring/application-config.xml");
		
		System.out.println(oCntx.getStartupDate());
		
		// Invocar al bean o instancias
		CE01Canal oCanal = (CE01Canal) oCntx.getBean("idCanal");
		
		System.out.println("La clase CECanal =" + oCanal);

		System.out.println("Abreviatura : " + oCanal.getAbreviatura());
		
		oCanal.setId(400);
		oCanal.setCodigo("PC");
		oCanal.setAbreviatura("PC");
		oCanal.setDescripcion("PIC");
		
		System.out.println("Abreviatura : " + oCanal.getAbreviatura());
		System.out.println("Nuevo objeto : " + oCanal);
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
