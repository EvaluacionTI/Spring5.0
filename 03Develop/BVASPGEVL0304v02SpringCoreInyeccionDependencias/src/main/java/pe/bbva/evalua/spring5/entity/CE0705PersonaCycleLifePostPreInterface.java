package pe.bbva.evalua.spring5.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CE0705PersonaCycleLifePostPreInterface implements InitializingBean, DisposableBean{
	private static final Logger LOG = LoggerFactory.getLogger("CE0705PersonaCycleLifePostPreInterface");
	
	private int id;
	private String nombre;
	private String apodo;
	
	public CE0702PaisCycleLife pais;

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

	@Override
	public void afterPropertiesSet() throws Exception {
		LOG.info("[EVL] CE0705PersonaCycleLifePostPreInterface - Antes de inicializar : Se ejecuta despues de instanciar la clase");
		
	}

	@Override
	public void destroy() throws Exception {
		LOG.info("[EVL] CE0705PersonaCycleLifePostPreInterface - Bean a punto de ser destruido : ");
		
	}
}
