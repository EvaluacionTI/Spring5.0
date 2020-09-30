package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEAreaTotalSuperficie;
import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.logical.CIEvaluarSuperficie;
import pe.unjfsc.daw.spring5.logical.impl.CMEvaluarArea;

public class CV02ValidarArea {

    public static final Logger LOG = LoggerFactory.getLogger("CV02ValidarArea");
    private static CEAreaSuperficieLateral oCEDatoBasicos;
    private static CEAreaSuperficieLateral oCERptaDatoBasicos;
    
    public static void main(String[] args) {
        LOG.info("[EVL] Start");
        oCEDatoBasicos = new CEAreaSuperficieLateral();
        oCERptaDatoBasicos = new CEAreaSuperficieLateral();
        CIEvaluarSuperficie oCIArea = new CMEvaluarArea();

        CEAreaTotalSuperficie oCEAts = new CEAreaTotalSuperficie();
        
        LOG.info("[EVL] CEAreaSuperficieLateral - oCEDatoBasicos: {}", oCEDatoBasicos);
        LOG.info("[EVL] CIEvaluarSuperficie - oCIArea : {}", oCIArea);

        oCEDatoBasicos.setLsa(CEConstant.LSA);
        oCEDatoBasicos.setAltura(500);
        LOG.info("[EVL] CEAreaSuperficieLateral - oCEDatoBasicos: {}", oCEDatoBasicos);

        oCERptaDatoBasicos = oCIArea.calcularLSA(oCEDatoBasicos);

        LOG.info("[EVL] CEAreaSuperficieLateral - oCERptaDatoBasicos: {}", oCERptaDatoBasicos);

        oCEAts.setoCELsa(oCERptaDatoBasicos);
        LOG.info("[EVL] Area Total Superficie : {}", oCIArea.calcularTSA(oCEAts));
    }
}
