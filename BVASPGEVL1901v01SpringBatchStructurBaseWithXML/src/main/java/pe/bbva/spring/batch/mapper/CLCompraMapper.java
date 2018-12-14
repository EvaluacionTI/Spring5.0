package pe.bbva.spring.batch.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.etg.bbva.spring.entity.CECompraDTOEntrada;

public class CLCompraMapper implements FieldSetMapper<CECompraDTOEntrada> {
	private static final Logger MOLOG = LoggerFactory.getLogger(CLCompraMapper.class);
	
	@Override
	public CECompraDTOEntrada mapFieldSet(FieldSet poFieldSet) throws BindException {
		MOLOG.info("=====> [EVL] Start method : mapFieldSet(FieldSet poFieldSet)");
		MOLOG.info("=> [EVL] Lectura del registro : {} ", poFieldSet.toString());
		
		CECompraDTOEntrada oCompraEntrada = new CECompraDTOEntrada();
		oCompraEntrada.setId(poFieldSet.readInt("ID"));
		oCompraEntrada.setPrecio(poFieldSet.readDouble("PRECIO"));
		oCompraEntrada.setCantidad(poFieldSet.readDouble("CANTIDAD"));
		oCompraEntrada.setProducto(poFieldSet.readString("NOMBRE"));
		oCompraEntrada.setFechaCompra(poFieldSet.readString("FECHA"));
		
		MOLOG.info("=> [EVL] Mapper del Proceso   : {}", oCompraEntrada.toString());
		MOLOG.info(" =====> [EVL] End method : mapFieldSet(FieldSet poFieldSet)");
		return oCompraEntrada;
	}

}
