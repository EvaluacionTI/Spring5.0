package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.CIRetiroAFP25HashSet;

public class CVMostrarHashSet {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarHashSet");
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-HashSet.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
		
		CIRetiroAFP25HashSet oLista = (CIRetiroAFP25HashSet) oCntx.getBean("idCIRetiroAFP25");
		LOG.info("[EVL] Instancia Interface : {}", oLista);
		LOG.info("[EVL] Mostrar all : ");
		
		LOG.info("[EVL] Insert Afiliado : ");
		oLista.saveRetiroHashSet(new CESaldoAfiliadoCustom(25, "17202715",1202715.17));
		
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroHashSet());
		
			
		LOG.info("[EVL] Mostrar by Id : ");
		LOG.info("[EVL] Lista by id : {}", oLista.consultaByIdRetiroHashSet(5));
		
		LOG.info("[EVL] Delete by Id : ");
		oLista.deleteRetiroHashSet(18);
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroHashSet());

		LOG.info("[EVL] Update by Id : ");
		oLista.updateRetiroHashSet(new CESaldoAfiliadoCustom(5, "20204", 56780.99));
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroHashSet());

	}

}
