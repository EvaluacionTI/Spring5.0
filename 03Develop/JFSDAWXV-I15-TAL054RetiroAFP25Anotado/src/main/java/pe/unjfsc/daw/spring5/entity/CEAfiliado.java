package pe.unjfsc.daw.spring5.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("idCEAfiliado")
public class CEAfiliado {
	
	@Value("1001")
	private long empId;
	
	@Value("Illari")
	private String empName;
	
	@Value("#{idDirecion}")
	private CEAddress officeAddress;
	
	@Value("#{idDirecion.city}")
	private String officeLocation;
	
	@Value("#{idDirecion.getAddress('Av.')}")
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
