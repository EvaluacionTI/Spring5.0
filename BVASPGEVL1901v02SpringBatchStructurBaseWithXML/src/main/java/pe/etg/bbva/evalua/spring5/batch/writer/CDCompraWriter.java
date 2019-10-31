package pe.etg.bbva.evalua.spring5.batch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.etg.bbva.evalua.spring5.entity.CECompraDTOSalida;

public class CDCompraWriter implements ItemWriter<CECompraDTOSalida> {

	private static final Logger MOLOG = LoggerFactory.getLogger(CDCompraWriter.class);
	
	@Override
	public void write(List<? extends CECompraDTOSalida> poItemsSalida) throws Exception {
		
		MOLOG.info("[EVL] CECompraDTOSalida : {} ", poItemsSalida);
		
		for(CECompraDTOSalida item:poItemsSalida) {
			MOLOG.info("[EVL] item Out Buy: {}", item.toString());
		}
	}


}
