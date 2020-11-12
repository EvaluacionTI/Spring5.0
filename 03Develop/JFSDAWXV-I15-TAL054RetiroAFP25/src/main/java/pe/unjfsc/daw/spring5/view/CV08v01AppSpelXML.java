package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEAfiliado;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public class CV08v01AppSpelXML {
	private static final Logger LOG = LoggerFactory.getLogger("CV08v01AppSpelXML");

	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context01-spelXML.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CESaldoAfiliado oCESaldo = oCntx.getBean(CESaldoAfiliado.class);
		LOG.info("[EVL] CESaldoAfiliado : {}", oCESaldo);
		
		CEAfiliado oCEAfiliado = oCntx.getBean(CEAfiliado.class);
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado);
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getEmpId());
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getOfficeAddress().getCity());
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getOfficeAddress().getAddress(null));
		
		((ConfigurableApplicationContext) oCntx).close();

	}
}
