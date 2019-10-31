package pe.etg.bbva.spring.model.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.etg.bbva.spring.entity.oracle.CE01TipoPlan;
import pe.etg.bbva.spring.model.CI02JdbcTemplateTipoPlan;
import pe.etg.bbva.spring.model.mapper.oracle.CD01TipoPlanRowMapper;

public class CD02TipoPlanJdbcTemplate implements CI02JdbcTemplateTipoPlan{
	private static Logger MOLOG = LoggerFactory.getLogger(CD02TipoPlanJdbcTemplate.class);
	
	// Se debe declarar la variable
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan){
		MOLOG.info("=====> [EVL] Start method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");

		Object[] aoInput = new Object[] {poCETipoPlan.getCodigoTipoPlan(), poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), 
				poCETipoPlan.getAbreviatura(), poCETipoPlan.getDescripcion(), poCETipoPlan.getSiNoVisualizar(), poCETipoPlan.getSiNoEditar(), poCETipoPlan.getSiNoAnula(), 
				poCETipoPlan.getSiNoElimina(), poCETipoPlan.getSiNoDefault(), poCETipoPlan.getSiNoActivo(), 
				poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion() 
		};
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_INSERT);
		MOLOG.info("=> [EVL] Entrada   : {}", aoInput.length);
		MOLOG.info("=> [EVL] Instancia : {}", jdbcTemplate);

		int iRptaSQL = jdbcTemplate.update(CD01ConstanteSQL.SQL_INSERT, aoInput);
		
		MOLOG.info("=> [EVL] Resultado : {}", iRptaSQL);

		MOLOG.info("=====> [EVL] End method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	@Override
	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan){
		MOLOG.info("=====> [EVL] Start method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
		
		Object[] aoInput = new Object[] {poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), 
				poCETipoPlan.getAbreviatura(), poCETipoPlan.getDescripcion(), poCETipoPlan.getSiNoVisualizar(), poCETipoPlan.getSiNoEditar(), poCETipoPlan.getSiNoAnula(), 
				poCETipoPlan.getSiNoElimina(), poCETipoPlan.getSiNoDefault(), poCETipoPlan.getSiNoActivo(), 
				poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion(), poCETipoPlan.getCodigoTipoPlan()
		};
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_UPDATE);
		MOLOG.info("=> [EVL] Entrada   : {}", aoInput);
		MOLOG.info("=> [EVL] Instancia : {}", jdbcTemplate);
		
		int iRptaSQL = jdbcTemplate.update(CD01ConstanteSQL.SQL_UPDATE, aoInput);
		
		MOLOG.info("=> [EVL] Resultado : {}", iRptaSQL);
		
		MOLOG.info("=====> [EVL] End method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	@Override
	public void eliminarTipoPlan(String psCodigo){
		MOLOG.info("=====> [EVL] Start method eliminarTipoPlan(int piIdentificador)");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_UPDATE);
		MOLOG.info("=> [EVL] Entrada   : {}", psCodigo);
		MOLOG.info("=> [EVL] Instancia : {}", jdbcTemplate);
		
		int iRptaSQL = jdbcTemplate.update(CD01ConstanteSQL.SQL_DELETE, psCodigo);
		
		MOLOG.info("=> [EVL] Resultado : {}", iRptaSQL);
		
		MOLOG.info("=====> [EVL] End method eliminarTipoPlan(int piIdentificador)");
	}

	@Override
	public CE01TipoPlan buscarTipoPlan(String psCodigo){
		MOLOG.info("=====> [EVL] Start method buscarTipoPlan(int piIdentificador)");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_SELECT_BY_ID);
		MOLOG.info("=> [EVL] Entrada   : {}", psCodigo);
		MOLOG.info("=> [EVL] Instancia : {}", jdbcTemplate);
		
		CE01TipoPlan oCETipoPlan = jdbcTemplate.queryForObject(CD01ConstanteSQL.SQL_SELECT_BY_ID, new Object[] {psCodigo}, new CD01TipoPlanRowMapper());
		
		MOLOG.info("=> [EVL] Resultado : {}", oCETipoPlan);
		
		MOLOG.info("=====> [EVL] End method buscarTipoPlan(int piIdentificador)");
		return oCETipoPlan;
	}

	@Override
	public List<CE01TipoPlan> listaAllTipoPlan(){
		MOLOG.info("=====> [EVL] Start method listarAllTipoPlan()");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_SELECT_ALL);
		MOLOG.info("=> [EVL] Instancia : {}", jdbcTemplate);
		
		List<CE01TipoPlan> oListTipoPlan = jdbcTemplate.query(CD01ConstanteSQL.SQL_SELECT_ALL, new CD01TipoPlanRowMapper());

		MOLOG.info("=> [EVL] Cantidad  : {}", oListTipoPlan.size());
		
		MOLOG.info("=====> [EVL] End method listarAllTipoPlan()");
		return oListTipoPlan;
	}
}
