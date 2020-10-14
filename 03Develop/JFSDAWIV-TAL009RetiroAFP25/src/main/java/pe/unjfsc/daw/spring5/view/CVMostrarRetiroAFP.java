package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.CIRetiroAFP;

public class CVMostrarRetiroAFP {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarRetiroAFP");
	
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-retiroAFP.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CESaldoAfiliado oCESaldo = (CESaldoAfiliado) oCntx.getBean("idCESaldoAfiliado");
		CIRetiroAFP oCIRetiro = (CIRetiroAFP) oCntx.getBean("idCMRetiroAFP");
		
		LOG.info("[EVL] CESaldoAfiliado : {}", oCESaldo);
		LOG.info("[EVL] CIRetiroAFP : {}", oCIRetiro);
		
		oCESaldo.setId(15);
		oCESaldo.setCodigoAfiliado("152028");
		oCESaldo.setSaldoCIC(1724310);
		LOG.info("[EVL] CESaldoAfiliado : {}", oCESaldo);
		
		double saldoDisponible = oCIRetiro.saldoDisponible(oCESaldo);
		LOG.info("[EVL] Saldo Disponible : {}", saldoDisponible);
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
