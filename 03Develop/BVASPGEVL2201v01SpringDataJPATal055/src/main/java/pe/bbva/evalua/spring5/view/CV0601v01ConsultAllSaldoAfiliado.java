package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.config.CEConfigEntity;
import pe.bbva.evalua.spring5.config.CEConfigSpringDataJpa;
import pe.bbva.evalua.spring5.service.CSSaldoAfiliado;

public class CV0601v01ConsultAllSaldoAfiliado {
	private static Logger LOG = LoggerFactory.getLogger(CV0601v01ConsultAllSaldoAfiliado.class);

	public static void main(String[] args){
		LOG.info("[EVL] =====[ Start main ]=====");
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		oCntx.register(CEConfigEntity.class);
		oCntx.register(CEConfigSpringDataJpa.class);
		oCntx.refresh();

		LOG.info("[EVL] Instance of context     : {}", oCntx);
		
		CSSaldoAfiliado oCDSaldo = oCntx.getBean(CSSaldoAfiliado.class);
		LOG.info("[EVL] Instance of CSSaldoAfiliado : {}", oCDSaldo);
		LOG.info("[EVL] listAll : {}", oCDSaldo.getAllSaldoAfiliado());
		
		((ConfigurableApplicationContext) oCntx).close();		
	}
}
