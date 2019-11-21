package pe.etg.bbva.evalua.spring5.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.evalua.spring5.entity.CE0201v01Persona;

/*
 *  
 */
@SpringBootApplication
@RestController
public class CV0201v01PersonaRestControllerInterno {

	public static void main(String[] args) {
		System.out.println("1. Para iniciar el servicio Rest se requieres @RestController");
		System.out.println("2. El mapping @RequestMapping para el url est� en la clase principal del m�tod listadoPersonas");
		SpringApplication.run(CV0201v01PersonaRestControllerInterno.class, args);
		System.out.println("3. Ejecutar en la url : localhost:8020/todos");		
	}
	
	@RequestMapping("/todos")
	public List<CE0201v01Persona> listadoPersonas(){
		ArrayList<CE0201v01Persona> oaListaPersonas = new ArrayList<>();
		
		oaListaPersonas.add(new CE0201v01Persona(1L, "Alex", "San Luis", 48, true));
		oaListaPersonas.add(new CE0201v01Persona(2L, "Esteban", "Zárate", 16, true));
		oaListaPersonas.add(new CE0201v01Persona(3L, "Illari", "Chilca", 3, false));
		oaListaPersonas.add(new CE0201v01Persona(4L, "Luis", "Chilca", 1, true));
		
		return oaListaPersonas;
	}

}
