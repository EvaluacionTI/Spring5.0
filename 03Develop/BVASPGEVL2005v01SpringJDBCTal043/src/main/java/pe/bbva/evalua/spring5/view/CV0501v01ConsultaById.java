package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.impl.CDSaldoAfiliado;

public class CV0501v01ConsultaById {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0501v01ConsultaById.class);
	
	@Autowired
	private static CESaldoAfiliadoCustom moCESaldoAfiliado;
	
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml",
			"classpath:/pe/bbva/evalua/spring5/entity/context-JdbcTemplate.xml"
    };
	public static void main(String[] args){
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Iniciando contexto     : {}", moCntx);
		CDSaldoAfiliado oCDSaldo = (CDSaldoAfiliado) moCntx.getBean("idCDSaldoAfiliado");
		MOLOG.info("[EVL] CDSaldoAfiliado : {}", oCDSaldo);
	
		moCESaldoAfiliado = oCDSaldo.buscarById(4);;
		MOLOG.info("[EVL] CESaldoAfiliadoCustom: {} ", moCESaldoAfiliado);
		
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
