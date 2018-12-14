package pe.etg.bbva.spring.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import pe.etg.bbva.spring.entity.CE01TipoPlan;

public class CD01TipoPlanRowMapper implements RowMapper<CE01TipoPlan> {
	private static Logger MOLOG = LoggerFactory.getLogger(CD01TipoPlanRowMapper.class);
	private CE01TipoPlan oCETipoPlan;
	
	@Override
	public CE01TipoPlan mapRow(ResultSet poRS, int iRowNumber) throws SQLException {
		MOLOG.info("====> Start method : mapRow(ResultSet poRS, int iRowNumber) {}", poRS);
		
		oCETipoPlan= new CE01TipoPlan();
		MOLOG.info("=> oCETipoCuenta {} ", oCETipoPlan);
		
		oCETipoPlan.setCodigoTipoPlan(poRS.getString("id_tipo_plan"));
		oCETipoPlan.setCodigoEmpresa(poRS.getString("cod_emp"));
		oCETipoPlan.setCodigoIdioma(poRS.getString("cod_iso_idio_orgn"));
		oCETipoPlan.setAbreviatura(poRS.getString("txt_abrv"));
		oCETipoPlan.setDescripcion(poRS.getString("txt_desc"));
		oCETipoPlan.setSiNoVisualizar(poRS.getBoolean("sn_ver"));
		oCETipoPlan.setSiNoEditar(poRS.getBoolean("sn_upd"));
		oCETipoPlan.setSiNoAnula(poRS.getBoolean("sn_del"));
		oCETipoPlan.setSiNoElimina(poRS.getBoolean("sn_anu"));
		oCETipoPlan.setSiNoDefault(poRS.getBoolean("sn_dflt"));
		oCETipoPlan.setSiNoActivo(poRS.getBoolean("sn_act"));
		oCETipoPlan.setUsuarioNuevo(poRS.getString("txt_user"));
		oCETipoPlan.setFechaAlta(poRS.getDate("fec_user"));
		oCETipoPlan.setUsuarioUltimaModificacion(poRS.getString("txt_last_user"));
		oCETipoPlan.setFechaUltimaModificacion(poRS.getDate("fec_last_user"));
		
		MOLOG.info("=> [EVL] Objecto leido de SQL : {} ", oCETipoPlan);
		
		return oCETipoPlan;
	}
}
