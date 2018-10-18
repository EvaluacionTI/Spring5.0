package pe.bbva.spring.batch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.etg.bbva.spring.entidad.CECompraDTOSalida;

public class CDCompraWriter implements ItemWriter<CECompraDTOSalida> {

	private static final Logger MOLOG = LoggerFactory.getLogger(CDCompraWriter.class);
	
	@Override
	public void write(List<? extends CECompraDTOSalida> poItemsSalida) throws Exception {
		
		MOLOG.info("=====> Iniciando escritura de Compra [ ", poItemsSalida);
		
		for(CECompraDTOSalida item:poItemsSalida) {
			MOLOG.info("Out Buy: {}", item.toString());
		}
		
		MOLOG.info("=====> Finalizando escritura de compra [ ");
	}


}
