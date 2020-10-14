package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.model.CDLoadData;


public class CV01RevisionContext {
	private static final Logger LOG = LoggerFactory.getLogger("CV01RevisionContext");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-proyeccion-interes.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CEMeses oCEMeses = oCntx.getBean(CEMeses.class);
		LOG.info("[EVL] CEMeses : {}", oCEMeses);
		
		CESaldoAfiliado oCESaldo = oCntx.getBean(CESaldoAfiliado.class);
		LOG.info("[EVL] CESaldoAfiliado : {}", oCESaldo);
		
		CDLoadData oCDLoad = oCntx.getBean(CDLoadData.class);
		LOG.info("[EVL] CDLoadData : {}", oCDLoad);
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
