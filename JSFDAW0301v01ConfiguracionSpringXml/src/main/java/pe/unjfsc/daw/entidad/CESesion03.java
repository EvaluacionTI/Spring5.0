package pe.unjfsc.daw.entidad;

// Definición de la clase para hacer referencia del bean por xml
public class CESesion03 {
	private String numeroSesion;
	private String nombreSesion;
	
	public String getNumeroSesion() {
		return numeroSesion;
	}
	public void setNumeroSesion(String numeroSesion) {
		this.numeroSesion = numeroSesion;
	}
	public String getNombreSesion() {
		return nombreSesion;
	}
	public void setNombreSesion(String nombreSesion) {
		this.nombreSesion = nombreSesion;
	}
	@Override
	public String toString() {
		return "CESesion02 [numeroSesion=" + numeroSesion + ", nombreSesion=" + nombreSesion + "]";
	}
	
}
