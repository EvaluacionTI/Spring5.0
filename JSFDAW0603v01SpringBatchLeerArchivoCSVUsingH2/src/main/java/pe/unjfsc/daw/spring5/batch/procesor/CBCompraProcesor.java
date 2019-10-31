package pe.unjfsc.daw.spring5.batch.procesor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.unjfsc.daw.spring5.entity.CECompraEntrada;
import pe.unjfsc.daw.spring5.entity.CECompraSalida;

public class CBCompraProcesor implements ItemProcessor<CECompraEntrada, CECompraSalida> {
	private static Logger MOLOG = LoggerFactory.getLogger(CBCompraProcesor.class);
	
	@Override
	public CECompraSalida process(CECompraEntrada arg0) throws Exception {
		CECompraSalida oCECompra = new CECompraSalida();
		
		oCECompra.setId(arg0.getId());
		oCECompra.setProducto(arg0.getProducto());
		oCECompra.setCantidad(arg0.getCantidad()*16);
		oCECompra.setPrecio(arg0.getPrecio()*4);
		oCECompra.setFechaCompra(arg0.getFechaCompra());

		MOLOG.info("[EVL] Objeto CECompraEntrada : {}", arg0.toString());
		MOLOG.info("[EVL] Objeto CECompraSalida : {}", oCECompra.toString());
		
		return oCECompra;
	}
}
