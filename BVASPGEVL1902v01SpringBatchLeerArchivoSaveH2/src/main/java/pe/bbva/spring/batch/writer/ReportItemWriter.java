package pe.bbva.spring.batch.writer;

import pe.bbva.spring.batch.dto.Report;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class ReportItemWriter implements ItemWriter<Report> {

    private static final Logger log = LoggerFactory.getLogger(ReportItemWriter.class);

    @Override
    public void write(List<? extends Report> list) throws Exception {
        log.info("Out: Datos de Salida ");
        for (Report r: list) {
            log.info("Out Reporte: {}", r.toString());
        }
    }
}


