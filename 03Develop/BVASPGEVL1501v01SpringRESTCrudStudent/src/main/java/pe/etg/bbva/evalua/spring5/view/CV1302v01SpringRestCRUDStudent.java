package pe.etg.bbva.evalua.spring5.view;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import pe.etg.bbva.evalua.spring5.entity.CEStudent;
import pe.etg.bbva.evalua.spring5.model.CMStudentRepository;


@SpringBootApplication
@ComponentScan("pe.etg.bbva.spring")
public class CV1302v01SpringRestCRUDStudent {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV1302v01SpringRestCRUDStudent.class);
	private static SpringApplication moApplicationSpring;
	
	/*
	 * La CommanLineRunner interfaz se usa comúnmente para ejecutar algunas tareas al inicio de una aplicación Spring Boot.
	 * CommanLineRunner es una interfaz funcional que tiene un método de devolución de llamada, run (). 
	 */
	public static void main(String[] args) {
		MOLOG.info("=====> Start method : main(String[] args) <===== ");
		
		moApplicationSpring = new SpringApplication(CV1302v01SpringRestCRUDStudent.class);
		
		moApplicationSpring.run(args);
		MOLOG.info("=> [GET ] http://localhost:8020/students");
		MOLOG.info("=> [GET ] http://localhost:8020/students/104");
		MOLOG.info("=> [POST] http://localhost:8020/students/");
		MOLOG.info("=> [PUT ] http://localhost:8020/students/");
		MOLOG.info("=> [DEL ] http://localhost:8020/students/104");
		
		MOLOG.info("=====> End method : main(String[] args) <===== ");
	}
	
	
	@Bean
	CommandLineRunner cargaStudent(CMStudentRepository poCMRepository) {
		MOLOG.info("=====> Start method : cargaStudent(CMStudentRepository poCMRepository) <===== ");
		
		return (oEvent)->{
			MOLOG.info("=> CommandLineRunner, tiene como parámetros : {}", Arrays.toString(oEvent));
			
			poCMRepository.save(new CEStudent(16L, "Esteban", "Díaz", "2002"));
			poCMRepository.save(new CEStudent(04L, "Illari", "Díaz", "2014"));
			poCMRepository.save(new CEStudent(01L, "Alex", "Díaz", "2017"));
			poCMRepository.save(new CEStudent(00L, "Isabela", "Díaz", "2018"));
			
			MOLOG.info("=====> End method : (CMStudentRepository poCMRepository) <===== ");
		};
		
	}
}



