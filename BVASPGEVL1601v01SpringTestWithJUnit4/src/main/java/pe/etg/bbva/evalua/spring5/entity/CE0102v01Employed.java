package pe.etg.bbva.evalua.spring5.entity;

import java.util.Date;

public class CE0102v01Employed {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Integer age;
	private Double limitCredit;
	private Boolean siNoActivo;
	private Date fechaRegistro;

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public Integer getAge() {
		return age;
	}

	public Double getLimitCredit() {
		return limitCredit;
	}

	public Boolean getSiNoActivo() {
		return siNoActivo;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setLimitCredit(Double limitCredit) {
		this.limitCredit = limitCredit;
	}

	public void setSiNoActivo(Boolean siNoActivo) {
		this.siNoActivo = siNoActivo;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE0102v01Employed [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", age=");
		builder.append(age);
		builder.append(", limitCredit=");
		builder.append(limitCredit);
		builder.append(", siNoActivo=");
		builder.append(siNoActivo);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}

}
