package pe.etg.bbva.spring5.batch.step;
 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component("CBWriterFile")
public class CBWriter implements ItemWriter<String> {
 
    private final Logger MOLOG = LoggerFactory.getLogger(this.getClass());
     
    @Override
    public void write(List<? extends String> paths) throws Exception {
    	
    	MOLOG.info("[EVL] List size : {} ", paths.size());
        for(String filePath : paths){
        	
        	MOLOG.info("[EVL] filePath : {} ", filePath);
            try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
                stream.forEach(System.out::println);
            } catch (IOException e) {
            	throw(e);
            }
        }
    }
}