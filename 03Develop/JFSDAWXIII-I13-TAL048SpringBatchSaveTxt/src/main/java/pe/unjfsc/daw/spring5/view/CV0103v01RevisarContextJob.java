package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV0103v01RevisarContextJob {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0103v01RevisarContextJob.class);
	private static ApplicationContext moContext;
	private static String[] configJob = {
			"classpath:/batch/jobs/job03-define-jobs.xml"
    };

	public static void main(String[] psaLista) {
		MOLOG.info("[EVL]===== [ Start main ]=====");

		MOLOG.info("[EVL] psaLista               : {}", psaLista.length);
		
		moContext = new ClassPathXmlApplicationContext(configJob);
		MOLOG.info("[EVL] moContext              : {}", moContext);

		DelimitedLineTokenizer oDLTCompra = (DelimitedLineTokenizer) moContext.getBean("idCompraToken");
		MOLOG.info("[EVL] DelimitedLineTokenizer : {}", oDLTCompra.toString());
		
		DefaultLineMapper oDLMCompra = (DefaultLineMapper) moContext.getBean("idCompraLineMapper");
		MOLOG.info("[EVL] DefaultLineMapper      : {}", oDLMCompra.toString());
		
		FlatFileItemReader oFFIRCompra = (FlatFileItemReader) moContext.getBean("idCompraReader");
		MOLOG.info("[EVL] FlatFileItemReader     : {}", oFFIRCompra);

        ((ConfigurableApplicationContext) moContext).close();
	}
}
