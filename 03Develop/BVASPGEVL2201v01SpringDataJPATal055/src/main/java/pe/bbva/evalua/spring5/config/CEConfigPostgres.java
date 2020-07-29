package pe.bbva.evalua.spring5.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class CEConfigPostgres {
	private static final Logger LOG = LoggerFactory.getLogger("CEConfigPostgres");
	
	@Bean
	public DataSource dataSource() {
		LOG.info("[EVL] =====[ Start dataSource ]=====");
		
		DriverManagerDataSource oDataSource = new DriverManagerDataSource();
		LOG.info("[EVL] DriverManagerDataSource : {}", oDataSource);
		oDataSource.setDriverClassName("org.postgresql.Driver");
		oDataSource.setUrl("jdbc:postgresql://localhost:5432/aemsadesarrollo");
		oDataSource.setUsername("postgres");
		oDataSource.setPassword("aemsa152027");
		LOG.info("[EVL] new DriverManagerDataSource : {}", oDataSource);
		return oDataSource;
	}
}
