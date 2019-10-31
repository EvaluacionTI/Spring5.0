package pe.etg.bbva.spring.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.bbva.architecture")
public class CVSpringBootJdbcOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CVSpringBootJdbcOracleApplication.class, args);
	}
}
