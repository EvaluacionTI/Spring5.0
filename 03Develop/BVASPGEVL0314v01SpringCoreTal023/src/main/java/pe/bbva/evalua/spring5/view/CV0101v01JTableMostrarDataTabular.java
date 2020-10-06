package pe.bbva.evalua.spring5.view;

import javax.swing.JFrame;
import javax.swing.JTable;

import pe.bbva.evalua.spring5.model.CIRetiroAFP25;
import pe.bbva.evalua.spring5.model.impl.CDRetiroAFP25Matrices;

public class CV0101v01JTableMostrarDataTabular {
	private final JFrame oJFrameMain;
	
	CV0101v01JTableMostrarDataTabular(){
        oJFrameMain = new JFrame();
        
        String aTitulo[] = {"Id", "Nombre ", "Saldo CIC"};
        CIRetiroAFP25 oLista = new CDRetiroAFP25Matrices();
        Object[][] oResult = oLista.consultaAllRetiroDimensional();
        
        JTable oTabla = new JTable(oResult, aTitulo);
        
        oJFrameMain.add(oTabla);
        oJFrameMain.setTitle(".....[Evaluacion Swing - JTable].....");
        oJFrameMain.setResizable(false);
        oJFrameMain.setSize(800, 600);
        oJFrameMain.setVisible(true);
    }
	
	public static void main(String[] args) {
		CV0101v01JTableMostrarDataTabular oCVPrincipal = new CV0101v01JTableMostrarDataTabular();

	}

}
