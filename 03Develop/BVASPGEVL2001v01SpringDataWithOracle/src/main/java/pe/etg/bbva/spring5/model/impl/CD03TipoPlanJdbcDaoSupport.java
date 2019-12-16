package pe.etg.bbva.spring5.model.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import pe.etg.bbva.spring5.entity.CE01TipoPlan;
import pe.etg.bbva.spring5.model.CI03JdbcDaoSupportTipoPlan;
import pe.etg.bbva.spring5.model.mapper.CD01TipoPlanRowMapper;

public class CD03TipoPlanJdbcDaoSupport extends JdbcDaoSupport implements CI03JdbcDaoSupportTipoPlan{
	private static Logger MOLOG = LoggerFactory.getLogger(CD03TipoPlanJdbcDaoSupport.class);
	
	@Override
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan){
		MOLOG.info("=====> [EVL] Start method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");

		Object[] aoInput = new Object[] {poCETipoPlan.getCodigoTipoPlan(), poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), 
				poCETipoPlan.getAbreviatura(), poCETipoPlan.getDescripcion(), poCETipoPlan.isSiNoVisualizar(), poCETipoPlan.isSiNoEditar(), poCETipoPlan.isSiNoAnula(), 
				poCETipoPlan.isSiNoElimina(), poCETipoPlan.isSiNoDefault(), poCETipoPlan.isSiNoActivo(), 
				poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion() 
		};
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_INSERT);
		MOLOG.info("=> [EVL] Entrada   : {}", aoInput.length);

		getJdbcTemplate().update(CD01ConstanteSQL.SQL_INSERT, aoInput);
		
		MOLOG.info("=====> [EVL] End method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	@Override
	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan){
		MOLOG.info("=====> [EVL] Start method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
		
		Object[] aoInput = new Object[] {poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), 
				poCETipoPlan.getAbreviatura(), poCETipoPlan.getDescripcion(), poCETipoPlan.isSiNoVisualizar(), poCETipoPlan.isSiNoEditar(), poCETipoPlan.isSiNoAnula(), 
				poCETipoPlan.isSiNoElimina(), poCETipoPlan.isSiNoDefault(), poCETipoPlan.isSiNoActivo(), 
				poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion(), poCETipoPlan.getCodigoTipoPlan()
		};
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_UPDATE);
		MOLOG.info("=> [EVL] Entrada   : {}", aoInput);
		
		getJdbcTemplate().update(CD01ConstanteSQL.SQL_UPDATE, aoInput);
		
		MOLOG.info("=====> [EVL] End method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	@Override
	public void eliminarTipoPlan(String psCodigo){
		MOLOG.info("=====> [EVL] Start method eliminarTipoPlan(int piIdentificador)");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_UPDATE);
		MOLOG.info("=> [EVL] Entrada   : {}", psCodigo);
		
		getJdbcTemplate().update(CD01ConstanteSQL.SQL_DELETE, psCodigo);
		
		MOLOG.info("=====> [EVL] End method eliminarTipoPlan(int piIdentificador)");
	}

	@Override
	public CE01TipoPlan buscarTipoPlan(String psCodigo){
		MOLOG.info("=====> [EVL] Start method buscarTipoPlan(int piIdentificador)");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_SELECT_BY_ID);
		MOLOG.info("=> [EVL] Entrada   : {}", psCodigo);
		
		CE01TipoPlan oCETipoPlan = getJdbcTemplate().queryForObject(CD01ConstanteSQL.SQL_SELECT_BY_ID, new Object[] {psCodigo}, new CD01TipoPlanRowMapper());
		
		MOLOG.info("=> [EVL] Resultado : {}", oCETipoPlan);
		
		MOLOG.info("=====> [EVL] End method buscarTipoPlan(int piIdentificador)");
		return oCETipoPlan;
	}

	@Override
	public List<CE01TipoPlan> listaAllTipoPlan(){
		MOLOG.info("=====> [EVL] Start method listarAllTipoPlan()");
		
		MOLOG.info("=> [EVL] SQL       : {}", CD01ConstanteSQL.SQL_SELECT_ALL);
		
		List<CE01TipoPlan> oListTipoPlan = getJdbcTemplate().query(CD01ConstanteSQL.SQL_SELECT_ALL, new CD01TipoPlanRowMapper());

		MOLOG.info("=> [EVL] Cantidad  : {}", oListTipoPlan.size());
		
		MOLOG.info("=====> [EVL] End method listarAllTipoPlan()");
		return oListTipoPlan;
	}
}
