package pe.unjfsc.daw.spring.vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring.entidad.CEAlumno;

public class CV05ContenedorSpring {

	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("pe/unjfsc/daw/spring/xml/spring-context.xml");
		
		System.out.println("Contenedor Spring : " + oCntx);

		CEAlumno oAlumno = (CEAlumno) oCntx.getBean("idCEAlumno");

		System.out.println("Instancia con datos del bean : " + oAlumno.toString());
		
		//Declarando un nuevo objeto
		
		oAlumno.setCodigo("82738393");
		oAlumno.setNumeroDNI("838383");
		System.out.println("Datos de otro bean u objeto : " + oAlumno.toString());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
