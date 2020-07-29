package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import pe.bbva.evalua.spring5.config.CEConfigSpringDataJpa;

public class CV03MostrarConfigSpringData {
	private static final Logger LOG = LoggerFactory.getLogger("CV03MostrarConfigSpringData");
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[EVL] Instancia Context : {}", oCntx);

		oCntx.register(CEConfigSpringDataJpa.class);
		oCntx.refresh();
		/*	
		LocalContainerEntityManagerFactoryBean oFactoryBean = (LocalContainerEntityManagerFactoryBean) oCntx.getBean("entityManagerFactory");
		LOG.info("[EVL] Instancia LocalContainerEntityManagerFactoryBean : {}", oFactoryBean);
		
		LOG.info("[EVL] Insert Afiliado : ");
		oLista.saveRetiroArrayList(new CESaldoAfiliadoCustom(27, "17202715",1202715.17));
		
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());
		
			
		LOG.info("[EVL] Mostrar by Id : ");
		LOG.info("[EVL] Lista by id : {}", oLista.consultaByIdRetiroArrayList(15));
		
		LOG.info("[EVL] Delete by Id : ");
		oLista.deleteRetiroArrayList(10);
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());

		LOG.info("[EVL] Update by Id : ");
		oLista.updateRetiroArrayList(new CESaldoAfiliadoCustom(4, "20204", 56780.99));
		LOG.info("[EVL] Lista all load : {}", oLista.consultaAllRetiroArrayList());
	*/	
		((ConfigurableApplicationContext) oCntx).close();	
	}

}
