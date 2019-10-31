package pe.etg.bbva.evalua.spring5.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DESt03_usuario")
public class CEUsuario {
	@Id
	private String id;
	private String firtname;
	private String lastname;
	
	public CEUsuario() {}
	
	public CEUsuario(String psFirstName, String psLastName) {
		this.firtname = psFirstName;
		this.lastname = psLastName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirtname() {
		return firtname;
	}
	public void setFirtname(String firtname) {
		this.firtname = firtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
