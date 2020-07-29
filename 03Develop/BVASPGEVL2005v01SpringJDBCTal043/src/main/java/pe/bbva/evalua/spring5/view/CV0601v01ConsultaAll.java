package pe.bbva.evalua.spring5.view;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.impl.CDSaldoAfiliado;

public class CV0601v01ConsultaAll {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0601v01ConsultaAll.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml",
			"classpath:/pe/bbva/evalua/spring5/entity/context-JdbcTemplate.xml"
    };
	public static void main(String[] args){
		MOLOG.info("[EVL] =====[ Start main ]=====");

		List<CESaldoAfiliadoCustom> oListaTipoPlan = new ArrayList<CESaldoAfiliadoCustom>();
		MOLOG.info("[EVL] Instance List<CE01TipoPlan>     : {}", oListaTipoPlan);
		
		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Instance of context     : {}", moCntx);
		
		CDSaldoAfiliado oCDTipoPlan = (CDSaldoAfiliado) moCntx.getBean("idCDSaldoAfiliado");
		MOLOG.info("[EVL] Instance CDSaldoAfiliado : {}", oCDTipoPlan);
	
		oListaTipoPlan = oCDTipoPlan.listarAll();
		MOLOG.info("====> Cantidad CDSaldoAfiliado : {} ", oListaTipoPlan.size());
		
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
