package pe.bbva.evalua.spring5.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("pe.bbva.evalua.spring5.model")
public class CEConfigSpringDataJpa {
	private static final Logger LOG = LoggerFactory.getLogger("CEConfigSpringDataJpa");

	@Bean
	public DataSource dataSource() {
		LOG.info("[EVL] =====[ Start dataSource ]=====");
		
		DriverManagerDataSource oDataSource = new DriverManagerDataSource();
		LOG.info("[EVL] DriverManagerDataSource : {}", oDataSource);
		oDataSource.setDriverClassName("org.postgresql.Driver");
		oDataSource.setUrl("jdbc:postgresql://localhost:5432/aemsadesarrollo");
		oDataSource.setUsername("postgres");
		oDataSource.setPassword("aemsa152027");
		LOG.info("[EVL] new DriverManagerDataSource : {}", oDataSource);
		return oDataSource;
	}
	
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LOG.info("[EVL] =====[ Start LocalContainerEntityManagerFactoryBean ]=====");
		
		LocalContainerEntityManagerFactoryBean oFactoryBean = new LocalContainerEntityManagerFactoryBean();
		LOG.info("[EVL] Instance LocalContainerEntityManagerFactoryBean : {} ", oFactoryBean);
		
		oFactoryBean.setDataSource(dataSource());
		oFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		
		oFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		oFactoryBean.setPackagesToScan("pe.bbva.evalua.spring5");
		
		Properties oJpaProperties = new Properties();
		oJpaProperties.put("hibernate.dialect", "org.hibernate.dialect.ProgressDialect");
		oFactoryBean.setJpaProperties(oJpaProperties);
		LOG.info("[EVL] new Instance LocalContainerEntityManagerFactoryBean : {} ", oFactoryBean);
		
		return oFactoryBean;
	}
	
	@Bean
	public JpaTransactionManager transactionManager() {
		LOG.info("[EVL] =====[ Start JpaTransactionManager ]=====");
		
		JpaTransactionManager oTransactionManager = new JpaTransactionManager();
		LOG.info("[EVL] Instance JpaTransactionManager : {} ", oTransactionManager);
		
		oTransactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		
		return oTransactionManager;
	}
}
