package pe.etg.bbva.evalua.spring5.batch.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.etg.bbva.evalua.spring5.entity.CECompraDTOEntrada;

public class CLCompraMapper implements FieldSetMapper<CECompraDTOEntrada> {
	private static final Logger MOLOG = LoggerFactory.getLogger(CLCompraMapper.class);
	
	@Override
	public CECompraDTOEntrada mapFieldSet(FieldSet poFieldSet) throws BindException {

		CECompraDTOEntrada oCompraEntrada = new CECompraDTOEntrada();
		oCompraEntrada.setId(poFieldSet.readInt("ID"));
		oCompraEntrada.setPrecio(poFieldSet.readDouble("PRECIO"));
		oCompraEntrada.setCantidad(poFieldSet.readDouble("CANTIDAD"));
		oCompraEntrada.setProducto(poFieldSet.readString("NOMBRE"));
		oCompraEntrada.setFechaCompra(poFieldSet.readString("FECHA"));
		
		MOLOG.info("[EVL] FieldSet : {} ", poFieldSet.toString());
		MOLOG.info("[EVL] CECompraDTOEntrada : {} ", oCompraEntrada.toString());
		
		return oCompraEntrada;
	}

}
