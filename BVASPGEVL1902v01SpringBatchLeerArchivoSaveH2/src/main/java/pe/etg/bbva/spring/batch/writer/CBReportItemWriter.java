package pe.etg.bbva.spring.batch.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import pe.etg.bbva.spring5.entity.CEReport;

import java.util.List;

public class CBReportItemWriter implements ItemWriter<CEReport> {

    private static final Logger MOLOG = LoggerFactory.getLogger(CBReportItemWriter.class);

    @Override
    public void write(List<? extends CEReport> list) throws Exception {
    	MOLOG.info("[EVL] Cantidad de Datos Salida : {}", list.size());
        for (CEReport r: list) {
        	MOLOG.info("[EVL] Out Reporte: {}", r.toString());
        }
    }
}


