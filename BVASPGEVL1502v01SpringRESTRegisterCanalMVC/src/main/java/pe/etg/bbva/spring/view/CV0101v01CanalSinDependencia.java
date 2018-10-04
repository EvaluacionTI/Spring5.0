package pe.etg.bbva.spring.view;

import pe.etg.bbva.spring.controller.CC01CanalHost;

public class CV0101v01CanalSinDependencia {

	public static void main(String[] psArgs) {
		CC01CanalHost oCanal = new CC01CanalHost();
		
		System.out.println("Mostrar información sin inyección de dependencias");
		oCanal.mostrarCanalApx();
		
	}
}
