package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.entity.CEConfigContext;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoAnotacion;
import pe.bbva.evalua.spring5.logical.CIRetiroAFPAnotacion;


public class CVMostrarRetiroAFPAnotacion {
	public static final Logger LOG = LoggerFactory.getLogger("CVMostrarRetiroAFPAnotacion");

	public static void main(String[] args) {
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		LOG.info("[EVL] ApplicationContext : {} ", oCntx);
		CESaldoAfiliadoAnotacion oCESaldoAfiliado = (CESaldoAfiliadoAnotacion) oCntx.getBean("oCESaldoAfiliado");
		CIRetiroAFPAnotacion oCIRetiroAFP = (CIRetiroAFPAnotacion) oCntx.getBean("oCMSaldoDisponible");
		
		LOG.info("[EVL] Entidad Afiliado : {} ", oCESaldoAfiliado);
		LOG.info("[EVL] Entidad Retiro   : {} ", oCIRetiroAFP);
		
		oCESaldoAfiliado.setId(15);
		oCESaldoAfiliado.setCodigoAfiliado("152027");
		oCESaldoAfiliado.setSaldoCIC(6000);
		LOG.info("[EVL] Entidad Afiliado : {} ", oCESaldoAfiliado);
		
		double saldoDisponible = oCIRetiroAFP.saldoDisponible(oCESaldoAfiliado);
		
		LOG.info("[EVL] Saldo de Retiro : {} ", saldoDisponible);
		((ConfigurableApplicationContext) oCntx).close();
	}
}
