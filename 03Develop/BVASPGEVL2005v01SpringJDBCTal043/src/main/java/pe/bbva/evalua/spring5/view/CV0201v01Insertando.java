package pe.bbva.evalua.spring5.view;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.impl.CDSaldoAfiliado;

public class CV0201v01Insertando {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0201v01Insertando.class);
	
	private static CESaldoAfiliadoCustom moCESaldoAfiliado;
	
	private static ConfigurableApplicationContext moCntx;
	// 2. Definimos el contexto
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml",
			"classpath:/pe/bbva/evalua/spring5/entity/context-JdbcTemplate.xml"
    };
	
	public static void main(String[] args) throws ParseException {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Instance contexto     : {}", moCntx);
		MOLOG.info("[EVL] Instance CESaldoAfiliadoCustom      : {}", moCESaldoAfiliado);
		
		CDSaldoAfiliado oCDSaldo = (CDSaldoAfiliado) moCntx.getBean("idCDSaldoAfiliado");
		MOLOG.info("[EVL] Controladora CDSaldoAfiliado : {}", oCDSaldo);
	
		moCESaldoAfiliado = new CESaldoAfiliadoCustom();
		MOLOG.info("[EVL] Instance CESaldoAfiliadoCustom : {} ", moCESaldoAfiliado);
		// 3. Sett data 
		moCESaldoAfiliado.setId(30);
		moCESaldoAfiliado.setCodigoAfiliado("522309");
		moCESaldoAfiliado.setSaldoCIC(522309.20);
		
		MOLOG.info("[EVL] Instance new CESaldoAfiliadoCustom : {} ", moCESaldoAfiliado);
		
		// 4. Estamos accediendo a la capa modelo, luego debemos acceder a la capa controladora
		oCDSaldo.grabar(moCESaldoAfiliado);
		MOLOG.info("[EVL] Instance CDSaldoAfiliado : {} ", oCDSaldo);

		((ConfigurableApplicationContext) moCntx).close();		
	}
}
