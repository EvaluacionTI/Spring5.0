package pe.etg.bbva.spring.controller;

public class CC01CanalHost {
	// Esta clase esta fuertemente ligada a la clase canal APX
	CC01CanalAPX oCanal = new CC01CanalAPX();
	
	public void mostrarCanalApx() {
		oCanal.mostrarAPX();
	}
}
