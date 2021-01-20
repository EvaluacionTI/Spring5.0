package com.bbva.qwpu.dto.employed;

import java.util.Date;

public class CEEmployedDTO {
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
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getLimitCredit() {
		return limitCredit;
	}
	public void setLimitCredit(Double limitCredit) {
		this.limitCredit = limitCredit;
	}
	public Boolean getSiNoActivo() {
		return siNoActivo;
	}
	public void setSiNoActivo(Boolean siNoActivo) {
		this.siNoActivo = siNoActivo;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEEmployedDTO [id=");
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
