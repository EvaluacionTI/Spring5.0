package pe.unjfsc.daw.spring5.logical.impl;

import pe.unjfsc.daw.spring5.entity.CEPasajero;
import pe.unjfsc.daw.spring5.entity.CETotales;
import pe.unjfsc.daw.spring5.entity.CEValoresMate;
import pe.unjfsc.daw.spring5.entity.CEValoresString;
import pe.unjfsc.daw.spring5.logical.CIRevisionNumeroCadena;

public class CMRevisionNumeroCadena implements CIRevisionNumeroCadena{

	private CEValoresMate oResultMate;
	private CEValoresString oResultString;
	
	@Override
	public CEValoresMate calcularMate(CETotales poCETotales) {
		oResultMate = new CEValoresMate();
		
		oResultMate.setRaizCubica(Math.cbrt(poCETotales.getTotalPagar()));
		oResultMate.setCoseno(Math.cos(poCETotales.getTotalPagar()));
		oResultMate.setValorMasGrande(Math.floor(poCETotales.getTotalPagar()));
		oResultMate.setLogNatural(Math.log(poCETotales.getTotalPagar()));
		oResultMate.setSeno(Math.sin(poCETotales.getTotalPagar()));
		oResultMate.setRaizCuadrada(Math.sqrt(poCETotales.getTotalPagar()));
		oResultMate.setTangente(Math.tan(poCETotales.getTotalPagar()));
		oResultMate.setLogBase10(Math.log10(poCETotales.getTotalPagar()));
		oResultMate.setValorMasPequeno(Math.ceil(poCETotales.getTotalPagar()));
		oResultMate.setValorMasCercano(Math.round(poCETotales.getTotalPagar()));
		
		return oResultMate;
	}

	@Override
	public CEValoresString calcularString(CEPasajero poCEPasajero) {
		oResultString = new CEValoresString();
		
		oResultString.setLongitud(String.valueOf(poCEPasajero.getNombre().length()));
		oResultString.setEnMayuscula(poCEPasajero.getNombre().toUpperCase());
		oResultString.setEnMinuscula(poCEPasajero.getNombre().toLowerCase());
		oResultString.setMostrarSubCadena(poCEPasajero.getNombre().substring(2,4));
		oResultString.setRemplazarSubcadena(poCEPasajero.getNombre().replace("a", "x"));
		oResultString.setConcatenar(poCEPasajero.getNombre().concat("DAW"));
		oResultString.setPrimerAparicion(String.valueOf(poCEPasajero.getNombre().indexOf(6)));
		oResultString.setEliminarEspacios(poCEPasajero.getNombre().trim());
		oResultString.setCaracterIndice(String.valueOf(poCEPasajero.getNombre().charAt(4)));
		oResultString.setUltimAparicion(String.valueOf(poCEPasajero.getNombre().lastIndexOf(5)));
		
		return oResultString;
	}

}
