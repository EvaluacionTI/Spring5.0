package pe.etg.bbva.evalua.spring5.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.etg.bbva.evalua.spring5.entity.CECompraDTOEntrada;
import pe.etg.bbva.evalua.spring5.entity.CECompraDTOSalida;

public class CLCompraProcessor implements ItemProcessor<CECompraDTOEntrada, CECompraDTOSalida>{

	private static final Logger MOLOG = LoggerFactory.getLogger(CLCompraProcessor.class);
	
	@Override
	public CECompraDTOSalida process(CECompraDTOEntrada poItemCompra) throws Exception {
		
		CECompraDTOSalida oCompraSalida = new CECompraDTOSalida();
		
		oCompraSalida.setId(poItemCompra.getId());
		oCompraSalida.setPrecio(poItemCompra.getPrecio());
		oCompraSalida.setCantidad(poItemCompra.getCantidad());
		oCompraSalida.setProducto(poItemCompra.getProducto());
		oCompraSalida.setFechaCompra(poItemCompra.getFechaCompra());
		
		MOLOG.info("[EVL] CECompraDTOEntrada : {}", poItemCompra.toString());
		MOLOG.info("[EVL] CECompraDTOSalida  : {}", oCompraSalida.toString());
		
		return oCompraSalida;
	}

}
