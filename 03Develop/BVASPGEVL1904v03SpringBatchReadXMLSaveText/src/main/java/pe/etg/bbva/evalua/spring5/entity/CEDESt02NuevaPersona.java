package pe.etg.bbva.evalua.spring5.entity;

public class CEDESt02NuevaPersona {
	private String nombreApellido;
	private char sexo;
	
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEDESt02NuevaPersona [nombreApellido=");
		builder.append(nombreApellido);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append("]");
		return builder.toString();
	}
}
