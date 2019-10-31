package pe.etg.bbva.spring.entity;

public class CEPerson {
	private long id;
	private String firstName;
	private String lastName;
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static CEPerson create(String firstName, String lastName, String address) {
		CEPerson person = new CEPerson();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		return person;
	}

	@Override
	public String toString() {
		return "CEPerson [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ "]";
	}

}
