package com.bbva.qwpu.lib.r000;

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
		"classpath:/META-INF/spring/QWPUR000-app.xml",
		"classpath:/META-INF/spring/QWPUR000-app-test.xml",
		"classpath:/META-INF/spring/QWPUR000-arc.xml",
		"classpath:/META-INF/spring/QWPUR000-arc-test.xml" })
public class QWPUR000Test {

	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUR000Test.class);

	@Resource(name = "qwpuR000")
	private QWPUR000 qwpuR000;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		ThreadContext.set(new Context());
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.qwpuR000;
		if(this.qwpuR000 instanceof Advised){
			Advised advised = (Advised) this.qwpuR000;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		qwpuR000.executeEco();
	}
	
}
