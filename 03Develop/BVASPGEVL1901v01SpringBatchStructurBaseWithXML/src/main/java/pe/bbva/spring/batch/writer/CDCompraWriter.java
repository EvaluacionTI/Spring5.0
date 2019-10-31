package pe.bbva.spring.batch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.etg.bbva.spring.entity.CECompraDTOSalida;

public class CDCompraWriter implements ItemWriter<CECompraDTOSalida> {

	private static final Logger MOLOG = LoggerFactory.getLogger(CDCompraWriter.class);
	
	@Override
	public void write(List<? extends CECompraDTOSalida> poItemsSalida) throws Exception {
		MOLOG.info("=====> [EVL] Start method : write(List<? extends CECompraDTOSalida> poItemsSalida)");
		MOLOG.info("=> Salida : {} ", poItemsSalida.toString());
		
		for(CECompraDTOSalida item:poItemsSalida) {
			MOLOG.info("=> item Salida : {}", item.toString());
		}
		MOLOG.info(" =====> [EVL] End method : write(List<? extends CECompraDTOSalida> poItemsSalida)");
	}


}
