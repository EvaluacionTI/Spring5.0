package pe.unjfsc.daw.spring5.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.unjfsc.daw.spring5.entity.CECompraDTOSalida;

public class CDWriterCompra implements ItemWriter<CECompraDTOSalida> {

	private static final Logger LOG = LoggerFactory.getLogger(CDWriterCompra.class);

	@Override
	public void write(List<? extends CECompraDTOSalida> items) throws Exception {
		LOG.info("[EVL] =====[ Start write ]=====");
		
		LOG.info("[EVL] Object output : {} ", items.toString());
		
		for(CECompraDTOSalida item:items) {
			LOG.info("[EVL] Item read  : {}", item.toString());
		}
	}


}
