package pe.unjfsc.daw.spring5.model.postgres;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import pe.unjfsc.daw.spring5.entity.CE01TipoPlan;
import pe.unjfsc.daw.spring5.mapper.CD01TipoPlanRowMapper;
import pe.unjfsc.daw.spring5.model.CD01ConstanteSQL;
import pe.unjfsc.daw.spring5.model.CI01TipoPlan;

public class CD01TipoPlan extends JdbcDaoSupport implements CI01TipoPlan{
	private static Logger MOLOG = LoggerFactory.getLogger(CD01TipoPlan.class);
	
	//Implementación de la inteface
	@Override
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan){
		MOLOG.info("=====> [EVL] Start method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");

		Object[] oaInputs = new Object[] {
			poCETipoPlan.getCodigoTipoPlan(), poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), poCETipoPlan.getAbreviatura(), 
			poCETipoPlan.getDescripcion(), poCETipoPlan.isSiNoVisualizar(), poCETipoPlan.isSiNoEditar(), poCETipoPlan.isSiNoAnula(), poCETipoPlan.isSiNoElimina(), 
			poCETipoPlan.isSiNoDefault(), poCETipoPlan.isSiNoActivo(),
			poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion()				
		};
		
		MOLOG.info("=>[EVL] CETipoPlan   : {} ", poCETipoPlan);
		MOLOG.info("=>[EVL] Object[]     : {} ", oaInputs);

		getJdbcTemplate().update(CD01ConstanteSQL.SQL_INSERT, oaInputs);

		MOLOG.info("=====> [EVL] End method grabarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	@Override
	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan){
		MOLOG.info("=====> [EVL] Start method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");

		Object[] oaInputs = new Object[] {
			poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), poCETipoPlan.getAbreviatura(), poCETipoPlan.getDescripcion(), 
			poCETipoPlan.isSiNoVisualizar(), poCETipoPlan.isSiNoEditar(), poCETipoPlan.isSiNoAnula(), poCETipoPlan.isSiNoElimina(), 
			poCETipoPlan.isSiNoDefault(), poCETipoPlan.isSiNoActivo(),
			poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion(),
			poCETipoPlan.getCodigoTipoPlan()
		};
		
		MOLOG.info("=>[EVL] CETipoPlan   : {} ", poCETipoPlan);
		MOLOG.info("=>[EVL] Object[]     : {} ", oaInputs);

		getJdbcTemplate().update(CD01ConstanteSQL.SQL_UPDATE, oaInputs);

		MOLOG.info("=====> [EVL] End method actualizarTipoPlan(CE01TipoPlan poCETipoPlan)");
	}

	@Override
	public void eliminarTipoPlan(String psCodigo){
		MOLOG.info("=====> [EVL] Start method eliminarTipoPlan(String psCodigo)");
		
		getJdbcTemplate().update(CD01ConstanteSQL.SQL_DELETE, psCodigo);
		
		MOLOG.info("=====> [EVL] End method eliminarTipoPlan(String psCodigo)");
		
	}

	@Override
	public CE01TipoPlan buscarTipoPlan(String psCodigo) {
		MOLOG.info("=====> [EVL] Start method buscarTipoPlan(String psCodigo)");
		
		// queryForObject para buscar
		CE01TipoPlan oCETipoPlan = this.getJdbcTemplate().queryForObject(CD01ConstanteSQL.SQL_SELECT_BY_ID, new Object[] {psCodigo}, new CD01TipoPlanRowMapper());

		MOLOG.info("=====> [EVL] End method buscarTipoPlan(String psCodigo)");
		return oCETipoPlan;
	}

	@Override
	public List<CE01TipoPlan> listaAllTipoPlan() {
		MOLOG.info("=====> [EVL] Start method listarAllTipoPlan()");
		
		// query para buscar  todos los registros
		List<CE01TipoPlan> oListaTipoPlan = this.getJdbcTemplate().query(CD01ConstanteSQL.SQL_SELECT_ALL, new CD01TipoPlanRowMapper() );
		
		MOLOG.info("=> [EVL] Cantidad de Objetos : {} ", oListaTipoPlan.size());
		MOLOG.info("=====> [EVL] End method listarAllTipoPlan()");
		return oListaTipoPlan;
	}
}
