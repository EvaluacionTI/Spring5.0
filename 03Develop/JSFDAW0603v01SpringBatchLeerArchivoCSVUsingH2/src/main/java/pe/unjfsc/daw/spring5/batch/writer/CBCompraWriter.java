package pe.unjfsc.daw.spring5.batch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.unjfsc.daw.spring5.entity.CECompraSalida;

public class CBCompraWriter implements ItemWriter<CECompraSalida> {
	private static Logger MOLOG = LoggerFactory.getLogger(CBCompraWriter.class);
	
	@Override
	public void write(List<? extends CECompraSalida> arg0) throws Exception {
	
		MOLOG.info("[EVL] Collection List : {} ", arg0.size());
		
		for(CECompraSalida oRow:arg0) {
			MOLOG.info("[EVL] Objeto CECompraSalida : {} ", oRow.toString());
		}
	}
}
