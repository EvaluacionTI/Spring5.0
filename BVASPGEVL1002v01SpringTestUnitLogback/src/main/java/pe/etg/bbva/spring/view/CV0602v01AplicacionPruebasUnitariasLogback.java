package pe.etg.bbva.spring.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.etg.bbva.spring.component.CCComponent1;
import pe.etg.bbva.spring.component.CCComponent2;

@SpringBootApplication
public class CV0602v01AplicacionPruebasUnitariasLogback {

	public static void main(String[] args) {
		SpringApplication.run(CV0602v01AplicacionPruebasUnitariasLogback.class, args);
		
		CCComponent1 oObjeto = new CCComponent1();
		oObjeto.configuration();
		oObjeto.killed();
		
		CCComponent2 oObjeto2 = new CCComponent2();
		oObjeto2.configuration();
		oObjeto2.killed();
	}
}
