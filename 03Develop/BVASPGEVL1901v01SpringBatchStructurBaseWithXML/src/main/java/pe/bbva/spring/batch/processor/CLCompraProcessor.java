package pe.bbva.spring.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.etg.bbva.spring.entity.CECompraDTOEntrada;
import pe.etg.bbva.spring.entity.CECompraDTOSalida;

public class CLCompraProcessor implements ItemProcessor<CECompraDTOEntrada, CECompraDTOSalida>{

	private static final Logger MOLOG = LoggerFactory.getLogger(CLCompraProcessor.class);
	
	@Override
	public CECompraDTOSalida process(CECompraDTOEntrada poItemCompra) throws Exception {
		MOLOG.info("=====> [EVL] Start method : process(CECompraDTOEntrada poItemCompra)");
		MOLOG.info("=> [EVL] Dato de entrada : {} ", poItemCompra.toString());
		CECompraDTOSalida oCompraSalida = new CECompraDTOSalida();
		
		oCompraSalida.setId(poItemCompra.getId());
		oCompraSalida.setPrecio(poItemCompra.getPrecio());
		oCompraSalida.setCantidad(poItemCompra.getCantidad());
		oCompraSalida.setProducto(poItemCompra.getProducto());
		oCompraSalida.setFechaCompra(poItemCompra.getFechaCompra());
		MOLOG.info("=> [EVL] Dato de salida  : {} ", oCompraSalida.toString());
		MOLOG.info(" =====> [EVL] End method : process(CECompraDTOEntrada poItemCompra)");
		
		return oCompraSalida;
	}

}
