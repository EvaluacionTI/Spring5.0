package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.logical.CIEvaluarSuperficie;
import pe.unjfsc.daw.spring5.logical.impl.CMEvaluarArea;

public class CV01ValidarRadio {
    public static final Logger LOG = LoggerFactory.getLogger("CV01ValidarRadio");
    
    public static void main(String[] args) {
        LOG.info("[EVL] Start");
        CEAreaSuperficieLateral oCEDatoBasicos = new CEAreaSuperficieLateral();
        CIEvaluarSuperficie oCIArea = new CMEvaluarArea();
        
         LOG.info("[EVL] CEAreaSuperficieLateral - oCEDatoBasicos: {}", oCEDatoBasicos);
         LOG.info("[EVL] CIEvaluarSuperficie - oCIArea : {}", oCIArea);

         oCEDatoBasicos.setLsa(CEConstant.LSA);
         oCEDatoBasicos.setAltura(500);
         LOG.info("[EVL] CEAreaSuperficieLateral - oCEDatoBasicos: {}", oCEDatoBasicos);
         
         LOG.info("[EVL] CIEvaluarSuperficie - oCIArea: {}", oCIArea.calcularLSA(oCEDatoBasicos));
    }
}
