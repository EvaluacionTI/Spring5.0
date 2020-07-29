package pe.bbva.evalua.spring5.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import pe.bbva.evalua.spring5.entity.CE01TipoPlan;

// Implemento un mapper de tipo plan
public class CD01TipoPlanRowMapper implements RowMapper<CE01TipoPlan> {
	private static Logger MOLOG = LoggerFactory.getLogger(CD01TipoPlanRowMapper.class);
	
	private CE01TipoPlan oCETipoPlan;
	
	public CE01TipoPlan mapRow(ResultSet poRS, int rowNum) throws SQLException {
		MOLOG.info("[EVL] =====[ Start mapRow ]=====");
		MOLOG.info("[EVL] ResultSet poRS, int rowNum : {} {}", poRS, rowNum);
		// Instancio un objeto
		oCETipoPlan= new CE01TipoPlan();
		
		MOLOG.info("[EVL] Instance CETipoCuenta : {} ", oCETipoPlan);
		//Cargo los valores de la base de datos asociado a sus atributos
		oCETipoPlan.setCodigoTipoPlan(poRS.getString("cod_tipo_plan"));
		oCETipoPlan.setCodigoEmpresa(poRS.getString("cod_emp"));
		oCETipoPlan.setCodigoIdioma(poRS.getString("cod_iso_idio_orgn"));
		oCETipoPlan.setAbreviatura(poRS.getString("txt_abrv"));
		oCETipoPlan.setDescripcion(poRS.getString("txt_desc"));
		oCETipoPlan.setSiNoVisualizar(poRS.getBoolean("sn_ver"));
		oCETipoPlan.setSiNoEditar(poRS.getBoolean("sn_upd"));
		oCETipoPlan.setSiNoElimina(poRS.getBoolean("sn_anu"));
		oCETipoPlan.setSiNoAnula(poRS.getBoolean("sn_del"));
		oCETipoPlan.setSiNoDefault(poRS.getBoolean("sn_dflt"));
		oCETipoPlan.setSiNoActivo(poRS.getBoolean("sn_act"));
		oCETipoPlan.setUsuarioNuevo(poRS.getString("txt_user"));
		oCETipoPlan.setFechaAlta(poRS.getDate("fec_user"));
		oCETipoPlan.setUsuarioUltimaModificacion(poRS.getString("txt_last_user"));
		oCETipoPlan.setFechaUltimaModificacion(poRS.getDate("fec_last_user"));

		MOLOG.info("[EVL] Objeto mapeado : {} ", oCETipoPlan.toString());
		
		return oCETipoPlan;
	}
}
