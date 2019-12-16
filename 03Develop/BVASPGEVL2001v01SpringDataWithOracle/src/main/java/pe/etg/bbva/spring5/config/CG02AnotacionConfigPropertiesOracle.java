package pe.etg.bbva.spring5.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pe.etg.bbva.spring5.entity.CE01TipoPlan;

@Configuration
@ComponentScan("pe.etg.bbva.spring5")

//Load to Environment
@PropertySources({@PropertySource("classpath:database/ds-oracle.properties")})
public class CG02AnotacionConfigPropertiesOracle {
	private static Logger MOLOG = LoggerFactory.getLogger(CG02AnotacionConfigPropertiesOracle.class);
	
	//1.0 Inyecto para el manejod de las variables de entorno
	@Autowired
	private Environment oEnv;
	
	// 1.1 Declaro el Bean de conexión
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		MOLOG.info("=====> [EVL] Start method getDataSource()");
		
		DriverManagerDataSource oDMDS = new DriverManagerDataSource();
		MOLOG.info("=> [EVL] Datasource : {}", oDMDS);
		
		oDMDS.setDriverClassName(oEnv.getProperty("ds.oracle.driver"));
		oDMDS.setUrl(oEnv.getProperty("ds.oracle.url"));
		oDMDS.setUsername(oEnv.getProperty("ds.oracle.username"));
		oDMDS.setPassword(oEnv.getProperty("ds.oracle.password"));
		MOLOG.info("=> [EVL] Datasource : {}", oDMDS.toString());
		
		MOLOG.info(" =====> [EVL] End method getDataSource()");
		
		return oDMDS;
	}
	
	// 2.0 Declaro el Bean de la Clase Entidad Tipo Plan
	@Bean(name="oCEAnotacionTipoPlan")
	public CE01TipoPlan getCETipoPlan() {
		return new CE01TipoPlan();
	}
	
	// 3.0 Declaro el Bean de la interface del Tipo Plan

}
