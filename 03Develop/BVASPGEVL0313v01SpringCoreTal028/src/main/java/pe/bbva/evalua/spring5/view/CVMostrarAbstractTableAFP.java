package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.utilidad.CUMostrarAbstractTable;

public class CVMostrarAbstractTableAFP {
	public static final Logger LOG = LoggerFactory.getLogger("CVMostrarRetiroAFP");

	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-abstractAFP.xml");
		
		CUMostrarAbstractTable oVentana = new CUMostrarAbstractTable(oCntx);
		
		oVentana.setVisible(true);
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
