package pe.bbva.evalua.spring5.modelo;

import javax.swing.table.DefaultTableModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.utilidad.CUTableConstantCustom;

public class CDModelTablaCustom extends DefaultTableModel {
	public static final Logger LOG = LoggerFactory.getLogger("CDModelTablaCustom");
	
	private static final long serialVersionUID = 1L;
	String[] msTitulos;
	Object[][] moDatos;

	public CDModelTablaCustom() {}
	
	public CDModelTablaCustom(String[] psTitulos, Object[][] poDatos) {
		super();
		LOG.info("[EVL] N° Filas, N° Columna : {} {}", poDatos.length, psTitulos.length);
		
		this.msTitulos = psTitulos;
		this.moDatos = poDatos;
		setDataVector(poDatos, psTitulos);
	}
	
	public boolean isCellEditable(int piRow, int piColumn) {
		//Definimos si una celda puede ser editable o no
		LOG.info("[EVL] Fila, Columna : {} {}", piRow, piColumn);
		if (piColumn!=CUTableConstantCustom.IDENTIFICADOR && piColumn != CUTableConstantCustom.CODIGO_AFILIADO) {
			return false;
		}else {
			return true;
		}
		
	}
}
