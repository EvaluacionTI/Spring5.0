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
import javax.swing.table.DefaultTableModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.logical.impl.CMSaldoDisponible;
import pe.bbva.evalua.spring5.modelo.CDSaldoAfiliado;

public class CUMostrarAbstractTable extends JFrame {

	private static final long serialVersionUID = -6410992517297726159L;
	public static final Logger LOG = LoggerFactory.getLogger("CUMostrarAbstractTable");
	
	private JPanel contentPane;
	private JScrollPane scrollPaneTabla;
	private JTable tablaAfiliado;
	private static double[] maResult, maDataProcesar;

	ArrayList<CESaldoAfiliadoCustom> listaAfiliado;
	ApplicationContext moCntx;
	
	public CUMostrarAbstractTable(ApplicationContext poCntx) {
		LOG.info("[EVL] Instancia de CUMostrarAbstractTable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("[EVL] Evaluación Spring5 with Swing");
		setSize(800, 600);

		this.moCntx = poCntx;
		LOG.info("[EVL] ApplicationContext : {} ", moCntx);
		CDSaldoAfiliado oCDataSaldo = (CDSaldoAfiliado) moCntx.getBean("idCDataAfiliado");
		CMSaldoDisponible oCIRetiroAFP = (CMSaldoDisponible) moCntx.getBean("idCMSaldoDisponible");
		
		LOG.info("[EVL] Data Retiro        : {} ", oCDataSaldo);
		LOG.info("[EVL] Entidad Retiro     : {} ", oCIRetiroAFP);
		LOG.info("[EVL] Vector de Retiro[] : {} ", oCDataSaldo.saldoAfiliado());
	
		maDataProcesar = new double[100];
		maDataProcesar = oCDataSaldo.saldoAfiliado();

		maResult = new double[maDataProcesar.length];
		maResult = oCIRetiroAFP.listaSaldoBucleWhile(maDataProcesar);
		LOG.info("[EVL] Saldo Final con While    : {} ", maResult);
		
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
		
		//Titulos de las columnas
		String[] sTitulos = new String[3];
		sTitulos[0] = "Identificador";
		sTitulos[1] = "Código Afiliado";
		sTitulos[2] = "Saldo CIC";
		
		LOG.info("[EVL] String[] Titulos : {} ", sTitulos);
		
		//Se asigna los datos de la lista y los guardamos en una matriz para construir la tabla
		listaAfiliado = consultaListaAfiliado();
		Object[][] oData = obtenerMatrizDatos(sTitulos);
		
		DefaultTableModel modelo = new DefaultTableModel(oData, sTitulos);
		
		//Se asigna el modelo a la tabla
		tablaAfiliado.setModel(modelo);
		
		scrollPaneTabla.setViewportView(tablaAfiliado);
	}	

	private ArrayList<CESaldoAfiliadoCustom> consultaListaAfiliado(){
		ArrayList<CESaldoAfiliadoCustom> oListAfiliado = new ArrayList<>();
		
		for(int i = 0; i<maResult.length;i++) {
			oListAfiliado.add(new CESaldoAfiliadoCustom((i+2020), "Afiliado " + (i+1), maResult[i]));			
		}
		LOG.info("[EVL] Lista Afiliado Array List : {} ", oListAfiliado);
		return oListAfiliado;
	}

	private Object[][] obtenerMatrizDatos(String[] psTitulos){
		String informacion[][] = new String[listaAfiliado.size()][psTitulos.length];
		
		for(int x=0; x<informacion.length;x++) {
			informacion[x][CUTableConstantCustom.IDENTIFICADOR] = String.valueOf(listaAfiliado.get(x).getId());
			informacion[x][CUTableConstantCustom.CODIGO_AFILIADO] = listaAfiliado.get(x).getCodigoAfiliado();
			informacion[x][CUTableConstantCustom.SALDO_CID] = String.valueOf(listaAfiliado.get(x).getSaldoCIC());
		}
		LOG.info("[EVL] Object[][] data Afiliados   : {} ", informacion);
		return informacion;
	}
}