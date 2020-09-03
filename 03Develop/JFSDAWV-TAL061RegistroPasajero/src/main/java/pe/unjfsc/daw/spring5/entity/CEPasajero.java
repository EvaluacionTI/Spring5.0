package pe.unjfsc.daw.spring5.entity;

public class CEPasajero extends CEEntity {
	private String DNI;

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEPasajero [DNI=");
		builder.append(DNI);
		builder.append("]");
		return builder.toString();
	}
	
}
