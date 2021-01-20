package com.bbva.pglu.lib.r001;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;
import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/PGLUR001-app.xml",
		"classpath:/META-INF/spring/PGLUR001-app-test.xml",
		"classpath:/META-INF/spring/PGLUR001-arc.xml",
		"classpath:/META-INF/spring/PGLUR001-arc-test.xml" })
public class PGLUR001Test {

	private static final Logger LOGGER = LoggerFactory.getLogger(PGLUR001Test.class);

	@Resource(name = "pgluR001")
	private PGLUR001 pgluR001;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		ThreadContext.set(new Context());
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.pgluR001;
		if(this.pgluR001 instanceof Advised){
			Advised advised = (Advised) this.pgluR001;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		pgluR001.execute();
	}
	
}
