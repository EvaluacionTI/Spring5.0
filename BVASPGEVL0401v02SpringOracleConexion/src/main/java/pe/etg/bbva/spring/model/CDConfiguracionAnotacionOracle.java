package pe.etg.bbva.spring.model;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class CDConfiguracionAnotacionOracle {

	@Bean
    public DataSource dataSource() {
		DriverManagerDataSource oDMDS = new DriverManagerDataSource();
		oDMDS.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
		oDMDS.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		oDMDS.setUsername("system");
		oDMDS.setPassword("1234");
        
		return oDMDS;
		
	}
}
