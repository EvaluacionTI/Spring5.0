package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.model.impl.CSLoadFecha;

public class CV02ShowDateConCacheXml {
	private static final Logger LOG = LoggerFactory.getLogger("CV02ShowDateConCacheXml");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciado");

		ClassPathXmlApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-context.xml");
		LOG.info("[EVL] ApplicationContext : {}", oCntx);

		CSLoadFecha oCServicio = oCntx.getBean(CSLoadFecha.class);
		LOG.info("[EVL] Instancia CSLoadFecha : {}", oCServicio);

		Thread t = new Thread(() -> {
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000);
					LOG.info("[EVL] Send cache : {}", oCServicio.fechaActualConCache());
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});
		LOG.info("[EVL] Iniciando Tread : {}", t);
		t.start();

		((ConfigurableApplicationContext) oCntx).close();

	}

}
