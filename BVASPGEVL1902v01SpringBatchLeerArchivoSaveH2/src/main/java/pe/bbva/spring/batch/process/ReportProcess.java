package pe.bbva.spring.batch.process;

import pe.bbva.spring.batch.dto.Report;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class ReportProcess implements ItemProcessor<Report, Report>{

    private static final Logger log = LoggerFactory.getLogger(ReportProcess.class);

    @Override
    public Report process(Report report) throws Exception {
        log.info("Process Report {}", report.toString());

        return report;
    }
}

