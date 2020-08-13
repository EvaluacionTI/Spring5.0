package pe.bbva.evalua.spring5.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.json.JsonFileItemWriter;
import org.springframework.batch.item.json.JsonObjectMarshaller;
import org.springframework.core.io.Resource;

import pe.bbva.evalua.spring5.entity.CECompraDTOSalida;

public class CUWriterJsonCompra extends JsonFileItemWriter<CECompraDTOSalida> {
	private static final Logger LOG = LoggerFactory.getLogger(CUWriterJsonCompra.class);
	
	public CUWriterJsonCompra(Resource resource, JsonObjectMarshaller<CECompraDTOSalida> jsonObjectMarshaller) {
		super(resource, jsonObjectMarshaller);
		LOG.info("[EVL] ======[ Start CUWriterJsonCompra]======");
		LOG.info("[EVL] Resource : {}", resource);
		LOG.info("[EVL] JsonObjectMarshaller : {}", jsonObjectMarshaller);
	}
}
