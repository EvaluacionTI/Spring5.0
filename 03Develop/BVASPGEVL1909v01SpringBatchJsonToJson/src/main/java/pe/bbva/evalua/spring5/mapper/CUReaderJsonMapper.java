package pe.bbva.evalua.spring5.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.json.JsonObjectMarshaller;

import pe.bbva.evalua.spring5.entity.CECompraDTOEntrada;

public class CUReaderJsonMapper implements JsonObjectMarshaller<CECompraDTOEntrada>{
	private static final Logger LOG = LoggerFactory.getLogger("CUReaderJsonMapper");

	@Override
	public String marshal(CECompraDTOEntrada object) {

		return null;
	}
	

	
}

