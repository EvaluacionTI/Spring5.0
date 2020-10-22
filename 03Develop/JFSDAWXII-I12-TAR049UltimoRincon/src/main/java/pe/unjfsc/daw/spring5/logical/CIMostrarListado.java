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
	
}
