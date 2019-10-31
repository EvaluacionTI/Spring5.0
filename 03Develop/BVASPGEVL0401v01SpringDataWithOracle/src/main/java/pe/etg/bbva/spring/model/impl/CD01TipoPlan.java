package pe.etg.bbva.spring.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.etg.bbva.spring.entity.CE01TipoPlan;
import pe.etg.bbva.spring.model.CI01TipoPlan;
import pe.etg.bbva.spring.utility.CUConversionFecha;


public class CD01TipoPlan implements CI01TipoPlan{
	private static Logger MOLOG = LoggerFactory.getLogger(CD01TipoPlan.class);
	
	private DataSource dataSource;
	private Connection oCxn = null;
	private CUConversionFecha oCUConversion;
	private java.sql.Date oFechaSql;
	private java.sql.Timestamp oFechaTimeStamp;
	

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan) throws SQLException {
		MOLOG.info("=====> [CTB] Start method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");
		
		oCxn = dataSource.getConnection();
		oCUConversion = new CUConversionFecha();
		PreparedStatement oPS = oCxn.prepareStatement(CD01ConstanteSQL.SQL_INSERT);
		
		MOLOG.info("=> [CTB] DataSource        : {} ", dataSource);
		MOLOG.info("=> [CTB] getConnection     : {} ", oCxn);
		MOLOG.info("=> [CTB] PreparedStatement : {} ", oPS);
		
		oPS.setString(1, poCETipoPlan.getCodigoTipoPlan());
		oPS.setString(2, poCETipoPlan.getCodigoEmpresa());
		oPS.setString(3, poCETipoPlan.getCodigoIdioma());
		oPS.setString(4, poCETipoPlan.getAbreviatura());
		oPS.setString(5, poCETipoPlan.getDescripcion());
		oPS.setBoolean(6, poCETipoPlan.isSiNoVisualizar());
		oPS.setBoolean(7, poCETipoPlan.isSiNoEditar());
		oPS.setBoolean(8, poCETipoPlan.isSiNoAnula());
		oPS.setBoolean(9, poCETipoPlan.isSiNoElimina());
		oPS.setBoolean(10, poCETipoPlan.isSiNoDefault());
		oPS.setBoolean(11, poCETipoPlan.isSiNoActivo());
		oPS.setString(12, poCETipoPlan.getUsuarioNuevo());
		
		oFechaSql =  oCUConversion.convertirUtilDateASqlDate(poCETipoPlan.getFechaAlta());
		oPS.setDate(13, oFechaSql);
		
		oPS.setString(14, poCETipoPlan.getUsuarioUltimaModificacion());

		oFechaTimeStamp = oCUConversion.convertirUtilTimeStampASqlDate(poCETipoPlan.getFechaUltimaModificacion());
		oPS.setTimestamp(15, oFechaTimeStamp);
		MOLOG.info("=> [CTB] Objeto a grabar   : {} ", poCETipoPlan);
		
		oPS.executeUpdate();
		oPS.close();
		oCxn.close();
		MOLOG.info("=====> [CTB] End method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan) throws SQLException {
		MOLOG.info("=====> [CTB] Start method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
		
		oCUConversion = new CUConversionFecha();
		oCxn = dataSource.getConnection();
		PreparedStatement oPS = oCxn.prepareStatement(CD01ConstanteSQL.SQL_UPDATE);
		
		MOLOG.info("=> [CTB] DataSource        : {} ", dataSource);
		MOLOG.info("=> [CTB] getConnection     : {} ", oCxn);
		MOLOG.info("=> [CTB] PreparedStatement : {} ", oPS);
		
		oPS.setString(1, poCETipoPlan.getCodigoEmpresa());
		oPS.setString(2, poCETipoPlan.getCodigoIdioma());
		oPS.setString(3, poCETipoPlan.getAbreviatura());
		oPS.setString(4, poCETipoPlan.getDescripcion());
		oPS.setBoolean(5, poCETipoPlan.isSiNoVisualizar());
		oPS.setBoolean(6, poCETipoPlan.isSiNoEditar());
		oPS.setBoolean(7, poCETipoPlan.isSiNoAnula());
		oPS.setBoolean(8, poCETipoPlan.isSiNoElimina());
		oPS.setBoolean(9, poCETipoPlan.isSiNoDefault());
		oPS.setBoolean(10, poCETipoPlan.isSiNoActivo());
		oPS.setString(11, poCETipoPlan.getUsuarioNuevo());
		
		oFechaSql =  oCUConversion.convertirUtilDateASqlDate(poCETipoPlan.getFechaAlta());
		oPS.setDate(12, oFechaSql);
		
		oPS.setString(13, poCETipoPlan.getUsuarioUltimaModificacion());
		oFechaTimeStamp = oCUConversion.convertirUtilTimeStampASqlDate(poCETipoPlan.getFechaUltimaModificacion());
		oPS.setTimestamp(14, oFechaTimeStamp);
		
		oPS.setString(15, poCETipoPlan.getCodigoTipoPlan());
		
		MOLOG.info("=> [CTB] PreparedStatement : {} ", oPS);
		
		oPS.executeUpdate();
		oPS.close();
		oCxn.close();
		
		MOLOG.info("=====> [CTB] End method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}
	
	public void eliminarTipoPlan(String psCodigo) throws SQLException {
		MOLOG.info("=====> [CTB] Start method eliminarTipoPlan(int piIdentificador)");
		
		oCxn = dataSource.getConnection();
		PreparedStatement oPS = oCxn.prepareStatement(CD01ConstanteSQL.SQL_DELETE);

		MOLOG.info("=> [CTB] DataSource        : {} ", dataSource);
		MOLOG.info("=> [CTB] getConnection     : {} ", oCxn);
		MOLOG.info("=> [CTB] PreparedStatement : {} ", oPS);
		
		oPS.setString(1, psCodigo);
	
		MOLOG.info("====> PreparedStatement : {} ", oPS);
		
		oPS.executeUpdate();
		oPS.close();
		oCxn.close();
		
		MOLOG.info("=====> [CTB] End method eliminarTipoPlan(int piIdentificador)");
	}

	public CE01TipoPlan buscarTipoPlan(String psCodigo) throws SQLException {
		MOLOG.info("=====> [CTB] Start method buscarTipoPlan(int piIdentificador)");
		
		oCxn = dataSource.getConnection();
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		PreparedStatement oPS = oCxn.prepareStatement(CD01ConstanteSQL.SQL_SELECT_BY_ID);

		MOLOG.info("=> [CTB] DataSource        : {} ", dataSource);
		MOLOG.info("=> [CTB] getConnection     : {} ", oCxn);
		MOLOG.info("=> [CTB] PreparedStatement : {} ", oPS);
		
		oPS.setString(1, psCodigo);
		ResultSet oRS = oPS.executeQuery();
		
		MOLOG.info("====> PreparedStatement : {} ", oPS);
		MOLOG.info("====> ResultSet : {} ", oRS);
		
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
		}
		MOLOG.info("====> Tipo Plan : {} ", oCETipoPlan.toString());
		oPS.close();
		oCxn.close();
		
		MOLOG.info("=====> [CTB] End method buscarTipoPlan(int piIdentificador)");
		return oCETipoPlan;
	}
	
	public List<CE01TipoPlan> listaAllTipoPlan() throws SQLException{
		MOLOG.info("=====> [CTB] Start method listarAllTipoPlan()");
		
		oCxn = dataSource.getConnection();
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		List<CE01TipoPlan> oListaTipoPlan = new ArrayList<>();
		PreparedStatement oPS = oCxn.prepareStatement(CD01ConstanteSQL.SQL_SELECT_ALL);
		ResultSet oRS = oPS.executeQuery();
		
		MOLOG.info("=> [CTB] DataSource        : {} ", dataSource);
		MOLOG.info("=> [CTB] getConnection     : {} ", oCxn);
		MOLOG.info("=> [CTB] PreparedStatement : {} ", oPS);
		MOLOG.info("=> [CTB] ResultSet         : {} ", oRS);
		
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
			MOLOG.info("=> [CTB] Tipo Plan : {} ", oCETipoPlan.toString());
			
			oListaTipoPlan.add(oCETipoPlan);
			oCETipoPlan = new CE01TipoPlan();
		}
		
		MOLOG.info("=> [CTB] Cantidad Registros : {} ", oListaTipoPlan.size());
		MOLOG.info("=====> [CTB] End method listarAllTipoPlan()");
		return oListaTipoPlan;
	}
}
