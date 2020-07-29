package pe.bbva.evalua.spring5.view;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class CV0301v01VerificarPersistence {
	private static Logger MOLOG = LoggerFactory.getLogger("CV0301v01VerificarPersistence");
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-persistence-jpa.xml"
	};
	
	public static void main(String[] args) throws ParseException {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Iniciando contexto     : {}", moCntx);
		
		/*
		 * LocalContainerEntityManagerFactoryBean oLocalEMF =
		 * (LocalContainerEntityManagerFactoryBean)
		 * moCntx.getBean("entityManagerFactory");
		 * MOLOG.info("[EVL] LocalContainerEntityManagerFactoryBean : {}", oLocalEMF);
		 * 
		 * HibernateJpaVendorAdapter oHJpaVendorAdapter = (HibernateJpaVendorAdapter)
		 * moCntx.getBean("jpaVendorAdapter");
		 * MOLOG.info("[EVL] HibernateJpaVendorAdapter    : {}", oHJpaVendorAdapter);
		 * 
		 * JpaTransactionManager oJpaTransactionManager = (JpaTransactionManager)
		 * moCntx.getBean("transactionManager");
		 * MOLOG.info("[EVL] JpaTransactionManager    : {}", oJpaTransactionManager);
		 */
		((ConfigurableApplicationContext) moCntx).close();	
	}
}
