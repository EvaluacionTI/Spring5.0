package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.entity.CEConfigCache;
import pe.bbva.evalua.spring5.entity.CEUsuario;

public class CV10MostrarCacheAnotation {
	public static final Logger LOG = LoggerFactory.getLogger("CV10MostrarCacheAnotation");
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando execute ");
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();

		LOG.info("[EVL] AnnotationConfigApplicationContext : {}", oCntx);
		oCntx.register(CEConfigCache.class);
		oCntx.refresh();
		
		CEUsuario oUsuario = (CEUsuario) oCntx.getBean("oCEUsuario");
		LOG.info("[EVL] CEUsuario : {}", oUsuario);
		
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
