package pe.etg.bbva.evalua.spring5.logica;

public class CLOperacionesComplejas {

	/*
	 * Se está definiendo la recursividad de un número entero, es decir llamarse asi mismo al método
	 */
	public int factorialEntero(int piNumero) {
		int iResult;
		if (piNumero <=1) {
			iResult = 1;
		}else {
			iResult = piNumero * factorialEntero(piNumero - 1);
		}
		
		return iResult;
	}
}
