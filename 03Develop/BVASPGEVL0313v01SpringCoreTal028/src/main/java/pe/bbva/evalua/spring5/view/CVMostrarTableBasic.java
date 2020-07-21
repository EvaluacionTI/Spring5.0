package pe.bbva.evalua.spring5.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class CVMostrarTableBasic extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public CVMostrarTableBasic() {
		
		String[] aColumnsName = {"Código","Afiliado","Saldo Disponible"};
		Object[][] aDatos = {
				{"052002", "Esteban", 2002},
				{"222014", "Illari", 2014},
				{"302017", "Alex", 2017},
				{"092018", "Sayrik",2018}
		};
		
		DefaultTableModel oDtm = new DefaultTableModel(aDatos, aColumnsName);
		final JTable oTable = new JTable(oDtm);
	
		// Agregar nueva columna
		String[] newColumn = {"vago", "diestro", "normal"};
		oDtm.addColumn("Tipo", newColumn);
		
		// Agregar nueva nueva fila
		Object[] newRow = {"assda","sasd", 9282};
		oDtm.addRow(newRow);
		
		// Modificar una celda específica
		oDtm.setValueAt("nuevo valor", 3, 3);
		
		// Modificar el nombre de las columnsa 
		JTableHeader oJth= oTable.getTableHeader();
		TableColumnModel oTcm = oJth.getColumnModel();
		TableColumn oTc = oTcm.getColumn(1);
		oTc.setHeaderValue("Change name Column");
		oJth.repaint();
		
		oTable.setPreferredScrollableViewportSize(new Dimension(250, 100));
		JScrollPane oJScrollPane = new JScrollPane(oTable);
		getContentPane().add(oJScrollPane, BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		
		CVMostrarTableBasic oJFrame = new CVMostrarTableBasic();
		oJFrame.pack();
		oJFrame.setTitle("[EVL] TAL028 Retiro AFP 25%");
		oJFrame.setResizable(false);
		oJFrame.setBounds(20, 40, 800, 600);
		oJFrame.setVisible(true);
		oJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
	}
}
