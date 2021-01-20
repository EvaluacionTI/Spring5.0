package com.bbva.papx.lib.r002;

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
		"classpath:/META-INF/spring/PAPXR002-app.xml",
		"classpath:/META-INF/spring/PAPXR002-app-test.xml",
		"classpath:/META-INF/spring/PAPXR002-arc.xml",
		"classpath:/META-INF/spring/PAPXR002-arc-test.xml" })
public class PAPXR002Test {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR002Test.class);

	@Resource(name = "papxR002")
	private PAPXR002 papxR002;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		ThreadContext.set(new Context());
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.papxR002;
		if(this.papxR002 instanceof Advised){
			Advised advised = (Advised) this.papxR002;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		papxR002.execute();
	}
	
}
