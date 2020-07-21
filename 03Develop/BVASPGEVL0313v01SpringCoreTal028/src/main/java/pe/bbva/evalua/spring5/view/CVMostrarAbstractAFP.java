package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.logical.impl.CMSaldoDisponible;
import pe.bbva.evalua.spring5.modelo.CDSaldoAfiliado;

public class CVMostrarAbstractAFP {
	public static final Logger LOG = LoggerFactory.getLogger("CVMostrarRetiroAFP");
	private static double[] maResult, maDataProcesar;
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-AbstractAFP.xml");
		
		LOG.info("[EVL] ApplicationContext : {} ", oCntx);
		CDSaldoAfiliado oCDataSaldo = (CDSaldoAfiliado) oCntx.getBean("idCDataAfiliado");
		CMSaldoDisponible oCIRetiroAFP = (CMSaldoDisponible) oCntx.getBean("idCMSaldoDisponible");
		
		LOG.info("[EVL] Data Retiro        : {} ", oCDataSaldo);
		LOG.info("[EVL] Entidad Retiro     : {} ", oCIRetiroAFP);
		LOG.info("[EVL] Vector de Retiro[] : {} ", oCDataSaldo.saldoAfiliado());
	
		maDataProcesar = new double[100];
		maDataProcesar = oCDataSaldo.saldoAfiliado();

		maResult = new double[30];
		maResult = oCIRetiroAFP.listaSaldoBucleWhile(maDataProcesar);
		LOG.info("[EVL] Saldo Final con While    : {} ", maResult);
		
		maResult = new double[30];
		maResult = oCIRetiroAFP.listaSaldoBucleDoWhile(maDataProcesar);
		LOG.info("[EVL] Saldo Final con Do While : {} ", maResult);

		maResult = new double[30];
		maResult = oCIRetiroAFP.listaSaldoFor(maDataProcesar);
		LOG.info("[EVL] Saldo Final con For      : {} ", maResult);

		((ConfigurableApplicationContext) oCntx).close();
	}
}
