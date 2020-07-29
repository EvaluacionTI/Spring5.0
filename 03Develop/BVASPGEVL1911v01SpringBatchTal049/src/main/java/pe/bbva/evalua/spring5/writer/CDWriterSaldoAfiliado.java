package pe.bbva.evalua.spring5.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public class CDWriterSaldoAfiliado implements ItemWriter<CESaldoAfiliadoCustom> {

	private static final Logger LOG = LoggerFactory.getLogger(CDWriterSaldoAfiliado.class);

	@Override
	public void write(List<? extends CESaldoAfiliadoCustom> items) throws Exception {
		LOG.info("[EVL] =====[ Start write ]=====");
		
		LOG.info("[EVL] Object output : {} ", items.toString());
		
		for(CESaldoAfiliadoCustom item:items) {
			LOG.info("[EVL] Item read  : {}", item.toString());
		}
	}


}
