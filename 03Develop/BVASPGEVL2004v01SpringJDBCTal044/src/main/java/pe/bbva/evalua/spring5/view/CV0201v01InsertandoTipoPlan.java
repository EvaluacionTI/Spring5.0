package pe.bbva.evalua.spring5.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE01TipoPlan;
import pe.bbva.evalua.spring5.model.impl.CD01TipoPlan;

public class CV0201v01InsertandoTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0201v01InsertandoTipoPlan.class);
	
	private static ConfigurableApplicationContext moCntx;
	// Manejo de formato de fechas
	private static SimpleDateFormat oSDF = new SimpleDateFormat("dd/MM/yyyy");
	// 2. Definimos el contexto
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml",
			"classpath:/pe/bbva/evalua/spring5/entity/spring-bean-tipo-plan.xml"
    };
	
	public static void main(String[] args) throws ParseException {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Iniciando contexto     : {}", moCntx);
		
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idCDTipoPlan");
		MOLOG.info("[EVL] Controladora Tipo Plan : {}", oCDTipoPlan);
		
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		MOLOG.info("[EVL] Entidad Tipo Plan      : {}", oCETipoPlan);
	
		// 3. Sett data para el objeto tipo de plan
		oCETipoPlan.setCodigoTipoPlan("S");
		oCETipoPlan.setCodigoEmpresa("05");
		oCETipoPlan.setCodigoIdioma("ES");
		oCETipoPlan.setAbreviatura("PCSBS");
		oCETipoPlan.setDescripcion("PLAN CONTABLE SBS");
		oCETipoPlan.setSiNoVisualizar(true);
		oCETipoPlan.setSiNoEditar(false);
		oCETipoPlan.setSiNoAnula(true);
		oCETipoPlan.setSiNoElimina(false);
		oCETipoPlan.setSiNoDefault(true);
		oCETipoPlan.setSiNoActivo(true);			
		oCETipoPlan.setUsuarioNuevo("EDIAZ");
		oCETipoPlan.setFechaAlta(oSDF.parse("05/01/2002"));
		oCETipoPlan.setUsuarioUltimaModificacion(null);
		oCETipoPlan.setFechaUltimaModificacion(null);
		
		MOLOG.info("[EVL] objeto CETipoCuenta : {} ", oCETipoPlan);
		// 4. Estamos accediendo a la capa modelo, luego debemos acceder a la capa controladora
		oCDTipoPlan.grabarTipoPlan(oCETipoPlan);
		MOLOG.info("[EVL] Instance oCDTipoPlan : {} ", oCDTipoPlan);

		((ConfigurableApplicationContext) moCntx).close();		
	}
}
