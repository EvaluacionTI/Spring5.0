package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("pe.etg.bbva.evalua.spring5")
public class CV1303v01SpringRestCRUDCustomer {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV1303v01SpringRestCRUDCustomer.class);
	private static SpringApplication moApplicationSpring;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] String[] : {}", args.length);
		
		moApplicationSpring = new SpringApplication(CV1303v01SpringRestCRUDCustomer.class);
		
		moApplicationSpring.run(args);
		MOLOG.info("[EVL] [GET ] http://localhost:8020/customers");
		MOLOG.info("[EVL] [GET ] http://localhost:8020/customers/104");
		MOLOG.info("[EVL] [POST] http://localhost:8020/customers/");
		MOLOG.info("[EVL] [PUT ] http://localhost:8020/customers/201");
		MOLOG.info("[EVL] [DEL ] http://localhost:8020/customers/104");
	}

}



