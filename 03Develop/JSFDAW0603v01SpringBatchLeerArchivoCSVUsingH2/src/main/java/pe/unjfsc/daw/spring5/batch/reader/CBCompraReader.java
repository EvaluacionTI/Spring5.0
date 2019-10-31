package pe.unjfsc.daw.spring5.batch.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.unjfsc.daw.spring5.entity.CECompraEntrada;

public class CBCompraReader implements FieldSetMapper<CECompraEntrada> {
	private static Logger MOLOG = LoggerFactory.getLogger(CBCompraReader.class);
	
	@Override
	public CECompraEntrada mapFieldSet(FieldSet arg0) throws BindException {
		CECompraEntrada oCECompra = new CECompraEntrada();
		
		oCECompra.setId(arg0.readInt("ID"));
		oCECompra.setProducto(arg0.readString("PRODUCTO"));
		oCECompra.setPrecio(arg0.readDouble("PRECIO"));
		oCECompra.setCantidad(arg0.readDouble("CANTIDAD"));
		oCECompra.setFechaCompra(arg0.readString("FECHA"));
		
		MOLOG.info("[EVL] Objeto mapper : {} ", arg0);		
		MOLOG.info("[EVL] Objeto CECompraEntrada : {} ", oCECompra.toString());
		
		return oCECompra;
	}
}
