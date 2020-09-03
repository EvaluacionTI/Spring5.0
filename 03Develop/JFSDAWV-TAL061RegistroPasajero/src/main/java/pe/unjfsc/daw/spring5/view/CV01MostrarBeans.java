package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEDatoRuta;
import pe.unjfsc.daw.spring5.entity.CEDetalle;
import pe.unjfsc.daw.spring5.entity.CEEmpresa;
import pe.unjfsc.daw.spring5.entity.CEEntity;
import pe.unjfsc.daw.spring5.entity.CEMoneda;
import pe.unjfsc.daw.spring5.entity.CEPasajero;
import pe.unjfsc.daw.spring5.entity.CETotales;


public class CV01MostrarBeans {
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarBeans");
	
    public static void main( String[] args ){
    	LOG.info("[EVL] Iniciando ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-pasajero.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Revisando los beans ");
		
		CEEntity oCEEntity = (CEEntity) oCntx.getBean("idCEEntity");
		LOG.info("[EVL] CEEntity  : {}", oCEEntity);

		CEEmpresa oCEEmpresa = (CEEmpresa) oCntx.getBean("idCEEmpresa");
		LOG.info("[EVL] CEEmpresa  : {}", oCEEmpresa);

		CEPasajero oCEPasajero = (CEPasajero) oCntx.getBean("idCEPasajero");
		LOG.info("[EVL] CEPasajero  : {}", oCEPasajero);

		CEDatoRuta oCEDatoRuta = (CEDatoRuta) oCntx.getBean("idCEDatoRuta");
		LOG.info("[EVL] CEDatoRuta  : {}", oCEDatoRuta);	

		CEDetalle oCEDetalle = (CEDetalle) oCntx.getBean("idCEDetalle");
		LOG.info("[EVL] CEDetalle  : {}", oCEDetalle);	

		CEMoneda oCEMoneda = (CEMoneda) oCntx.getBean("idCEMoneda");
		LOG.info("[EVL] CEMoneda  : {}", oCEMoneda);	

		CETotales oCETotales = (CETotales) oCntx.getBean("idCETotales");
		LOG.info("[EVL] CETotales  : {}", oCETotales);	

		((ConfigurableApplicationContext) oCntx).close();
    }
}
