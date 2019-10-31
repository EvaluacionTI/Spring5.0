package pe.unjfsc.daw.entidad;

public class CEHorarioConstructor {
	private String HoraInicio;
	private String HoraTermino;
	
	// Creando un constructor
	public CEHorarioConstructor(String psHoraInicio, String psHoraTermino) {
		this.HoraInicio = psHoraInicio;
		this.HoraTermino = psHoraTermino;
	}
	
	public String getHoraInicio() {
		return HoraInicio;
	}
	public void setHoraInicio(String horaInicio) {
		HoraInicio = horaInicio;
	}
	public String getHoraTermino() {
		return HoraTermino;
	}
	public void setHoraTermino(String horaTermino) {
		HoraTermino = horaTermino;
	}
}
