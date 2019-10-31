package pe.etg.bbva.spring.view;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties("oracle")
public class Bvaspgevl0401v01SpringDataWithOracleApplication {

	@Autowired
	private static DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(Bvaspgevl0401v01SpringDataWithOracleApplication.class, args);
		
		System.out.println("DATASOURCE = " + dataSource);
	}

}

