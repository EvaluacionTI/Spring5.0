package com.bbva.qwpu.lib.r200;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/QWPUR200-app.xml",
		"classpath:/META-INF/spring/QWPUR200-app-test.xml",
		"classpath:/META-INF/spring/QWPUR200-arc.xml",
		"classpath:/META-INF/spring/QWPUR200-arc-test.xml" })
public class QWPUR200Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(QWPUR200.class);
	
	@Resource(name = "qwpuR200")
	private QWPUR200 qwpuR200;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.qwpuR200;
		if(this.qwpuR200 instanceof Advised){
			Advised advised = (Advised) this.qwpuR200;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		qwpuR200.execute();
	}
	
}
