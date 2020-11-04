package pe.unjfsc.daw.spring5.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.unjfsc.daw.spring5.entity.CECompraDTOEntrada;
import pe.unjfsc.daw.spring5.entity.CECompraDTOSalida;


public class CUProcesCompra implements ItemProcessor<CECompraDTOEntrada, CECompraDTOSalida>{

	private static final Logger LOG = LoggerFactory.getLogger(CUProcesCompra.class);

	@Override
	public CECompraDTOSalida process(CECompraDTOEntrada item) throws Exception {
		LOG.info("[EVL] =====[ Start process ]=====");
		LOG.info("[EVL] Data received input : {} ", item.toString());
		
		CECompraDTOSalida oSaldoOutput = new CECompraDTOSalida();
		LOG.info("[EVL] Instance CESaldoAfiliadoCustom Output : {} ", oSaldoOutput.toString());
		
		oSaldoOutput.setId(item.getId());
		oSaldoOutput.setPrecio(item.getPrecio());
		oSaldoOutput.setCantidad(item.getCantidad());
		oSaldoOutput.setProducto(item.getProducto());
		oSaldoOutput.setFechaCompra(item.getFechaCompra());
		
		LOG.info("[EVL] New CESaldoAfiliadoCustom : {} ", oSaldoOutput.toString());
		return oSaldoOutput;
	}

}
