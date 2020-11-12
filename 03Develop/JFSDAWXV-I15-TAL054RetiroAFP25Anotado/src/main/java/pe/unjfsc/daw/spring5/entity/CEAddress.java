package pe.unjfsc.daw.spring5.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("idDirecion")
public class CEAddress {
	@Value("101")
	private String number;
	@Value("#{'Canete Km 61'}")
	private String street;
	@Value("Lima")
	private String city;
	@Value("Canete")
	private String state;
	@Value("#{'522309'}")
	private String pinCode;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public String getAddress(String empName) {
		return empName + " Direccón " + number + ", " + street + ", " + city + ", " + state + ", " + pinCode;
	}
}
