package pe.unjfsc.daw.spring5.logical.impl;

import pe.unjfsc.daw.spring5.entity.CEDistancia;
import pe.unjfsc.daw.spring5.logical.CIPasajero;

public class CMPasajero implements CIPasajero {

	@Override
	public double calcularDistancia(CEDistancia pCEDatoRuta) {
		double dResult = 0;
		
		dResult = pCEDatoRuta.getDistanciaDestino() - pCEDatoRuta.getDistanciaOrigen();
		return dResult;
	}

	@Override
	public String numeroBoletaElectronica(String sSerie, String sNumero) {
		String sSerieFinal = "B"+sSerie;
		String sNumeroFinal = "0000" + sNumero;
		// Falta logica para generar y ajusta el numero con cero para 4, 3, 2 y 1 digito
		return (sSerieFinal + "-" + sNumeroFinal);
	}

	@Override
	public double convertirMinuscula() {
		// TODO Auto-generated method stub
		return 0;
	}

}
