package pe.etg.bbva.spring5.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("pe.etg.bbva.spring5")

public class CG01AnotacionConfigOracle {
	private static Logger MOLOG = LoggerFactory.getLogger(CG01AnotacionConfigOracle.class);
	
	@Bean
	public DataSource dataSource() {
		MOLOG.info("=====> [EVL] Start method dataSource()");
		
		DriverManagerDataSource oDMDS = new DriverManagerDataSource();
		oDMDS.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		oDMDS.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		oDMDS.setUsername("dip");
		oDMDS.setPassword("Aemsa152027");
		MOLOG.info("=> [EVL] Datasource : {}", oDMDS.toString());
		
		MOLOG.info(" =====> [EVL] End method dataSource()");
		
		return oDMDS;
	}

}
