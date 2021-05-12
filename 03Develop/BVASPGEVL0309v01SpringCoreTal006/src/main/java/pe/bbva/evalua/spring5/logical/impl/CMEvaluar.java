package pe.bbva.evalua.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.logical.CIUtilidad;

public class CMEvaluar implements CIUtilidad {
	private static final Logger LOG = LoggerFactory.getLogger("CMEvaluar");
	private static final int TOPE = 10;
	
	@Override
	public String convertirMayuscula(String pCadenaMinuscula) {

		String enMayuscula = pCadenaMinuscula.toUpperCase();
		return enMayuscula;
	}

	@Override
	public long generarNumero() {

		LOG.info("Rango generado : {}", Math.random());
		LOG.info("Rango entre 0 y tope : {} {}", TOPE, Math.random()*TOPE);
		LOG.info("Rango entre 1 y tope : ", Math.random()*TOPE + 1);
		LOG.info("Rango entero entre 1 y tope : {} ", Math.floor(Math.random()*TOPE + 1));
		
		long valorGenerado = (long) Math.floor(Math.random()*TOPE+1);
		
		return valorGenerado;
	}
}
