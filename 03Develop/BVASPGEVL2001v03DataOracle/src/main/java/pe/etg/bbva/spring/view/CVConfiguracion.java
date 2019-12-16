package pe.etg.bbva.spring.view;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class CVConfiguracion {

	private static final Logger MOLOG = LoggerFactory.getLogger(CVConfiguracion.class);
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource moDS = new DriverManagerDataSource();
		
		moDS.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
		moDS.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		moDS.setUsername("sys");
		moDS.setPassword("aemsa152027");
		
		MOLOG.info("=====> {} ", moDS);
		
		return moDS;
		
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext moContext = new AnnotationConfigApplicationContext(CVConfiguracion.class);

		moContext.getBean(CDCanalClient.class).process();
		moContext.close();

	}

}
