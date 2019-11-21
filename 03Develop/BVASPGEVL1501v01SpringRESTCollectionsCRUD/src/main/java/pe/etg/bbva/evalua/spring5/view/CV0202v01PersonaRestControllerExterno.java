package pe.etg.bbva.evalua.spring5.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * A partir de la versi�n 1.2 de Spring se define:
 * @SpringBootApplication es equivalente a utilizar @Configuration + @EnableAutoConfiguration + @ComponentScan
 * 
 * @Configuration: Indica que esta es una clase usada para configurar el contenedor Spring.
 * @ComponentScan: Escanea los paquetes de nuestro proyecto en busca de los componentes que hayamos creado, ellos son,  
 * 				   las clases que utilizan las siguientes anotaciones: @Component, @Service, @Controller, @Repository. 
 */
@SpringBootApplication
@ComponentScan("pe.etg.bbva")
public class CV0202v01PersonaRestControllerExterno {

	public static void main(String[] args) {
		System.out.println("1. Para iniciar el servicio Rest se requieres @RestController");
		System.out.println("2. El mapping @RequestMapping para el url está en la clase CC0102v01Persona y CC0101v01Saludo");
		
		SpringApplication.run(CV0202v01PersonaRestControllerExterno.class, args);
		System.out.println("3. Ejecutar en la url : localhost:8020/listado");
		System.out.println("3. Ejecutar en la url : localhost:8020/hello");
	}
}
