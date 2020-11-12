package pe.unjfsc.daw.spring5.entity;

public class CEAfiliado {
	private long empId;
	private String empName;
	private CEAddress officeAddress;
	private String officeLocation;
	private String employeeInfo;

	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public CEAddress getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(CEAddress officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public String getEmployeeInfo() {
		return employeeInfo;
	}
	public void setEmployeeInfo(String employeeInfo) {
		this.employeeInfo = employeeInfo;
	}
}
