package pe.unjfsc.daw.sesion10.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pe.unjfsc.daw.sesion10.entity.CE01TipoPlan;

// Revisión con una consulta a bd a modo de prueba implementado con Jdbc Standard.
public class CV0101v01ConsultaTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0101v01ConsultaTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	
	public static void main(String[] args) throws SQLException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");
		
		// Referencio a la ruta donde se ubica el contexto
		moCntx = new ClassPathXmlApplicationContext("classpath:/spring/database/spring-postgres.xml");
		// Conexion a bd
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("dataSource");
		Connection oConnection = oDataSource.getConnection();
		// SQL embebido 
		PreparedStatement oPS = oConnection.prepareStatement("SELECT * FROM EII.CTBt14_tipo_plan");
				
		MOLOG.info("=> [EVL] Context : {}", moCntx);
		MOLOG.info("=> [EVL] DriverManagerDataSource : {}", oDataSource);
		MOLOG.info("=> [EVL] Connection : {}", oConnection);
		MOLOG.info("=> [EVL] PreparedStatement : {}", oPS);

		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		// Ejecuto y obtengo un resultado,que debe ser sin data
		ResultSet oRS = oPS.executeQuery();
		MOLOG.info("=> [EVL] ResultSet : {}", oPS);
		MOLOG.info("=> [EVL] Tipo Plan : {}", oCETipoPlan.toString());
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
			MOLOG.info("=> [EVL] Tipo Plan{}", oCETipoPlan.toString());
		}
		oRS.close();
		oConnection.close();
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
