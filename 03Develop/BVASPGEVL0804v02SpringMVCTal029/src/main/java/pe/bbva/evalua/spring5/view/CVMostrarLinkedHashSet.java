package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.CIRetiroAFP25LinkedHashSet;

public class CVMostrarLinkedHashSet {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarLinkedHashSet");
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-LinkedHashSet.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
		
		CIRetiroAFP25LinkedHashSet oLista = (CIRetiroAFP25LinkedHashSet) oCntx.getBean("idCIRetiroAFP25");
		LOG.info("[EVL] Instancia Interface : {}", oLista);
		LOG.info("[EVL] Mostrar all : ");
		
		LOG.info("[EVL] Insert Afiliado : ");
		oLista.saveRetiroLinkedHashSet(new CESaldoAfiliadoCustom(27, "17202715",1202715.17));
		
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroLinkedHashSe());
		
		LOG.info("[EVL] Mostrar by Id : ");
		LOG.info("[EVL] Lista by id : {}", oLista.consultaByIdRetiroLinkedHashSe(15));
		
		LOG.info("[EVL] Delete by Id : ");
		oLista.deleteRetiroLinkedHashSet(10);
		
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroLinkedHashSe());

		LOG.info("[EVL] Update by Id : ");
		oLista.updateRetiroLinkedHashSet(new CESaldoAfiliadoCustom(4, "20204", 56780.99));
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroLinkedHashSe());
	}

}
