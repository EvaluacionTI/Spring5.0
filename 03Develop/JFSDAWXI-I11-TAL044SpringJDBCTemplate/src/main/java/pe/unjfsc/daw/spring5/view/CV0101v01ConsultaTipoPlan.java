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
import pe.unjfsc.daw.spring5.model.CD01ConstanteSQL;


// Revisión con una consulta a bd a modo de prueba implementado con Jdbc Standard.
public class CV0101v01ConsultaTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0101v01ConsultaTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	
	public static void main(String[] args) throws SQLException {
		MOLOG.info("[EVL] =====[ Start main ]=====");
		
		// Referencio a la ruta donde se ubica el contexto
		moCntx = new ClassPathXmlApplicationContext("classpath:/pe/unjfsc/daw/spring5/database/spring-postgres.xml");
		MOLOG.info("[EVL] Context : {}", moCntx);
		
		// Conexion a bd
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("dataSource");
		MOLOG.info("[EVL] DriverManagerDataSource : {}", oDataSource);
		
		Connection oConnection = oDataSource.getConnection();
		MOLOG.info("[EVL] Connection : {}", oConnection);
		
		// SQL embebido 
		PreparedStatement oPS = oConnection.prepareStatement("SELECT * FROM " + CD01ConstanteSQL.SQL_SCHEMA + "CTBt14_tipo_plan");
		MOLOG.info("[EVL] PreparedStatement : {}", oPS);

		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		MOLOG.info("[EVL] Tipo Plan : {}", oCETipoPlan.toString());
		
		// Ejecuto y obtengo un resultado,que debe ser sin data
		ResultSet oRS = oPS.executeQuery();
		MOLOG.info("[EVL] ResultSet : {}", oPS);

		// Como no hay data no visualiza el registro
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
			MOLOG.info("[EVL] Tipo Plan{}", oCETipoPlan.toString());
		}
		oRS.close();
		oConnection.close();
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
