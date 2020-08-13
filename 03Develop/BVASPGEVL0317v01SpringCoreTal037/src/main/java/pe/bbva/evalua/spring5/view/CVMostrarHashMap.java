package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.CIRetiroAFP25HashMap;

public class CVMostrarHashMap {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarHashSet");
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-HashMap.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
		
		CIRetiroAFP25HashMap oLista = (CIRetiroAFP25HashMap) oCntx.getBean("idCIRetiroAFP25");
		LOG.info("[EVL] Instancia Interface : {}", oLista);
		LOG.info("[EVL] Mostrar all : ");
		
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroHashMap());
		
			
		LOG.info("[EVL] Mostrar by Id : ");
		LOG.info("[EVL] Lista by id : {}", oLista.consultaByIdRetiroHashMap(10));
		
		LOG.info("[EVL] Delete by Id : A20");
		oLista.deleteRetiroHahMap("A20");
		
		LOG.info("[EVL] Update by Id : A15");
		oLista.updateRetiroHashMap("A15", new CESaldoAfiliadoCustom(14, "202014", 54444.44));

		LOG.info("[EVL] Insert : ");
		oLista.saveRetiroHashMap("A29", new CESaldoAfiliadoCustom(29, "2927201517", 292929.29));
		((ConfigurableApplicationContext) oCntx).close();
	}

}
