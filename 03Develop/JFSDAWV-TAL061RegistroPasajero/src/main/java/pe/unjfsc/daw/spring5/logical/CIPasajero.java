package pe.unjfsc.daw.spring5.logical;


import pe.unjfsc.daw.spring5.entity.CEDistancia;

public interface CIPasajero {
	public double calcularDistancia(CEDistancia pCEDatoRuta);
	public String numeroBoletaElectronica(String sSerie, String sNumero);
	public double convertirMinuscula();

}
