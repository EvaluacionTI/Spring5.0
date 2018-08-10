package pe.bbva.architecture.entity;

public class CEOtroMensaje {
	private CEMensaje moCEMensaje;
	
	public CEOtroMensaje() {}

	public CEOtroMensaje(CEMensaje poCEMensaje) {
		this.moCEMensaje = poCEMensaje;
	}

	public CEMensaje getMoCEMensaje() {
		return moCEMensaje;
	}

	public void setMoCEMensaje(CEMensaje moCEMensaje) {
		this.moCEMensaje = moCEMensaje;
	}
}
