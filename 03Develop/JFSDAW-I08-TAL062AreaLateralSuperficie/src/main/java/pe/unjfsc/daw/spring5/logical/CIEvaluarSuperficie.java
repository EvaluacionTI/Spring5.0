package pe.unjfsc.daw.spring5.logical;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEAreaTotalSuperficie;
import pe.unjfsc.daw.spring5.entity.CEMostrarDatos;

public interface CIEvaluarSuperficie {
    public CEAreaSuperficieLateral calcularLSA(CEAreaSuperficieLateral poLSA);
    public CEAreaTotalSuperficie calcularTSA(CEAreaTotalSuperficie poTSA);
    public CEMostrarDatos procesarData(CEMostrarDatos poData);
}
