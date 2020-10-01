package pe.unjfsc.daw.spring5.utility;

public class CUConvert {
	public String rotarDerechaIzquierda(String psCadena) {
		String sCadenaRotada = "";
		
		for (int i=psCadena.length();i>0;i--) {
			sCadenaRotada = sCadenaRotada + psCadena.substring(i-1, i);
		}
		
		return sCadenaRotada.trim();
	}
	
	public String extraerPrimerUltimaPosicion(String psCadena) {
		String sPrimerUltimo = "";
		
		sPrimerUltimo = psCadena.substring(0, 1) + psCadena.substring(psCadena.length()-1, psCadena.length());
		return sPrimerUltimo.trim();
	}
}
