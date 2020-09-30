package pe.bbva.evalua.spring5.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CE0701PersonaCycleLife {
	private static final Logger LOG = LoggerFactory.getLogger("CE0701PersonaCycleLife");
	
	private int id;
	private String nombre;
	private String apodo;
	
	public CE0702PaisCycleLife pais;

	private void begin() {
		LOG.info("[EVL] CE0701PersonaCycleLife - Antes de inicializar");
	}
	
	private void finish() {
		LOG.info("[EVL] CE0701PersonaCycleLife - Bean a punto de ser destruido");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public CE0702PaisCycleLife getPais() {
		return pais;
	}

	public void setPais(CE0702PaisCycleLife pais) {
		this.pais = pais;
	}
}
