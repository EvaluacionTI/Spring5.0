package pe.bbva.architecture.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pe.bbva.architecture.component.impl.CAAbstractDemoLog;

@Component
public class CCComponent1 extends CAAbstractDemoLog{

	public static final Logger MOLOG = LoggerFactory.getLogger(CCComponent1.class); 
	
	@PostConstruct
	public void configuration() {
		CAAbstractDemoLog.logStatements(MOLOG, "=====> [Iniciando CCComponent1Test.configuration() ");
	}

	@PreDestroy
	public void killed() {
		CAAbstractDemoLog.logStatements(MOLOG, "====> [Eliminando CCComponent1Test.killed() ");
	}
}
