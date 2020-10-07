package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.config.CEConfigContext;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.CIRetiroAFP25ArrayList;

public class CVMostrarArrayList {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarArrayList");
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[EVL] Instancia Context : {}", oCntx);

		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		CIRetiroAFP25ArrayList oLista = (CIRetiroAFP25ArrayList) oCntx.getBean("idCIRetiroAFP25");
		LOG.info("[EVL] Instancia Interface : {}", oLista);
		LOG.info("[EVL] Mostrar all : ");
		
		LOG.info("[EVL] Insert Afiliado : ");
		oLista.saveRetiroArrayList(new CESaldoAfiliadoCustom(27, "17202715",1202715.17));
		
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());
		
			
		LOG.info("[EVL] Mostrar by Id : ");
		LOG.info("[EVL] Lista by id : {}", oLista.consultaByIdRetiroArrayList(15));
		
		LOG.info("[EVL] Delete by Id : ");
		oLista.deleteRetiroArrayList(10);
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());

		LOG.info("[EVL] Update by Id : ");
		oLista.updateRetiroArrayList(new CESaldoAfiliadoCustom(4, "20204", 56780.99));
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());
	}

}
