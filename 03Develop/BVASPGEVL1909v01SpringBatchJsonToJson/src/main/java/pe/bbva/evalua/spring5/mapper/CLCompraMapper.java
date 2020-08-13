package pe.bbva.evalua.spring5.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.bbva.evalua.spring5.entity.CECompraDTOEntrada;

public class CLCompraMapper implements FieldSetMapper<CECompraDTOEntrada> {
	private static final Logger MOLOG = LoggerFactory.getLogger(CLCompraMapper.class);
	
	public CECompraDTOEntrada mapFieldSet(FieldSet poFieldSet) throws BindException {
		MOLOG.info("[EVL] =====[ Start mapFieldSet ]=====");
		MOLOG.info("[EVL] read record : {} ", poFieldSet.toString());
		
		CECompraDTOEntrada oCompraEntrada = new CECompraDTOEntrada();
		oCompraEntrada.setId(poFieldSet.readInt("ID"));
		oCompraEntrada.setPrecio(poFieldSet.readDouble("PRECIO"));
		oCompraEntrada.setCantidad(poFieldSet.readDouble("CANTIDAD"));
		oCompraEntrada.setProducto(poFieldSet.readString("NOMBRE"));
		oCompraEntrada.setFechaCompra(poFieldSet.readString("FECHA"));
		
		MOLOG.info("[EVL] Mapper to CECompraDTOEntrada : {}", oCompraEntrada.toString());

		return oCompraEntrada;
	}

}
