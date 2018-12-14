package pe.etg.bbva.spring.view;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg.bbva.spring")
public class CV1303v01SpringRestCRUDCustomer {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV1303v01SpringRestCRUDCustomer.class);
	private static SpringApplication moApplicationSpring;
	
	public static void main(String[] args) {
		MOLOG.info("=====> Start method : main(String[] args) <===== ");
		
		moApplicationSpring = new SpringApplication(CV1303v01SpringRestCRUDCustomer.class);
		
		moApplicationSpring.run(args);
		MOLOG.info("=> [GET ] http://localhost:8020/customers");
		MOLOG.info("=> [GET ] http://localhost:8020/customers/104");
		MOLOG.info("=> [POST] http://localhost:8020/customers/");
		MOLOG.info("=> [PUT ] http://localhost:8020/customers/201");
		MOLOG.info("=> [DEL ] http://localhost:8020/customers/104");
		
		MOLOG.info("=====> End method : main(String[] args) <===== ");
	}

}



