package pe.bbva.evalua.spring5.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CE0703CiudadCycleLife {
	private static final Logger LOG = LoggerFactory.getLogger("CE0703CiudadCycleLife");
	
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void begin() {
		LOG.info("[EVL] CE0703CiudadCycleLife - Antes de inicializar");
	}
	
	private void finish() {
		LOG.info("[EVL] CE0703CiudadCycleLife - Bean a punto de ser destruido");
	}
	
}
