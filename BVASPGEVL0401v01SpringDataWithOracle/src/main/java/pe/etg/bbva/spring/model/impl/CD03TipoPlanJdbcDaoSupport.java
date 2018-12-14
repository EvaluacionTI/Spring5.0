package pe.etg.bbva.spring.model.impl;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.etg.bbva.spring.entity.CE01TipoPlan;
import pe.etg.bbva.spring.model.CI01TipoPlan;
import pe.etg.bbva.spring.model.mapper.CD01TipoPlanRowMapper;

public class CD03TipoPlanJdbcDaoSupport implements CI01TipoPlan{
	private static Logger MOLOG = LoggerFactory.getLogger(CD03TipoPlanJdbcDaoSupport.class);
	
	private JdbcTemplate oJdbcTemplate;

	@Override
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan) throws SQLException {
		MOLOG.info("=====> [EVL] Start method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");
		Object[] aoInput = new Object[] {poCETipoPlan.getCodigoTipoPlan(), poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), 
				poCETipoPlan.getAbreviatura(), poCETipoPlan.getDescripcion(), poCETipoPlan.isSiNoVisualizar(), poCETipoPlan.isSiNoEditar(), poCETipoPlan.isSiNoAnula(), 
				poCETipoPlan.isSiNoElimina(), poCETipoPlan.isSiNoDefault(), poCETipoPlan.isSiNoActivo(), 
				poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion() 
		};
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_INSERT);
		MOLOG.info("=> [EVL] Entrada   : {}", aoInput);
		
		int iRptaSQL = oJdbcTemplate.update(CD01ConstanteSQL.SQL_INSERT, aoInput);
		MOLOG.info("=> [EVL] Resultado : {}", iRptaSQL);

		MOLOG.info("=====> [EVL] End method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	@Override
	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan) throws SQLException {
		MOLOG.info("=====> [EVL] Start method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
		
		Object[] aoInput = new Object[] {poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), 
				poCETipoPlan.getAbreviatura(), poCETipoPlan.getDescripcion(), poCETipoPlan.isSiNoVisualizar(), poCETipoPlan.isSiNoEditar(), poCETipoPlan.isSiNoAnula(), 
				poCETipoPlan.isSiNoElimina(), poCETipoPlan.isSiNoDefault(), poCETipoPlan.isSiNoActivo(), 
				poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion(), poCETipoPlan.getCodigoTipoPlan()
		};
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_UPDATE);
		MOLOG.info("=> [EVL] Entrada   : {}", aoInput);
		
		int iRptaSQL = oJdbcTemplate.update(CD01ConstanteSQL.SQL_UPDATE, aoInput);
		MOLOG.info("=> [EVL] Resultado : {}", iRptaSQL);
		
		MOLOG.info("=====> [EVL] End method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	@Override
	public void eliminarTipoPlan(String psCodigo) throws SQLException {
		MOLOG.info("=====> [EVL] Start method eliminarTipoPlan(int piIdentificador)");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_UPDATE);
		MOLOG.info("=> [EVL] Entrada   : {}", psCodigo);
		
		int iRptaSQL = oJdbcTemplate.update(CD01ConstanteSQL.SQL_DELETE, psCodigo);
		MOLOG.info("=> [EVL] Resultado : {}", iRptaSQL);
		
		MOLOG.info("=====> [EVL] End method eliminarTipoPlan(int piIdentificador)");
	}

	@Override
	public CE01TipoPlan buscarTipoPlan(String psCodigo) throws SQLException {
		MOLOG.info("=====> [EVL] Start method buscarTipoPlan(int piIdentificador)");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_SELECT_BY_ID);
		MOLOG.info("=> [EVL] Entrada   : {}", psCodigo);
		
		CE01TipoPlan oCETipoPlan = oJdbcTemplate.queryForObject(CD01ConstanteSQL.SQL_SELECT_BY_ID, new Object[] {psCodigo}, new CD01TipoPlanRowMapper());
		MOLOG.info("=> [EVL] Resultado : {}", oCETipoPlan);
		
		MOLOG.info("=====> [EVL] End method buscarTipoPlan(int piIdentificador)");
		return oCETipoPlan;
	}

	@Override
	public List<CE01TipoPlan> listaAllTipoPlan() throws SQLException {
		MOLOG.info("=====> [EVL] Start method listarAllTipoPlan()");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_SELECT_ALL);
		List<CE01TipoPlan> oListTipoPlan = oJdbcTemplate.query(CD01ConstanteSQL.SQL_SELECT_ALL, new CD01TipoPlanRowMapper());

		MOLOG.info("=> [EVL] Cantidad  : {}", oListTipoPlan.size());
		
		MOLOG.info("=====> [EVL] End method listarAllTipoPlan()");
		return oListTipoPlan;
	}



}
