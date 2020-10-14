package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.CICrudLSA;

public class CVMostrarLinkedHashSet {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarLinkedHashSet");
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-LinkedHashSet.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
		
		CICrudLSA oLista = (CICrudLSA) oCntx.getBean("idCIRetiroAFP25");
		LOG.info("[EVL] Instancia Interface : {}", oLista);
		LOG.info("[EVL] Mostrar all : ");
		
		LOG.info("[EVL] Insert Afiliado : ");
		oLista.saveRetiro(new CESaldoAfiliado(27, "17202715",1202715.17));
		
		LOG.info("[EVL] Lista all load : {}", oLista.consultAll());
		
		LOG.info("[EVL] Mostrar by Id : ");
		LOG.info("[EVL] Lista by id : {}", oLista.consultaById(15));
		
		LOG.info("[EVL] Delete by Id : ");
		oLista.deleteRetiro(10);
		
		LOG.info("[EVL] Lista all load : {}", oLista.consultAll());

		LOG.info("[EVL] Update by Id : ");
		oLista.updateRetiro(new CESaldoAfiliado(4, "20204", 56780.99));
		LOG.info("[EVL] Lista all load : {}", oLista.consultAll());
	}
}
