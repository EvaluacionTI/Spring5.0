package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import pe.unjfsc.daw.spring5.entity.CECliente;
import pe.unjfsc.daw.spring5.entity.CECompraEfectuada;
import pe.unjfsc.daw.spring5.entity.CEProducto;

public interface CIMostrarListado {
	public HashSet<CEProducto> listaProducto();
	public ArrayList<CECliente> listaCliente();
	public LinkedHashSet<CECompraEfectuada> listaCompraEfectuada();
	public LinkedHashSet<CECompraEfectuada> listaClientProductCompraEfectuada();
	public ArrayList<CECompraEfectuada> detailBuyNotOrder(String psCodigo);
	public ArrayList<CECompraEfectuada> detailBuyOrder(String psCodigo);
	public ArrayList<CECompraEfectuada> detailAccumulatedBuyOrder(String psCodigo);
    public ArrayList<CECompraEfectuada> detailNotBuy(String psCodigo);
    
    public String[][] convertHashSetToMatriz(HashSet<CEProducto> poLista);
    public String[][] convertArrayListToMatriz(ArrayList<CECliente> poLista);
    public String[][] convertLinkedHashSetToMatriz(LinkedHashSet<CECompraEfectuada> poLista);
    public String[][] convertLinkedHashSetNameToMatriz(LinkedHashSet<CECompraEfectuada> poLista);
    public String[][] convertBuyArrayListToMatriz(ArrayList<CECompraEfectuada> poLista);
    public String[][] convertNotBuyArrayListToMatriz(ArrayList<CECompraEfectuada> poLista);
}
