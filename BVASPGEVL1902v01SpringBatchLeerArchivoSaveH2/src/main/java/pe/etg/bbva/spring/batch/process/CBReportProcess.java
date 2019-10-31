package pe.etg.bbva.spring.batch.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import pe.etg.bbva.spring5.entity.CEReport;

public class CBReportProcess implements ItemProcessor<CEReport, CEReport>{

    private static final Logger MOLOG = LoggerFactory.getLogger(CBReportProcess.class);

    @Override
    public CEReport process(CEReport report) throws Exception {
    	MOLOG.info("[EVL] Process CEReport {}", report.toString());

        return report;
    }
}

