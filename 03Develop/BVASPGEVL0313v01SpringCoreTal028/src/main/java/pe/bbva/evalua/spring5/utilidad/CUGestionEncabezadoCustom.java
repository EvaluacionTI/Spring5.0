package pe.bbva.evalua.spring5.utilidad;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class CUGestionEncabezadoCustom implements TableCellRenderer {

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		JComponent jcomponent = null;
		
		if (value instanceof String) {
			jcomponent = new JLabel((String) value);
			((JLabel)jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
			((JLabel)jcomponent).setSize(50, jcomponent.getWidth());
			((JLabel)jcomponent).setPreferredSize(new Dimension(6, jcomponent.getHeight()));
		}
		
		jcomponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, Color.ORANGE));
		jcomponent.setOpaque(true);
		jcomponent.setBackground(new Color(236,84,89));
		//jcomponent.setBackground(new Color(65,75,85));
		jcomponent.setToolTipText("[EVL] Seguimiento de Afiliados por Retiro AFP 25%");
		jcomponent.setForeground(Color.BLUE);
		return jcomponent;
	}

}
