package pe.etg.bbva.evalua.spring5.batch.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.evalua.spring5.batch.processor.CLCompraProcessor;
import pe.etg.bbva.evalua.spring5.batch.writer.CDCompraWriter;

public class CV0103v01RevisarContextJob {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0103v01RevisarContextJob.class);
	private static ApplicationContext moContext;
	private static String[] configJob = {
			"classpath:/batch/jobs/job03-define-jobs.xml"
    };

	public static void main(String[] psaLista) {
		MOLOG.info("=====> [EVL] Start method main(String[] psaLista)");
	
		moContext = new ClassPathXmlApplicationContext(configJob);
		DelimitedLineTokenizer oDLTCompra = (DelimitedLineTokenizer) moContext.getBean("idCompraToken");
		DefaultLineMapper oDLMCompra = (DefaultLineMapper) moContext.getBean("idCompraLineMapper");
		FlatFileItemReader oFFIRCompra = (FlatFileItemReader) moContext.getBean("idCompraReader");

		CLCompraProcessor oCLCompra = (CLCompraProcessor) moContext.getBean("idCompraProcesor");
		CDCompraWriter oCDCompra = (CDCompraWriter) moContext.getBean("idCompraWriter");
		
		MOLOG.info(" => [EVL] psaLista               : {}", psaLista.length);
		MOLOG.info(" => [EVL] moContext              : {}", moContext);
		MOLOG.info(" => [EVL] DelimitedLineTokenizer : {}", oDLTCompra.toString());
		MOLOG.info(" => [EVL] DefaultLineMapper      : {}", oDLMCompra.toString());
		MOLOG.info(" => [EVL] FlatFileItemReader     : {}", oFFIRCompra);
		MOLOG.info(" => [EVL] CLCompraProcessor      : {}", oCLCompra.toString());
		MOLOG.info(" => [EVL] CDCompraWriter         : {}", oCDCompra.toString());

        MOLOG.info(" =====> [EVL] End method main(String[] psaLista)");
        
        ((ConfigurableApplicationContext) moContext).close();
	}
}
