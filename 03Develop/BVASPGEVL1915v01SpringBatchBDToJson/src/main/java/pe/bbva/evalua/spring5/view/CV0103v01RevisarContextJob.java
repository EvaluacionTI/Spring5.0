package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

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

		JdbcCursorItemReader oDLTCompra = (JdbcCursorItemReader) moContext.getBean("idReaderPostgres");
		MOLOG.info("[EVL] JdbcCursorItemReader : {}", oDLTCompra.toString());
		
		CESaldoAfiliadoCustom oDLMCompra = (CESaldoAfiliadoCustom) moContext.getBean("idCESaldoAfiliado");
		MOLOG.info("[EVL] CESaldoAfiliadoCustom      : {}", oDLMCompra.toString());
		
        ((ConfigurableApplicationContext) moContext).close();
	}
}
