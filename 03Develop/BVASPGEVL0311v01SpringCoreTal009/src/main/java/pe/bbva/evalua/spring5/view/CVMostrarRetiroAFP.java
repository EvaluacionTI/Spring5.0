package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliado;
import pe.bbva.evalua.spring5.logical.CIRetiroAFP;


public class CVMostrarRetiroAFP {
	public static final Logger LOG = LoggerFactory.getLogger("CVMostrarRetiroAFP");

	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-retiroAFP.xml");
		
		LOG.info("[EVL] ApplicationContext : {} ", oCntx);
		CESaldoAfiliado oCESaldoAfiliado = (CESaldoAfiliado) oCntx.getBean("idCESaldoAfiliado");
		CIRetiroAFP oCIRetiroAFP = (CIRetiroAFP) oCntx.getBean("idCMSaldoDisponible");
		
		LOG.info("[EVL] Entidad Afiliado : {} ", oCESaldoAfiliado);
		LOG.info("[EVL] Entidad Retiro   : {} ", oCIRetiroAFP);
		
		oCESaldoAfiliado.setId(15);
		oCESaldoAfiliado.setCodigoAfiliado("152027");
		oCESaldoAfiliado.setSaldoCIC(51600);
		LOG.info("[EVL] Entidad Afiliado : {} ", oCESaldoAfiliado);
		
		double saldoDisponible = oCIRetiroAFP.saldoDisponible(oCESaldoAfiliado);
		
		LOG.info("[EVL] Saldo de Retiro : {} ", saldoDisponible);
		((ConfigurableApplicationContext) oCntx).close();
	}
}
