package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEDatoRuta;
import pe.unjfsc.daw.spring5.entity.CEDetalle;
import pe.unjfsc.daw.spring5.entity.CEDistancia;
import pe.unjfsc.daw.spring5.entity.CEEmpresa;
import pe.unjfsc.daw.spring5.entity.CEEntity;
import pe.unjfsc.daw.spring5.entity.CEMoneda;
import pe.unjfsc.daw.spring5.entity.CEPasajero;
import pe.unjfsc.daw.spring5.entity.CETotales;
import pe.unjfsc.daw.spring5.logical.CIPasajero;
import pe.unjfsc.daw.spring5.logical.CIRevisionNumeroCadena;
import pe.unjfsc.daw.spring5.logical.impl.CMPasajero;
import pe.unjfsc.daw.spring5.logical.impl.CMRevisionNumeroCadena;


public class CV02MostrarValores {
	private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarValores");
	
    public static void main( String[] args ){
    	LOG.info("[EVL] Iniciando ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-pasajero.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Revisando los beans ");
		
		CEPasajero oCEPasajero = (CEPasajero) oCntx.getBean("idCEPasajero");
		LOG.info("[EVL] CEPasajero  : {}", oCEPasajero);
	
		CEDistancia oCEDistancia = (CEDistancia) oCntx.getBean("idCEDistancia");
		LOG.info("[EVL] CEDatoRuta  : {}", oCEDistancia);
		
		CETotales oCETotales = (CETotales) oCntx.getBean("idCETotales");
		LOG.info("[EVL] CETotales  : {}", oCETotales);	

		
		CIPasajero oCMPasajero = (CMPasajero) oCntx.getBean("idCMPasajero");
		LOG.info("[EVL] CETotales  : {}", oCMPasajero.calcularDistancia(oCEDistancia));
		
		CIRevisionNumeroCadena oCMRevision = (CMRevisionNumeroCadena) oCntx.getBean("idCMRevisionNumeroCadena");
		LOG.info("[EVL] Revision Matematica  : {}", oCMRevision.calcularMate(oCETotales));
		LOG.info("[EVL] Revision String  : {}", oCMRevision.calcularString(oCEPasajero));
		
		
		((ConfigurableApplicationContext) oCntx).close();
    }
}
