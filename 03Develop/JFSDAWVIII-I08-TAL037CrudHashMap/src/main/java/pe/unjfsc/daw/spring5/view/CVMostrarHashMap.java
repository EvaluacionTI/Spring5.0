package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.CIRetiroAFP25;

public class CVMostrarHashMap {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarHashMap");
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-HashMap.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
		
		CIRetiroAFP25 oLista = (CIRetiroAFP25) oCntx.getBean("idCIRetiroAFP25");
		LOG.info("[EVL] Mostrar all : ");
		LOG.info("[EVL] Instancia Interface : {}", oLista.consultAll());

		LOG.info("[EVL] Mostrar by Id : ");
		LOG.info("[EVL] Lista by id : {}", oLista.consultaById(15));

		LOG.info("[EVL] Delete by Id : ");
		oLista.deleteRetiro("A010");;
		LOG.info("[EVL] Instancia Interface : {}", oLista.consultAll());

		LOG.info("[EVL] Update by Id : ");
		oLista.updateRetiro("A09", new CESaldoAfiliado(29, "20291014", 156780.99));
		LOG.info("[EVL] Lista all load : {}", oLista.consultAll());

		LOG.info("[EVL] Insert Afiliado : ");
		oLista.saveRetiro("A29", new CESaldoAfiliado(27, "2917202715", 21202715.17));
	}
}
