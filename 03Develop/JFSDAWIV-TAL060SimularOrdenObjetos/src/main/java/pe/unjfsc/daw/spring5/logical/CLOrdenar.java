package pe.unjfsc.daw.spring5.logical;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEDatoEntrada;
import pe.unjfsc.daw.spring5.entity.CEOrdenar;

public class CLOrdenar {
	private static final Logger LOG = LoggerFactory.getLogger("CLOrdenar");
	private static final int MIN_NUMBER = 10000;
	private static final int MAX_NUMBER = 99999;
	
	public CEOrdenar ordenarNumeros(CEDatoEntrada poEntrada) {
		int mayor = 0, medio = 0, menor = 0;

		CEOrdenar oCEOrdenado = new CEOrdenar();
		LOG.info("[EVL] Dato recibido : {}", poEntrada);
		if (poEntrada.getA() > poEntrada.getB()) {
			if (poEntrada.getA() > poEntrada.getC() && poEntrada.getB() > poEntrada.getC()) {
				mayor = poEntrada.getA();
				medio = poEntrada.getB();
				menor = poEntrada.getC();
			} else {
				mayor = poEntrada.getA();
				medio = poEntrada.getC();
				menor = poEntrada.getB();
			}
		} else {
			if (poEntrada.getA() > poEntrada.getC()) {
				if (poEntrada.getB() > poEntrada.getC()) {
					mayor = poEntrada.getB();
					medio = poEntrada.getA();
					menor = poEntrada.getC();

				} else {
					mayor = poEntrada.getB();
					medio = poEntrada.getC();
					menor = poEntrada.getA();
				}
			} else {
				if (poEntrada.getB()>poEntrada.getC()) {
					mayor = poEntrada.getB();
					medio = poEntrada.getC();
					menor = poEntrada.getA();
				}else {
					mayor = poEntrada.getC();
					medio = poEntrada.getB();
					menor = poEntrada.getA();
				}
			}
		}

		oCEOrdenado.setMayor(mayor);
		oCEOrdenado.setMedio(medio);
		oCEOrdenado.setMenor(menor);

		LOG.info("[EVL] Dato Ordenado : {}", oCEOrdenado);
		return oCEOrdenado;
	}
	
	public CEOrdenar ordenarNumeros(int a, int b, int c) {
		int mayor = 0, medio = 0, menor = 0;

		CEOrdenar oCEOrdenado = new CEOrdenar();
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

	public int numeroGenerado() {
		 
		Random oR = new Random();
		int minimo = MIN_NUMBER;
		int maximo = MAX_NUMBER;
		
		int iResult = oR.nextInt(maximo - minimo) + minimo;
		LOG.info("[EVL] Numero generado : {}", iResult);
		return iResult;
	}
}
