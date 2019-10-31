package pe.etg.bbva.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APXt04_customer")
public class CECustomerAuto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_customer")
	private long id;
	
	@Column(name="txt_nombre")
	private String nombre;
	
	@Column(name="txt_apellido")
	private String apellido;
	
	protected CECustomerAuto() {}
	
	public CECustomerAuto(String psNombre, String psApellido) {
		this.nombre = psNombre;
		this.apellido = psApellido;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECustomerAuto [id=").append(id).append(", nombre=").append(nombre).append(", apellido=")
				.append(apellido).append("]");
		return builder.toString();
	}
}
