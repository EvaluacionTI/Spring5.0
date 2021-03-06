package pe.bbva.evalua.spring5.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.bbva.evalua.spring5.entity.CECompraDTOEntrada;
import pe.bbva.evalua.spring5.entity.CECompraDTOSalida;

public class CLCompraProcessor implements ItemProcessor<CECompraDTOEntrada, CECompraDTOSalida>{

	private static final Logger MOLOG = LoggerFactory.getLogger(CLCompraProcessor.class);
	
	public CECompraDTOSalida process(CECompraDTOEntrada poItemCompra) throws Exception {
		MOLOG.info("[EVL] =====[ Start process ]=====");
		MOLOG.info("[EVL] Data received input : {} ", poItemCompra.toString());
		CECompraDTOSalida oCompraSalida = new CECompraDTOSalida();
		
		oCompraSalida.setId(poItemCompra.getId());
		oCompraSalida.setPrecio(poItemCompra.getPrecio());
		oCompraSalida.setCantidad(poItemCompra.getCantidad());
		oCompraSalida.setProducto(poItemCompra.getProducto());
		oCompraSalida.setFechaCompra(poItemCompra.getFechaCompra());
		MOLOG.info("[EVL] New CECompraDTOSalida : {} ", oCompraSalida.toString());

		return oCompraSalida;
	}
}
