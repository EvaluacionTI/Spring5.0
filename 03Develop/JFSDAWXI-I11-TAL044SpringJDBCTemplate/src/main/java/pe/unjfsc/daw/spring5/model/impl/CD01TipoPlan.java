package pe.unjfsc.daw.spring5.model.impl;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.unjfsc.daw.spring5.entity.CE01TipoPlan;
import pe.unjfsc.daw.spring5.mapper.CD01TipoPlanRowMapper;
import pe.unjfsc.daw.spring5.model.CD01ConstanteSQL;
import pe.unjfsc.daw.spring5.model.CI01TipoPlan;

public class CD01TipoPlan implements CI01TipoPlan{
	private static Logger MOLOG = LoggerFactory.getLogger(CD01TipoPlan.class);
	
	// Get y seter solo al datasource
	private DataSource dataSource;
	private JdbcTemplate moJdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	//Implementación de la inteface
	@Override
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan){
		MOLOG.info("[EVL] =====[ Start grabarTipoPlan ]=====");

		//Instancias de JdbcTemplate y arreglo de objetos a grabar
		moJdbcTemplate = new JdbcTemplate(dataSource);
		Object[] oaInputs = new Object[] {
			poCETipoPlan.getCodigoTipoPlan(), poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), poCETipoPlan.getAbreviatura(), 
			poCETipoPlan.getDescripcion(), poCETipoPlan.isSiNoVisualizar(), poCETipoPlan.isSiNoEditar(), poCETipoPlan.isSiNoAnula(), poCETipoPlan.isSiNoElimina(), 
			poCETipoPlan.isSiNoDefault(), poCETipoPlan.isSiNoActivo(),
			poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion()				
		};
		
		MOLOG.info("[EVL] CETipoPlan   : {} ", poCETipoPlan);
		MOLOG.info("[EVL] JdbcTemplate : {} ", moJdbcTemplate);
		MOLOG.info("[EVL] Object[]     : {} ", oaInputs);

		moJdbcTemplate.update(CD01ConstanteSQL.SQL_INSERT, oaInputs);
		MOLOG.info("[EVL] After save     : {} ", moJdbcTemplate);
	}

	@Override
	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan){
		MOLOG.info("[EVL] =====[ Start actualizarTipoPlan ]=====");

		moJdbcTemplate = new JdbcTemplate(dataSource);
		Object[] oaInputs = new Object[] {
			poCETipoPlan.getCodigoEmpresa(), poCETipoPlan.getCodigoIdioma(), poCETipoPlan.getAbreviatura(), poCETipoPlan.getDescripcion(), 
			poCETipoPlan.isSiNoVisualizar(), poCETipoPlan.isSiNoEditar(), poCETipoPlan.isSiNoAnula(), poCETipoPlan.isSiNoElimina(), 
			poCETipoPlan.isSiNoDefault(), poCETipoPlan.isSiNoActivo(),
			poCETipoPlan.getUsuarioNuevo(), poCETipoPlan.getFechaAlta(), poCETipoPlan.getUsuarioUltimaModificacion(), poCETipoPlan.getFechaUltimaModificacion(),
			poCETipoPlan.getCodigoTipoPlan()
		};
		
		MOLOG.info("[EVL] CETipoPlan   : {} ", poCETipoPlan);
		MOLOG.info("[EVL] JdbcTemplate : {} ", moJdbcTemplate);
		MOLOG.info("[EVL] Object[]     : {} ", oaInputs);

		moJdbcTemplate.update(CD01ConstanteSQL.SQL_UPDATE, oaInputs);
		MOLOG.info("[EVL] After update     : {} ", moJdbcTemplate);
	}

	@Override
	public void eliminarTipoPlan(String psCodigo){
		MOLOG.info("[EVL] =====[ Start eliminarTipoPlan ]=====");
		
		moJdbcTemplate = new JdbcTemplate(dataSource);
		MOLOG.info("[EVL] Instance     : {} ", moJdbcTemplate);

		moJdbcTemplate.update(CD01ConstanteSQL.SQL_DELETE, psCodigo);
		MOLOG.info("[EVL] After delete     : {} ", moJdbcTemplate);
	}

	@Override
	public CE01TipoPlan buscarTipoPlan(String psCodigo) {
		MOLOG.info("[EVL] =====[ Start buscarTipoPlan ]=====");
		
		moJdbcTemplate = new JdbcTemplate(dataSource);
		MOLOG.info("[EVL] Instance     : {} ", moJdbcTemplate);
		// queryForObject para buscar
		MOLOG.info("[EVL] Query     : {} ", CD01ConstanteSQL.SQL_SELECT_BY_ID);
		CE01TipoPlan oCETipoPlan = this.moJdbcTemplate.queryForObject(CD01ConstanteSQL.SQL_SELECT_BY_ID, new Object[] {psCodigo}, new CD01TipoPlanRowMapper());
		MOLOG.info("[EVL] Result CE01TipoPlan     : {} ", oCETipoPlan.toString());
		
		return oCETipoPlan;
	}

	@Override
	public List<CE01TipoPlan> listaAllTipoPlan() {
		MOLOG.info("[EVL] =====[ Start listaAllTipoPlan ]=====");
		
		moJdbcTemplate = new JdbcTemplate(dataSource);
		MOLOG.info("[EVL] Instance     : {} ", moJdbcTemplate);
		
		// query para buscar  todos los registros
		List<CE01TipoPlan> oListaTipoPlan = this.moJdbcTemplate.query(CD01ConstanteSQL.SQL_SELECT_ALL, new CD01TipoPlanRowMapper() );
		
		MOLOG.info("[EVL] List of CE01TipoPlan : {} ", oListaTipoPlan.toString());

		return oListaTipoPlan;
	}
}
