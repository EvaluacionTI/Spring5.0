package pe.unjfsc.daw.spring5.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.controller.CCReceiverSendProyeccion;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

public class JFrameProyeccion extends JFrame {
	private static final Logger LOG = LoggerFactory.getLogger("JFrameProyeccion");

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldMes;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameProyeccion frame = new JFrameProyeccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameProyeccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelTitulo = new JPanel();
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Proyección de Interes");
		panelTitulo.add(lblNewLabel);
		
		JPanel panelDatosEntrada = new JPanel();
		contentPane.add(panelDatosEntrada, BorderLayout.CENTER);
		
		JLabel lblNewLabelMes = new JLabel("Mes :");
		panelDatosEntrada.add(lblNewLabelMes);
		
		textFieldMes = new JTextField();
		panelDatosEntrada.add(textFieldMes);
		textFieldMes.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar Proyeccion");
		panelDatosEntrada.add(btnNewButton);
		
		table = new JTable();
		panelDatosEntrada.add(table, BorderLayout.SOUTH);
	}

}
