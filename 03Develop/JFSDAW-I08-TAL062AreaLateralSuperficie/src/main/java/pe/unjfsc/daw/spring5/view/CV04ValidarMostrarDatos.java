package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEAreaTotalSuperficie;
import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CEMostrarDatos;
import pe.unjfsc.daw.spring5.logical.CIEvaluarSuperficie;
import pe.unjfsc.daw.spring5.logical.impl.CMEvaluarArea;
import pe.unjfsc.daw.spring5.utility.CUConvert;

public class CV04ValidarMostrarDatos {
    public static final Logger LOG = LoggerFactory.getLogger("CV02ValidarArea");

    private static CEAreaSuperficieLateral oCELsaRequest;
    private static CEAreaSuperficieLateral oCELsaResponse;
    private static CIEvaluarSuperficie oCIArea;
    private static CEAreaTotalSuperficie oCEAtsRequest, oCEAtsResponse;
    private static CEMostrarDatos oCEMostrarRequest;
    private static CUConvert oCUtility;
    
    public static void main(String[] args) {
        LOG.info("[EVL] Start");
        oCELsaRequest = new CEAreaSuperficieLateral();
        oCELsaResponse = new CEAreaSuperficieLateral();
        oCIArea = new CMEvaluarArea();
        oCEAtsRequest = new CEAreaTotalSuperficie();
        oCEAtsResponse = new CEAreaTotalSuperficie();
        oCEMostrarRequest = new CEMostrarDatos();
        oCUtility = new CUConvert();
        
        oCELsaRequest.setLsa(CEConstant.LSA);
        oCELsaRequest.setAltura(500);
        oCELsaResponse = oCIArea.calcularLSA(oCELsaRequest);

        LOG.info("[EVL] CEAreaSuperficieLateral - Request: {}", oCELsaRequest);
        LOG.info("[EVL] CEAreaSuperficieLateral - Response: {}", oCELsaResponse);

        oCEAtsRequest.setoCELsa(oCELsaResponse);
        LOG.info("[EVL] Area Total Superficie - Request : {}", oCEAtsRequest);        

        oCEAtsResponse = oCIArea.calcularTSA(oCEAtsRequest);
        LOG.info("[EVL] Area Total Superficie - Response : {}", oCEAtsResponse);
        
        oCEMostrarRequest.setoCELsa(oCELsaResponse);
        oCEMostrarRequest.setoCETsa(oCEAtsResponse);
        oCEMostrarRequest.setValorPI(CEConstant.PI);
        String sNumero = String.valueOf(oCEAtsResponse.getAte());
        LOG.info("[EVL] Numero a evaluar : {}",sNumero);
        oCEMostrarRequest.setRotarIzquiedaDerecha(oCUtility.rotarIzquierdaDerecha(sNumero));
        
        sNumero = oCEMostrarRequest.getRotarIzquiedaDerecha();
        oCEMostrarRequest.setPrimerUltimoCaracter(oCUtility.extraerPrimerUltimaPosicion(sNumero));
        LOG.info("[EVL] Datos a mostrar - Response : {}", oCEMostrarRequest);
    }
}
