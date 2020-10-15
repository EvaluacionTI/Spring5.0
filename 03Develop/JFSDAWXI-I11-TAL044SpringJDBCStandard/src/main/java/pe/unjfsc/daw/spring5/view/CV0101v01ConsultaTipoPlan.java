package pe.unjfsc.daw.spring5.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pe.unjfsc.daw.spring5.entity.CE01TipoPlan;

public class CV0101v01ConsultaTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0101v01ConsultaTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	
	public static void main(String[] args) throws SQLException {
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/database/spring-postgres.xml");
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("idDriverManagerDataSource");
		Connection oConnection = oDataSource.getConnection();
		PreparedStatement oPS = oConnection.prepareStatement("SELECT * FROM eii.CTBt14_tipo_plan");
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		ResultSet oRS = oPS.executeQuery();

		MOLOG.info("=> [EVL] ConfigurableApplicationContext : {}", moCntx);
		MOLOG.info("=> [EVL] DriverManagerDataSource : {}", oDataSource);		
		MOLOG.info("=> [EVL] Connection : {}", oConnection);
		MOLOG.info("=> [EVL] PreparedStatement : {}", oPS);
		MOLOG.info("=> [EVL] ResultSet	: {}", oRS);
		MOLOG.info("=> [EVL] Tipo Plan 	: {}", oCETipoPlan.toString());

		while (oRS.next()) {
			oCETipoPlan.setCodigoTipoPlan(oRS.getString(1));
			oCETipoPlan.setCodigoEmpresa(oRS.getString(2));
			oCETipoPlan.setCodigoIdioma(oRS.getString(3));
			oCETipoPlan.setAbreviatura(oRS.getString(4));
			oCETipoPlan.setDescripcion(oRS.getString(5));
			oCETipoPlan.setSiNoVisualizar(oRS.getBoolean(6));
			oCETipoPlan.setSiNoEditar(oRS.getBoolean(7));
			oCETipoPlan.setSiNoAnula(oRS.getBoolean(8));
			oCETipoPlan.setSiNoElimina(oRS.getBoolean(9));
			oCETipoPlan.setSiNoDefault(oRS.getBoolean(10));
			oCETipoPlan.setSiNoActivo(oRS.getBoolean(11));			
			oCETipoPlan.setUsuarioNuevo(oRS.getString(12));
			oCETipoPlan.setFechaAlta(oRS.getDate(13));
			oCETipoPlan.setUsuarioUltimaModificacion(oRS.getString(14));
			oCETipoPlan.setFechaUltimaModificacion(oRS.getDate(15));
			MOLOG.info("=> [EVL] Tipo Plan{}", oCETipoPlan.toString());
		}
		oRS.close();
		oConnection.close();
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
