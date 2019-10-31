package pe.etg.bbva.evalua.spring5.entity;

public class CEStudent{
	/**
	 * 
	 */
	private Long id;
	private String firtName;
	private String lastName;
	private String year;
	
	public CEStudent() {}
	
	public CEStudent(Long pId, String pFirtName, String pLastName, String pYear) {
		this.id = pId;
		this.firtName = pFirtName;
		this.lastName = pLastName;
		this.year = pYear;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEStudent [id=");
		builder.append(id);
		builder.append(", firtName=");
		builder.append(firtName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}

}
