package pe.etg.bbva.spring5.model;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
 * El SCAN de la base para identificar la implemantación del modelo está en este paquete
 */
@Configuration
@ComponentScan(basePackages="pe.etg.bbva.spring5.model")
public class CD0401v01ConfiguracionConexionAnotacionOracle {

	@Bean
    public DataSource dataSource() {
		DriverManagerDataSource oDMDS = new DriverManagerDataSource();
		oDMDS.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
		oDMDS.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		oDMDS.setUsername("DIP");
		oDMDS.setPassword("Aemsa152027");
        
		return oDMDS;
	}
}
