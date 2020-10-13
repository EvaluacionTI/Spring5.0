package pe.unjfsc.daw.spring5.logical;

import pe.unjfsc.daw.spring5.entity.CEFormula;
import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CEProyeccion;
import pe.unjfsc.daw.spring5.entity.CEUnionListas;

public interface CIProyeccion {
	public CEFormula buscarTasa(CEMeses poCEMes);
	public CEProyeccion integrarTasaInteres(CEMeses poCEMes);
	public CEUnionListas llenarListas(CEProyeccion oCEProyeccion);
}
