package pe.etg.bbva.spring.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pe.etg.bbva.spring.component.impl.CAAbstractDemoLog;

@Component
public class CCComponent2 extends CAAbstractDemoLog{

	public static final Logger MOLOG = LoggerFactory.getLogger(CCComponent2.class); 
	
	@PostConstruct
	public void configuration() {
		CAAbstractDemoLog.logStatements(MOLOG, "=====> [Iniciando CTComponent2Test.configuration() ");
	}

	@PreDestroy
	public void killed() {
		CAAbstractDemoLog.logStatements(MOLOG, "====> [Eliminando CTComponent2Test.killed() ");
	}
}
