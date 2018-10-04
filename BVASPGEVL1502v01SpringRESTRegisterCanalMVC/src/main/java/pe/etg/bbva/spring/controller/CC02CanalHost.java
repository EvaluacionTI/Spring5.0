package pe.etg.bbva.spring.controller;

public class CC02CanalHost {
	private CC01CanalAPX oCanalAPX;

	// Instancia por constructor
	public CC02CanalHost(CC01CanalAPX poCanal) {
		this.oCanalAPX = poCanal;
	}
	
	// Instancia por el método set
	public void setoCanalAPX(CC01CanalAPX oCanalAPX) {
		this.oCanalAPX = oCanalAPX;
	}
	
	public void mostrarCanalApx() {
		oCanalAPX.mostrarAPX();
	}
}
