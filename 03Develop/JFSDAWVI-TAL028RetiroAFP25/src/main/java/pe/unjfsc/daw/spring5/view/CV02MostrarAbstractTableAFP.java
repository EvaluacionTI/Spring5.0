package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.utility.CUMostrarAbstractTable;

public class CV02MostrarAbstractTableAFP {
	private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarAbstractTableAFP");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-AbstractAFP.xml");
		LOG.info("[EVL] Context : {}", oCntx);

		CUMostrarAbstractTable oVentana = new CUMostrarAbstractTable(oCntx);
		
		oVentana.setVisible(true);
		((ConfigurableApplicationContext) oCntx).close();
	}

}
