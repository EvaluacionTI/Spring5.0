package pe.unjfsc.daw.logica.impl;

import pe.unjfsc.daw.logica.CIWelcome;

public class CMWelcomeCursoDesarrolloWeb implements CIWelcome{

	private String mensaje;

	//Por constructor
	public CMWelcomeCursoDesarrolloWeb() {}
	
	public CMWelcomeCursoDesarrolloWeb(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	//Por setter
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void bienvenido() {
		System.out.println(mensaje);
		
	}
}
