package pe.bbva.evalua.spring5.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public class CDMapperSaldoAfiliado implements RowMapper<CESaldoAfiliadoCustom>{
	private static final Logger LOG = LoggerFactory.getLogger("CDReaderDataBase");
	
	public CESaldoAfiliadoCustom mapRow(ResultSet rs, int rowNum) throws SQLException {
		LOG.info("[EVL] =====[ Start mapRow ]=====");
		LOG.info("[EVL] ResultSet : {} ", rs.toString());
		LOG.info("[EVL] rowNum : {} ", rowNum);
		
		CESaldoAfiliadoCustom oSaldo = new CESaldoAfiliadoCustom();
		LOG.info("[EVL] Instance CESaldoAfiliadoCustom : {} ", oSaldo.toString());
		
		oSaldo.setId(rs.getInt(CEConstant.COLUMN_ID));
		oSaldo.setCodigoAfiliado(rs.getString(CEConstant.COLUMN_CODE));
		oSaldo.setSaldoCIC(rs.getDouble(CEConstant.COLUMN_SALDO));
		
		LOG.info("[EVL] New CESaldoAfiliadoCustom Output : {} ", oSaldo.toString());
		
		return oSaldo;
	}

}
