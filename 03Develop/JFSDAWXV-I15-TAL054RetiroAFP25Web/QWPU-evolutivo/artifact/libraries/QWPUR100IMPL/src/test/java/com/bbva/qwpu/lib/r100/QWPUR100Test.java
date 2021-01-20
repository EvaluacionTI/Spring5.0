package com.bbva.qwpu.lib.r100;

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
		"classpath:/META-INF/spring/QWPUR100-app.xml",
		"classpath:/META-INF/spring/QWPUR100-app-test.xml",
		"classpath:/META-INF/spring/QWPUR100-arc.xml",
		"classpath:/META-INF/spring/QWPUR100-arc-test.xml" })
public class QWPUR100Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(QWPUR100.class);
	
	@Resource(name = "qwpuR100")
	private QWPUR100 qwpuR100;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.qwpuR100;
		if(this.qwpuR100 instanceof Advised){
			Advised advised = (Advised) this.qwpuR100;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test....");
		qwpuR100.execute();
	}
	
}
