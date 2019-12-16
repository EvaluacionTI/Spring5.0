package pe.etg.bbva.spring5.batch.step;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component
public class CBReader implements ItemReader<String>{
	private static final Logger MOLOG = LoggerFactory.getLogger(CBReader.class);
	
    private String[] aDatoString = {"classpath:/input/EVL01FileTexto.txt"};
    private int  iPosicion=0;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
    	MOLOG.info("[EVL] Cantidad registros : {} ", aDatoString.length);
    	
        if(iPosicion < aDatoString.length){
            return aDatoString[iPosicion++];
        }else{
        	iPosicion=0;
        }
        return null;
    }
}	