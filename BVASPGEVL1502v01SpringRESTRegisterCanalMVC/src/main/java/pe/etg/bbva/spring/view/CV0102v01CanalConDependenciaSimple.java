package pe.etg.bbva.spring.view;

import pe.etg.bbva.spring.controller.CC02CanalHost;
import pe.etg.bbva.spring.controller.CC01CanalAPX;

public class CV0102v01CanalConDependenciaSimple {
	public static void main (String[] psArgs) {
		CC02CanalHost mInyeccionConstructor = new CC02CanalHost(new CC01CanalAPX());
		
		CC02CanalHost mInyeccionSet = new CC02CanalHost(new CC01CanalAPX());
	
		mInyeccionSet.setoCanalAPX(new CC01CanalAPX());
		
		System.out.println("Inyección por Construcctor : " + mInyeccionConstructor);
		mInyeccionConstructor.mostrarCanalApx();
		
		System.out.println("Inyección por set : " + mInyeccionSet);
		mInyeccionSet.mostrarCanalApx();
	}
	
}
