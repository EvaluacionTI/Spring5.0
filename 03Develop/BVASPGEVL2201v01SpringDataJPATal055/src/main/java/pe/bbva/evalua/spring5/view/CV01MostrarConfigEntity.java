package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.config.CEConfigEntity;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public class CV01MostrarConfigEntity {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarArrayList");

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[EVL] Instancia Context : {}", oCntx);

		oCntx.register(CEConfigEntity.class);
		oCntx.refresh();
		
		CESaldoAfiliadoCustom oCESaldo = (CESaldoAfiliadoCustom) oCntx.getBean("idCESaldo");
		oCESaldo.setId(15);
		oCESaldo.setCodigoAfiliado("930225");
		oCESaldo.setSaldoCIC(28847.98);
		LOG.info("[EVL] Instancia CESaldoAfiliadoCustom : {}", oCESaldo);

		((ConfigurableApplicationContext) oCntx).close();	
	}

}
