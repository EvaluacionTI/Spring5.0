package pe.bbva.spring.batch.utilidad;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import pe.etg.bbva.evalua.spring5.entity.CEDESt01Persona;

@Component
public class CUDESt01_personaReader extends FlatFileItemReader<CEDESt01Persona> {
	
	public CUDESt01_personaReader() {
		String sNombreArchivo = "DEST01Persona.txt";
		Resource oRecurso = new ClassPathResource(sNombreArchivo);
		this.setResource(oRecurso);
		this.setLineMapper(new DefaultLineMapper<CEDESt01Persona>() {{
			setLineTokenizer(new DelimitedLineTokenizer(){{
		        String [] names = {"nombre", "apellido", "sexo"};
		        setNames(names);
		        setLinesToSkip(1); // Capacidad de omitir una cantidad específica de líneas al inicio de nuestro archivo
		    }});
		    setFieldSetMapper(new BeanWrapperFieldSetMapper<CEDESt01Persona>(){{
		        setTargetType(CEDESt01Persona.class);
		    }});
			
		}});
	}

}
