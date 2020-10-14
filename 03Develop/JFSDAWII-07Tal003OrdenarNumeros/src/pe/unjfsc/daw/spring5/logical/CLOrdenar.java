package pe.unjfsc.daw.spring5.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEOrdenar;

public class CLOrdenar {
	private static final Logger LOG = LoggerFactory.getLogger("CLOrdenar");
	
	public CEOrdenar ordenarNumeros(int a, int b, int c) {
		int mayor = 0, medio = 0, menor = 0;

		CEOrdenar oCEOrdenado = new CEOrdenar();

		/*
		 * a = 20 20 20 b = 10 5 25 c = 5 10 10
		 */

		if (a > b) {
			if (a > c && b > c) {
				mayor = a;
				medio = b;
				menor = c;
			} else {
				mayor = a;
				medio = c;
				menor = b;
			}
		} else {
			if (a > c) {
				if (b > c) {
					mayor = b;
					medio = a;
					menor = c;

				} else {
					mayor = b;
					medio = c;
					menor = a;
				}
			} else {
				if (b>c) {
					mayor = b;
					medio = c;
					menor = a;
				}else {
					mayor = c;
					medio = b;
					menor = a;
				}
			}
		}

		oCEOrdenado.setMayor(mayor);
		oCEOrdenado.setMedio(medio);
		oCEOrdenado.setMenor(menor);

		LOG.info("[EVL] Ordenado : {}", oCEOrdenado);
		return oCEOrdenado;
	}
}
