package pe.bbva.evalua.spring5.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.bbva.evalua.spring5.entity.CECompraDTOSalida;

public class CDCompraWriter implements ItemWriter<CECompraDTOSalida> {

	private static final Logger LOG = LoggerFactory.getLogger(CDCompraWriter.class);

	public void write(List<? extends CECompraDTOSalida> poItemsSalida) throws Exception {
		LOG.info("[EVL] =====[ Start write ]=====");
		
		LOG.info("[EVL] Object output : {} ", poItemsSalida.toString());
		
		for(CECompraDTOSalida item:poItemsSalida) {
			LOG.info("[EVL] Item read  : {}", item.toString());
		}
	}
}
