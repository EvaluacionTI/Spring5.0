package pe.unjfsc.daw.spring5.utility;

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
import javax.swing.table.DefaultTableModel;

import org.springframework.context.ApplicationContext;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.impl.CMSaldoDisponible;
import pe.unjfsc.daw.spring5.model.CDSaldoAfiliado;

public class CUMostrarAbstractTable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPaneTabla;
	private JTable tablaAfialiado;
	private static double[] maResult, maDataProcesar; 
	

	ArrayList<CESaldoAfiliado> listaAfiliado;
	ApplicationContext moCntx;
	
	public CUMostrarAbstractTable(ApplicationContext poCntx) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("[DAW] Listado de Saldos Disponible a transferir");
		setSize(800, 600);
		
		this.moCntx = poCntx;
		CDSaldoAfiliado oCDDataSaldo = (CDSaldoAfiliado) moCntx.getBean("idCDSaldoAfiliado");
		CMSaldoDisponible oSaldoDisponible = (CMSaldoDisponible) moCntx.getBean("idCMSaldoDisponible");
		
		maDataProcesar = new double[100];
		maDataProcesar = oCDDataSaldo.saldoAfiliado();
		
		maResult = new double[maDataProcesar.length];
		maResult = oSaldoDisponible.listaSaldoBucleWhile(maDataProcesar);
		
		iniciarComponentes();
		setLocationRelativeTo(null);
		construirTabla();
	}
	
	public void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel oLabelTablaAfiliado = new JLabel("Tabla de Afiliados");
		oLabelTablaAfiliado.setFont(new Font("Rockwell", Font.BOLD,15));
		contentPane.add(oLabelTablaAfiliado, BorderLayout.NORTH);
		
		scrollPaneTabla = new JScrollPane();
		contentPane.add(scrollPaneTabla);
		
		tablaAfialiado = new JTable();
		tablaAfialiado.setBackground(Color.WHITE);
		tablaAfialiado.setBorder(new BevelBorder(BevelBorder.RAISED,null,null,null,null));
		tablaAfialiado.setOpaque(false);
		
		scrollPaneTabla.setViewportView(tablaAfialiado);
		
	}
	
	public void construirTabla() {
		//Titulos
		String[] sTitulos = new String[3];
		sTitulos[0] = "Identificador";
		sTitulos[1] = "Código Afiliado";
		sTitulos[2] = "Saldo CIC";
		
		listaAfiliado = consultaAllAfiliado();
		Object[][] oData = obtenerMatrizDatos(sTitulos);
		
		DefaultTableModel modelo = new DefaultTableModel(oData, sTitulos);
		tablaAfialiado.setModel(modelo);
		scrollPaneTabla.setViewportView(tablaAfialiado);
	}
	
	private ArrayList<CESaldoAfiliado> consultaAllAfiliado(){
		ArrayList<CESaldoAfiliado> oListaAfiliado = new ArrayList<>();
		
		for (int i=0; i<maResult.length;i++) {
			oListaAfiliado.add(new CESaldoAfiliado((i+2020), "Afiliado " + (i+1), maResult[i]));
		}
		return oListaAfiliado;
	}
	
	private Object[][] obtenerMatrizDatos(String[] psTitulos){
		String informacion[][] = new String[listaAfiliado.size()][psTitulos.length];
		
		for(int x=0; x<informacion.length;x++) {
			informacion[x][CUConstantTable.IDENTIFICADOR]=String.valueOf(listaAfiliado.get(x).getId());
			informacion[x][CUConstantTable.CODIGO_AFILIADO]=String.valueOf(listaAfiliado.get(x).getCodigoAfiliado());
			informacion[x][CUConstantTable.SALDO_CIC]=String.valueOf(listaAfiliado.get(x).getSaldoCIC());
		}
		return informacion;
	}
}
