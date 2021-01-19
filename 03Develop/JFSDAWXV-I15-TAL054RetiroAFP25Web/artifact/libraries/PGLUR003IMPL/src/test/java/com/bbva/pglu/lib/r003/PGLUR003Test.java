package com.bbva.pglu.lib.r003;

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
		"classpath:/META-INF/spring/PGLUR003-app.xml",
		"classpath:/META-INF/spring/PGLUR003-app-test.xml",
		"classpath:/META-INF/spring/PGLUR003-arc.xml",
		"classpath:/META-INF/spring/PGLUR003-arc-test.xml" })
public class PGLUR003Test {

	private static final Logger LOGGER = LoggerFactory.getLogger(PGLUR003Test.class);

	@Resource(name = "pgluR003")
	private PGLUR003 pgluR003;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		ThreadContext.set(new Context());
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.pgluR003;
		if(this.pgluR003 instanceof Advised){
			Advised advised = (Advised) this.pgluR003;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		pgluR003.execute();
	}
	
}
