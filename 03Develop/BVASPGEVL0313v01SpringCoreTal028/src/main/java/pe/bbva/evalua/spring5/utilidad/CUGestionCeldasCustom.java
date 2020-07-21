package pe.bbva.evalua.spring5.utilidad;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CUGestionCeldasCustom extends DefaultTableCellRenderer {

	private static final long serialVersionUID = 7441534532489559937L;
	private String tipo="text";
	
	//Se define por defecto los datos a usar
	private Font normal = new Font("Ventana", Font.PLAIN, 12);
	private Font bold = new Font("Ventana", Font.BOLD, 12);
	
	public CUGestionCeldasCustom() {}
	
	//Constructor explícito con el tipo de dato que tendrá la celda
	public CUGestionCeldasCustom(String psTipo) {
		this.tipo = psTipo;
	}
	
	public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
		
		//Definimos color por defecto
		Color colorFondo = null;
		Color colorFondoPorDefecto=new Color(192, 192, 192);
		Color colorFondoSeleccion=new Color(140, 140, 140);
		
		//Si la celda seleccionada se asigna el color por defecto
		//Para los no selecionadas se pinta el fondo de la celda
		if (selected) {
			this.setBackground(colorFondoPorDefecto);
		}else {
			this.setBackground(Color.WHITE);
		}
		
		//Se define los tipos de datos que contendrán las celdas basado en lo que hace la ventana al construirla
		if (tipo.equals("texto")) {
			if(focused) {
				colorFondo = colorFondoSeleccion;
			}else {
				colorFondo=colorFondoPorDefecto;
			}
			this.setHorizontalAlignment(JLabel.LEFT);
			this.setText((String)value);
			this.setBackground((selected)?colorFondo:Color.WHITE);
			this.setFont(normal);
			return this;
		}
		
		//Defino si el tipo de datos es numérico
		if (tipo.equals("numerico")) {
			if(focused) {
				colorFondo = colorFondoSeleccion;
			}else {
				colorFondo=colorFondoPorDefecto;
			}
			this.setHorizontalAlignment(JLabel.CENTER);
			this.setText((String)value);
			this.setBackground((selected)?colorFondo:Color.WHITE);
			this.setForeground((selected)? new Color(255, 255, 255): new Color(32, 117, 32));
			this.setFont(bold);
			return this;
		}
		return this;
	}
}
