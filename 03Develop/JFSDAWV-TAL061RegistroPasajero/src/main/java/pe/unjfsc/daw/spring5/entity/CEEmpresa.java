package pe.unjfsc.daw.spring5.entity;

public class CEEmpresa extends CEEntity{
	private String RUC;

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEEmpresa [RUC=");
		builder.append(RUC);
		builder.append("]");
		return builder.toString();
	}
	
}
