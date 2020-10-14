package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.impl.CMSaldoDisponible;
import pe.unjfsc.daw.spring5.model.CDSaldoAfiliado;

public class CVMostrarAbstractAFP {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarBucleAFP");
	private static double[] maResult, maDataProcesar;
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-AbstractAFP.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CESaldoAfiliado oCESaldo = (CESaldoAfiliado) oCntx.getBean("idCESaldoAfiliado");
		CMSaldoDisponible oCIRetiro = (CMSaldoDisponible) oCntx.getBean("idCMSaldoDisponible");
		CDSaldoAfiliado oCDSaldo = (CDSaldoAfiliado) oCntx.getBean("idCDSaldoAfiliado");
		
		LOG.info("[EVL] CESaldoAfiliado : {}", oCESaldo);
		LOG.info("[EVL] CIRetiroAFP : {}", oCIRetiro);
		LOG.info("[EVL] CDSaldoAfiliado : {}", oCDSaldo.saldoAfiliado());
		
		oCESaldo.setId(15);
		oCESaldo.setCodigoAfiliado("20028");
		oCESaldo.setSaldoCIC(4110);
		LOG.info("[EVL] CESaldoAfiliado : {}", oCESaldo);
		
		double saldoDisponible = oCIRetiro.saldoDisponible(oCESaldo);
		LOG.info("[EVL] Saldo Disponible : {}", saldoDisponible);
		
		LOG.info("[EVL] Revisando detalle en matrices ");
		maDataProcesar = new double[100];
		maDataProcesar = oCDSaldo.saldoAfiliado();

		/*
		maResult = new double[30];
		maResult = oCIRetiro.listaSaldoBucleWhile(maDataProcesar);
		LOG.info("[EVL] Saldo final con while : {} ", maResult);

		maResult = new double[30];
		maResult = oCIRetiro.listaSaldoBucleDoWhile(maDataProcesar);
		LOG.info("[EVL] Saldo final con do while : {} ", maResult);
		
		maResult = new double[30];
		maResult = oCIRetiro.listaSaldoFor(maDataProcesar);
		LOG.info("[EVL] Saldo final con for : {} ", maResult);
		*/
		((ConfigurableApplicationContext) oCntx).close();

	}

}
