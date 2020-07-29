package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.model.impl.CDSaldoAfiliado;

public class CV0401v01Eliminando {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0401v01Eliminando.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml",
			"classpath:/pe/bbva/evalua/spring5/entity/context-JdbcTemplate.xml"
    };

	public static void main(String[] args) {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Instance context     : {}", moCntx);
		CDSaldoAfiliado oCDSaldo = (CDSaldoAfiliado) moCntx.getBean("idCDSaldoAfiliado");
		MOLOG.info("[EVL] Instance CDSaldoAfiliado : {}", oCDSaldo);
				
		oCDSaldo.eliminar(30);
		MOLOG.info("[EVL] Instance After CDSaldoAfiliado : {}", oCDSaldo);
		
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
