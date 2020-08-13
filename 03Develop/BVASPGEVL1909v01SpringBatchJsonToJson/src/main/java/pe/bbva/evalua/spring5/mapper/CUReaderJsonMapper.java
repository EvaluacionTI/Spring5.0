package pe.bbva.evalua.spring5.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.JsonObjectMarshaller;
import org.springframework.batch.item.json.JsonObjectReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.annotation.JacksonAnnotationValue;

import pe.bbva.evalua.spring5.entity.CECompraDTOEntrada;

public class CUReaderJsonMapper implements JsonObjectMarshaller<CECompraDTOEntrada>{
	private static final Logger LOG = LoggerFactory.getLogger("CUReaderJsonMapper");

	@Override
	public String marshal(CECompraDTOEntrada object) {

		return null;
	}
	

	
}


}
