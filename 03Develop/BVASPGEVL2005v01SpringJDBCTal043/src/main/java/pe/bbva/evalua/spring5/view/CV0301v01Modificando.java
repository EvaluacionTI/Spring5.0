package pe.bbva.evalua.spring5.view;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.impl.CDSaldoAfiliado;

public class CV0301v01Modificando {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0301v01Modificando.class);
	
	private static CESaldoAfiliadoCustom moCESaldoAfiliado;
	
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml",
			"classpath:/pe/bbva/evalua/spring5/entity/context-JdbcTemplate.xml"
    };
	
	public static void main(String[] args) throws ParseException {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		MOLOG.info("[EVL] Entidad CESaldoAfiliadoCustom  : {}", moCESaldoAfiliado);
		
		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Iniciando contexto     : {}", moCntx);
		
		CDSaldoAfiliado oCDSaldo = (CDSaldoAfiliado) moCntx.getBean("idCDSaldoAfiliado");
		MOLOG.info("[EVL] Controladora Tipo Plan : {}", oCDSaldo);
		
		moCESaldoAfiliado = new CESaldoAfiliadoCustom();
		MOLOG.info("[EVL] Instance CESaldoAfiliadoCustom : {} ", moCESaldoAfiliado);
		
		// 3. Sett data 
		moCESaldoAfiliado.setId(30);
		moCESaldoAfiliado.setCodigoAfiliado("7522309");
		moCESaldoAfiliado.setSaldoCIC(7522309.20);
		
		MOLOG.info("[EVL] Instance CESaldoAfiliadoCustom  : {} ", moCESaldoAfiliado);
		oCDSaldo.actualizar(moCESaldoAfiliado);
		MOLOG.info("[EVL] Instance CDSaldoAfiliado : {} ", oCDSaldo);

		((ConfigurableApplicationContext) moCntx).close();	
	}
}
