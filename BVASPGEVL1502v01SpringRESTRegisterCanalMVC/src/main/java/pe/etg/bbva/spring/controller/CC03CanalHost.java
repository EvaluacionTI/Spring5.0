package pe.etg.bbva.spring.controller;

public class CC03CanalHost {
	private CI03CanalHost iCanal;
	
	// Por constructor
	public CC03CanalHost(CI03CanalHost pCanal) {
		this.iCanal = pCanal;
	}
	
	// Instancia por el método set
	public void setoCanalAPX(CI03CanalHost pCanal) {
		this.iCanal = pCanal;
	}

	public void mostrarCanalApx() {
		iCanal.mostrarCanal();
	}	

}
