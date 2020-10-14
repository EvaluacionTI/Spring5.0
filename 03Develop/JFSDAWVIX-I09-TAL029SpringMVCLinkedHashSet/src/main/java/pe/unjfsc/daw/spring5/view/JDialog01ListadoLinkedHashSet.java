package pe.unjfsc.daw.spring5.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;

public class JDialog01ListadoLinkedHashSet extends JDialog {
	private JTable table;

	public static void main(String[] args) {
		try {
			JDialog01ListadoLinkedHashSet dialog = new JDialog01ListadoLinkedHashSet();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JDialog01ListadoLinkedHashSet() {
		setBounds(100, 100, 450, 300);
		{
			JPanel jPanelHeader = new JPanel();
			getContentPane().add(jPanelHeader, BorderLayout.NORTH);
			{
				JLabel lblNewLabel = new JLabel("Listado de LinkedHashSet");
				jPanelHeader.add(lblNewLabel);
			}
		}

		{
			JPanel jPanelBody = new JPanel();
			FlowLayout fl_jPanelBody = (FlowLayout) jPanelBody.getLayout();
			getContentPane().add(jPanelBody, BorderLayout.CENTER);
			{
				table = new JTable();
				jPanelBody.add(table);
			}
			{
				JButton btnConsultar = new JButton("Consultar");
				jPanelBody.add(btnConsultar);
			}
			{
				JButton btnSalir = new JButton("Salir");
				jPanelBody.add(btnSalir);
			}
		}
		{
			JPanel jPanelFoot = new JPanel();
			getContentPane().add(jPanelFoot, BorderLayout.SOUTH);
			{
				table = new JTable();
				jPanelFoot.add(table);
			}
		}		
	}

}
