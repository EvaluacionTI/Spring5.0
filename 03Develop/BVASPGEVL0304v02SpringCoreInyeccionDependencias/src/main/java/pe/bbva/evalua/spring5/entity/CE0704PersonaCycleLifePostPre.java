package pe.bbva.evalua.spring5.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CE0704PersonaCycleLifePostPre {
	private static final Logger LOG = LoggerFactory.getLogger("CE0704PersonaCycleLifePostPre");
	
	private int id;
	private String nombre;
	private String apodo;
	
	public CE0702PaisCycleLife pais;

	@PostConstruct
	private void begin() {
		LOG.info("[EVL] CE0704PersonaCycleLifePostPre - Antes de inicializar con @PostConstruct : Se ejecuta despues de instanciar la clase");
	}
	
	@PreDestroy
	private void finish() {
		LOG.info("[EVL] CE0704PersonaCycleLifePostPre - Bean a punto de ser destruido con @PreDestroy: ");
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
