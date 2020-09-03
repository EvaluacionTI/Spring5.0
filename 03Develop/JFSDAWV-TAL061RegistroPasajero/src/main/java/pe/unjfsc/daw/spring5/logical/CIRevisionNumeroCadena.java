package pe.unjfsc.daw.spring5.logical;

import pe.unjfsc.daw.spring5.entity.CEPasajero;
import pe.unjfsc.daw.spring5.entity.CETotales;
import pe.unjfsc.daw.spring5.entity.CEValoresMate;
import pe.unjfsc.daw.spring5.entity.CEValoresString;

public interface CIRevisionNumeroCadena {
	public CEValoresMate calcularMate(CETotales poCETotales);
	public CEValoresString calcularString(CEPasajero poCEPasajero);
}
