package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.model.CIRetiroAFP25;

public class CVMostrarAllMatriz {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarAllMatriz");
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-Matrices.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
		
		CIRetiroAFP25 oLista = (CIRetiroAFP25) oCntx.getBean("idCIRetiroAFP25");
		LOG.info("[EVL] Instancia Interface : {}", oLista);
		LOG.info("[EVL] Mostrar all : ");
		
		Object[][] oResult = oLista.consultaAllRetiroDimensional();
		LOG.info("[EVL] Lista all load : {}", oResult);
		
		LOG.info("[EVL] Mostrar by Id : ");
		oResult = oLista.consultaByIdRetiroDimensional(3);
		LOG.info("[EVL] Lista by id : {}", oResult);
		
		LOG.info("[EVL] Delete by Id : ");
		oLista.deleteRetiroDimensional(3);
		
		LOG.info("[EVL] Update by Id : ");
		Object[][] pData = new Object[1][3];
		pData[0][0] = 4;
		pData[0][1] = "20204";
		pData[0][2] = 56780.99;
		oLista.updateRetiroDimensional(pData);

		LOG.info("[EVL] Insert : ");
		pData = new Object[1][3];
		pData[0][0] = 15;
		pData[0][1] = "15172027";
		pData[0][2] = 202715.17;
		oLista.saveRetiroDimensional(pData);

		LOG.info("[EVL] Insert 1 : ");
		pData = new Object[1][3];
		pData[0][0] = 17;
		pData[0][1] = "17202715";
		pData[0][2] = 1202715.17;
		oLista.saveRetiroDimensional(pData);
	}

}
