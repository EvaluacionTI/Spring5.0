package pe.etg.bbva.spring.entity;

public class CE02Empleado {
	private int id;
	private String name;
	private float salary;
	private String designation;
	
	public CE02Empleado() {}
	
	public CE02Empleado(int piId, String psName, float pfSalary, String psDesignation) {
		this.id = piId;
		this.name = psName;
		this.salary = pfSalary;
		this.designation = psDesignation;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE02Empleado [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", designation=");
		builder.append(designation);
		builder.append("]");
		return builder.toString();
	}
}
