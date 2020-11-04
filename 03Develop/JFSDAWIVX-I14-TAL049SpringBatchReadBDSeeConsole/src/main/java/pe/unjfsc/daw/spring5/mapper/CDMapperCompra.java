package pe.unjfsc.daw.spring5.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import pe.unjfsc.daw.spring5.entity.CECompraDTOEntrada;
import pe.unjfsc.daw.spring5.entity.CEConstant;


public class CDMapperCompra implements RowMapper<CECompraDTOEntrada>{
	private static final Logger LOG = LoggerFactory.getLogger("CDMapperCompra");
	
	public CECompraDTOEntrada mapRow(ResultSet rs, int rowNum) throws SQLException {
		LOG.info("[EVL] =====[ Start mapRow ]=====");
		LOG.info("[EVL] ResultSet : {} ", rs.toString());
		LOG.info("[EVL] rowNum : {} ", rowNum);
		
		CECompraDTOEntrada oSaldo = new CECompraDTOEntrada();
		LOG.info("[EVL] Instance CESaldoAfiliadoCustom : {} ", oSaldo.toString());
		
		oSaldo.setId(rs.getInt(CEConstant.COLUMN_ID));
		oSaldo.setPrecio(rs.getDouble(CEConstant.COLUMN_PRECIO));
		oSaldo.setCantidad(rs.getDouble(CEConstant.COLUMN_CANTIDAD));
		oSaldo.setProducto(rs.getString(CEConstant.COLUMN_NOMBRE));
		oSaldo.setFechaCompra(rs.getString(CEConstant.COLUMN_FECHA));
		
		LOG.info("[EVL] New CESaldoAfiliadoCustom Output : {} ", oSaldo.toString());
		
		return oSaldo;
	}

}
