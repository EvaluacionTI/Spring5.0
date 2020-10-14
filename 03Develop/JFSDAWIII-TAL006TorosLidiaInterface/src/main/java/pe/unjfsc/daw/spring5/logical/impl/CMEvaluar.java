package pe.unjfsc.daw.spring5.logical.impl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.logical.CIUtilidad;

public class CMEvaluar implements CIUtilidad{
	private static final Logger LOG = LoggerFactory.getLogger("CMEvaluar");
	private static final int MIN_NUMBER = 10000;
	private static final int MAX_NUMBER = 99999;
	
	
	@Override
	public String convertirMinusculaMayuscula(String pCadenaMinuscula) {
		LOG.info("[EVL] Dato que viene : {} ", pCadenaMinuscula);
		String enMayuscula = pCadenaMinuscula.toUpperCase();
		LOG.info("[EVL] Dato que sale : {} ", enMayuscula);
		return enMayuscula;
	}

	@Override
	public int generarCodigo5Digitos() {
		Random oR = new Random();
		LOG.info("[EVL] Instancia de Random : {} ", oR);
		
		int iResult = oR.nextInt(MAX_NUMBER - MIN_NUMBER) + MIN_NUMBER;
		LOG.info("[EVL] Random : {} ", iResult);
		
		return iResult;
	}

}
