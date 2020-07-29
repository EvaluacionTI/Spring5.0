package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.service.CSSaldoAfiliado;

public class CV0601v01ConsultAllSaldoAfiliado {
	private static Logger LOG = LoggerFactory.getLogger(CV0601v01ConsultAllSaldoAfiliado.class);

	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-persistence-jpa.xml"
    };
	public static void main(String[] args){
		LOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		LOG.info("[EVL] Instance of context     : {}", moCntx);
		
		CSSaldoAfiliado oCDSaldo = moCntx.getBean(CSSaldoAfiliado.class);
		LOG.info("[EVL] Instance of CSSaldoAfiliado : {}", oCDSaldo);
		LOG.info("[EVL] listAll : {}", oCDSaldo.listAll());
		
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
