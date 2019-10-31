package pe.etg.bbva.spring.batch.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component("CBProcessFile")
public class CBProcess implements ItemProcessor<String, String> {
	private static final Logger MOLOG = LoggerFactory.getLogger(CBProcess.class);
	
	@Override
	public String process(String psStringInput) throws Exception {
		
		String sStringOutput = "HOST / " + psStringInput + " / APX"; 
		
		MOLOG.info("[EVL] String input  : {} ", psStringInput);
		MOLOG.info("[EVL] String output : {} ", sStringOutput);
		return sStringOutput;
	}

}
