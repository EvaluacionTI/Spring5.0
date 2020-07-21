package pe.bbva.evalua.spring5.utilidad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.modelo.CDModelTablaCustom;

public class CUWindowCustom extends JFrame{
	public static final Logger LOG = LoggerFactory.getLogger("CUWindowCustom");
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPaneTabla;
	private JTable tablaAfiliado;
	ArrayList<CESaldoAfiliadoCustom> listaAfiliado;
	
	CDModelTablaCustom modelo;
	
	public CUWindowCustom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("[EVL] Evaluación Spring5 with Swing");
		setSize(800, 600);
		
		iniciarComponentes();
		setLocationRelativeTo(null);
		construirTabla();
	}
	
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0,0));
		
		JLabel oJLabelTablaAfiliado = new JLabel("Tabla de Afiliados");
		oJLabelTablaAfiliado.setFont(new Font("Rockwell", Font.BOLD, 15));
		contentPane.add(oJLabelTablaAfiliado, BorderLayout.NORTH);
		
		scrollPaneTabla = new JScrollPane();
		contentPane.add(scrollPaneTabla);
		
		tablaAfiliado = new JTable();
		tablaAfiliado.setBackground(Color.WHITE);
		tablaAfiliado.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tablaAfiliado.setOpaque(false);
		
		scrollPaneTabla.setViewportView(tablaAfiliado);
	}
	
	public void construirTabla() {
		
		listaAfiliado = consultaListaAfiliado();
		
		//Titulos de las columnas
		ArrayList<String> aoTitulos = new ArrayList<>();
		aoTitulos.add("Identificador");
		aoTitulos.add("Código Afiliado");
		aoTitulos.add("Saldo CIC");
		
		//Se asigna las columnas al arreglo para enviar al constructor
		String[] sTitulos = new String[aoTitulos.size()];
		
		for (int i=0;i<sTitulos.length;i++) {
			sTitulos[i]=aoTitulos.get(i);
		}
		
		//Se asigna los datos de la lista y los guardamos en una matriz para construir la tabla
		Object[][] oData = obtenerMatrizDatos(aoTitulos);
		construirTabla(sTitulos, oData);
		
	}
	
	private ArrayList<CESaldoAfiliadoCustom> consultaListaAfiliado(){
		ArrayList<CESaldoAfiliadoCustom> oListAfiliado = new ArrayList<>();
		
		oListAfiliado.add(new CESaldoAfiliadoCustom(1, "052002", 2002));
		oListAfiliado.add(new CESaldoAfiliadoCustom(2, "222014", 2014));
		oListAfiliado.add(new CESaldoAfiliadoCustom(3, "092017", 2017));
		oListAfiliado.add(new CESaldoAfiliadoCustom(4, "302018", 2018));
		oListAfiliado.add(new CESaldoAfiliadoCustom(5, "291967", 1967));
		oListAfiliado.add(new CESaldoAfiliadoCustom(6, "281981", 1981));
		oListAfiliado.add(new CESaldoAfiliadoCustom(7, "061969", 1969));
		
		return oListAfiliado;
	}
	
	/*
	 * Se crea la matriz donde las filas son dinámicas
	 * Las columnas son estáticas
	 */
	private Object[][] obtenerMatrizDatos(ArrayList<String> paTitulosList){
		String informacion[][] = new String[listaAfiliado.size()][paTitulosList.size()];
		
		for(int x=0; x<informacion.length;x++) {
			informacion[x][CUTableConstantCustom.IDENTIFICADOR] = String.valueOf(listaAfiliado.get(x).getId());
			informacion[x][CUTableConstantCustom.CODIGO_AFILIADO] = listaAfiliado.get(x).getCodigoAfiliado();
			informacion[x][CUTableConstantCustom.SALDO_CID] = String.valueOf(listaAfiliado.get(x).getSaldoCIC());
		}
		return informacion;
	}
	
	private void construirTabla(String[] paTitulos, Object[][] paoData) {
		modelo = new CDModelTablaCustom(paTitulos, paoData);
		
		//Se asigna el modelo a la tabla
		tablaAfiliado.setModel(modelo);
		
		//Se asigna el tipod e dato
		tablaAfiliado.getColumnModel().getColumn(CUTableConstantCustom.IDENTIFICADOR).setCellRenderer(new CUGestionCeldasCustom());
		tablaAfiliado.getColumnModel().getColumn(CUTableConstantCustom.CODIGO_AFILIADO).setCellRenderer(new CUGestionCeldasCustom());
		tablaAfiliado.getColumnModel().getColumn(CUTableConstantCustom.SALDO_CID).setCellRenderer(new CUGestionCeldasCustom("numerico"));

		//Se recorre el resto de celdas que seran las que tiene los datos
		//Se resta uno porque es la editable
		for (int i=0;i<=paTitulos.length-1;i++) {
			tablaAfiliado.getColumnModel().getColumn(i).setCellRenderer(new CUGestionCeldasCustom("texto"));
		}
		
		tablaAfiliado.getTableHeader().setReorderingAllowed(false);
		tablaAfiliado.setRowHeight(25); //Tamaño de las celdas
		tablaAfiliado.setGridColor(new Color(0,0,0));
		
		//Se define el tamaño de largo para cada columna y su contenido
		tablaAfiliado.getColumnModel().getColumn(CUTableConstantCustom.IDENTIFICADOR).setPreferredWidth(130);
		tablaAfiliado.getColumnModel().getColumn(CUTableConstantCustom.CODIGO_AFILIADO).setPreferredWidth(180);
		tablaAfiliado.getColumnModel().getColumn(CUTableConstantCustom.SALDO_CID).setPreferredWidth(200);
		
		//Personalizado el encabezado
		JTableHeader oJTableHeader = tablaAfiliado.getTableHeader();
		oJTableHeader.setDefaultRenderer(new CUGestionEncabezadoCustom());
		tablaAfiliado.setTableHeader(oJTableHeader);
		
		//Se asigna la tabla al ScrollPane
		scrollPaneTabla.setViewportView(tablaAfiliado);
	}
}