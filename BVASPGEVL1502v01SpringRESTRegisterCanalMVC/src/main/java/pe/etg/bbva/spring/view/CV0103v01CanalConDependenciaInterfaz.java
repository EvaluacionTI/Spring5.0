package pe.etg.bbva.spring.view;

import pe.etg.bbva.spring.controller.CC03CanalAPX;
import pe.etg.bbva.spring.controller.CC03CanalAPXv8;
import pe.etg.bbva.spring.controller.CC03CanalHost;

public class CV0103v01CanalConDependenciaInterfaz {

	public static void main(String[] args) {
		CC03CanalHost mInyeccionConstructor = new CC03CanalHost(new CC03CanalAPX());
		
		CC03CanalHost mInyeccionSet = new CC03CanalHost(new CC03CanalAPX());

		System.out.println("Inyección por Construcctor : " + mInyeccionConstructor);
		mInyeccionConstructor.mostrarCanalApx();
		
		System.out.println("Inyección por set : " + mInyeccionSet);
		mInyeccionSet.mostrarCanalApx();
		
		
		CC03CanalHost mInyeccionConstructor1 = new CC03CanalHost(new CC03CanalAPXv8());
		
		CC03CanalHost mInyeccionSet1 = new CC03CanalHost(new CC03CanalAPXv8());

		System.out.println("Inyección por Construcctor 1: " + mInyeccionConstructor1);
		mInyeccionConstructor1.mostrarCanalApx();
		
		System.out.println("Inyección por set 1: " + mInyeccionSet1);
		mInyeccionSet1.mostrarCanalApx();
	}

}
