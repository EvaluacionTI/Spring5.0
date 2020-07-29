package pe.bbva.evalua.spring5.view;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.config.CEConfigPostgres;

public class CV02MostrarConfigPostgres {
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarConfigPostgres");

	public static void main(String[] args) throws SQLException {
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[EVL] Instancia Context : {}", oCntx);

		oCntx.register(CEConfigPostgres.class);
		oCntx.refresh();
		
		DataSource oDS = (DataSource) oCntx.getBean("dataSource");
		Connection oCnx = oDS.getConnection();
		LOG.info("[EVL] Instancia DataSource : {}", oCnx.isValid(0));

		((ConfigurableApplicationContext) oCntx).close();	
	}

}
