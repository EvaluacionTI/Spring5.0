package pe.unjfsc.daw.spring5.entity;

public class CEAddress {
	private String number;
	private String street;
	private String city;
	private String state;
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
