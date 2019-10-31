package etg.bbva.evalua.spring.servicio.impl;

//import org.springframework.stereotype.Service;

import etg.bbva.evalua.spring.servicio.CIHelloService;

//@Service("saludaServicioSinXML")
public class CMHelloService implements CIHelloService {

	@Override
	public void saludar() {
		System.out.println("Arquitectura Host - Rest");
	}

	public void mensajeEntelgy() {
		System.out.println("Factory - Rest");
	}

	public void mensajeBbva() {
		System.out.println("BBVA - CICS");
	}
	
}
