package pe.bbva.evalua.spring5.model.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.CISaldoAfiliado;

public class CDSaldoAfiliado implements CISaldoAfiliado<CESaldoAfiliadoCustom> {
	private static final Logger LOG = LoggerFactory.getLogger("CDSaldoAfiliado");
	
	private CESaldoAfiliadoCustom moCESaldo;
	
    private JdbcTemplate jdbcTemplate;
    
	@Override
	public void grabar(CESaldoAfiliadoCustom poT) {
		LOG.info("[EVL] =====[ Start grabar ]=====");
		LOG.info("[EVL] Save : {}", CEConstant.SQL_INSERT);
		jdbcTemplate.update(CEConstant.SQL_INSERT, poT.id, poT.codigoAfiliado, poT.saldoCIC);
		LOG.info("[EVL] After JdbcTemplate : {}", jdbcTemplate);
	}

	@Override
	public void actualizar(CESaldoAfiliadoCustom poT) {
		LOG.info("[EVL] =====[ Start actualizar ]=====");
		LOG.info("[EVL] Update : {}", CEConstant.SQL_UPDATE);
		jdbcTemplate.update(CEConstant.SQL_UPDATE, poT.codigoAfiliado, poT.saldoCIC, poT.id);
		LOG.info("[EVL] After JdbcTemplate : {}", jdbcTemplate);
	}

	@Override
	public void eliminar(int piId) {
		LOG.info("[EVL] =====[ Start eliminar ]=====");
		LOG.info("[EVL] Delete : {}", CEConstant.SQL_DELETE);
		jdbcTemplate.update(CEConstant.SQL_DELETE, piId);
		LOG.info("[EVL] After jdbcTemplate : {}", jdbcTemplate);
	}

	@Override
	public CESaldoAfiliadoCustom buscarById(int piId) {
		LOG.info("[EVL] =====[ Start buscarById ]=====");
		LOG.info("[EVL] Query By Id : {}", CEConstant.SQL_SELECT_BY_ID);
		
		List<CESaldoAfiliadoCustom> oCEList = jdbcTemplate.query(CEConstant.SQL_SELECT_BY_ID, 
				new Object[] {piId}, (resultSet, i)->{
					return toSaldoAfiliado(resultSet);
				});
		LOG.info("[EVL] oCEList : {}", oCEList);
        if (oCEList.size() == 1) {
        	LOG.info("[EVL] Instance CESaldoAfiliadoCustom : {}", oCEList.get(0));
            return oCEList.get(0);
        }
		return null;
	}

	@Override
	public List<CESaldoAfiliadoCustom> listarAll() {
		LOG.info("[EVL] =====[ Start listarAll ]=====");
		
		LOG.info("[EVL] Instance JdbcTemplate : {}", jdbcTemplate);
		
		LOG.info("[EVL] SQL_SELECT_ALL : {}", CEConstant.SQL_SELECT_ALL);
		return jdbcTemplate.query(CEConstant.SQL_SELECT_ALL, (resultSet ,i)->{
			return toSaldoAfiliado(resultSet);
		});
	}

	private CESaldoAfiliadoCustom toSaldoAfiliado(ResultSet poResultSet) throws SQLException {
		LOG.info("[EVL] =====[ Start toSaldoAfiliado ]=====");
		
		moCESaldo=new CESaldoAfiliadoCustom();
		LOG.info("[EVL] Instance CESaldoAfiliadoCustom : {}", moCESaldo);
		
		moCESaldo.setId(poResultSet.getInt("id"));
		moCESaldo.setCodigoAfiliado(poResultSet.getString("cod_afiliado"));
		moCESaldo.setSaldoCIC(poResultSet.getDouble("saldo_afiliado"));
		LOG.info("[EVL] Instance CESaldoAfiliadoCustom : {}", moCESaldo);
		
		LOG.info("[EVL] New Instance CESaldoAfiliadoCustom : {}", CEConstant.SQL_SELECT_BY_ID);
		return moCESaldo;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
