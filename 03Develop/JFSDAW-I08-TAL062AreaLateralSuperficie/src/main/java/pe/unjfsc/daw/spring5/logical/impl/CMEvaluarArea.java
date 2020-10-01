package pe.unjfsc.daw.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEAreaTotalSuperficie;
import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CEMostrarDatos;
import pe.unjfsc.daw.spring5.logical.CIEvaluarSuperficie;
import pe.unjfsc.daw.spring5.utility.CUConvert;


public class CMEvaluarArea implements CIEvaluarSuperficie{
    private static final Logger LOG = LoggerFactory.getLogger("CMEvaluarArea");
    private CEAreaSuperficieLateral oCELsa, oCELsaRpta;
    private CEAreaTotalSuperficie oCETsa, oCETsaRpta;
    private CEMostrarDatos oCEMostrarDatos;
    private CUConvert oCUConvert;
    
    @Override
    public CEAreaSuperficieLateral calcularLSA(CEAreaSuperficieLateral poLSA) {
        oCELsa = new CEAreaSuperficieLateral();
        double radio;
        
        LOG.info("CEAreaSuperficieLateral receiver : {}", poLSA);
        LOG.info("CEAreaSuperficieLateral instanciando : {}", oCELsa);
        
        radio = poLSA.getLsa() / (CEConstant.DOS * CEConstant.PI * poLSA.getAltura());
        LOG.info("Valor del radio : {}", radio);
        
        oCELsa.setLsa(poLSA.getLsa());
        oCELsa.setRadio(radio);
        oCELsa.setAltura(poLSA.getAltura());
        oCELsa.setDiametro(calcularDiametro(radio));
        
        String letra= convertirNumeroLetra(radio);
        oCELsa.setRadioLetra(letra);
        
        letra = convertirNumeroLetra(calcularDiametro(radio));
        oCELsa.setDiametroLetra(letra);
        LOG.info("CEAreaSuperficieLateral new data : {}", oCELsa);
        return oCELsa;
    }

    @Override
    public CEAreaTotalSuperficie calcularTSA(CEAreaTotalSuperficie poTSA) {
        oCETsa = new CEAreaTotalSuperficie();
        double dAreaTotalSuperficie = poTSA.getoCELsa().getLsa() + CEConstant.DOS * CEConstant.PI * Math.pow(poTSA.getoCELsa().getRadio(), CEConstant.DOS);
     
        LOG.info("CEAreaTotalSuperficie receiver : {}", poTSA);
        LOG.info("CEAreaTotalSuperficie instanciando : {}", oCETsa);
        LOG.info("Area Total Superficie : {}", dAreaTotalSuperficie);
        
        oCETsa = poTSA;
        oCETsa.setTsa(dAreaTotalSuperficie);
        oCETsa.setAte(calcularAreaTrianguloEquilatero(poTSA.getoCELsa().getRadio()));
        return oCETsa;
    }


    @Override
    public CEMostrarDatos procesarData(CEMostrarDatos poData) {
        oCEMostrarDatos = new CEMostrarDatos();
        oCELsaRpta = new CEAreaSuperficieLateral();
        oCETsa = new CEAreaTotalSuperficie();
        oCETsaRpta = new CEAreaTotalSuperficie();
        oCUConvert = new CUConvert();
        
        oCELsaRpta = calcularLSA(poData.getoCETsa().getoCELsa());
        oCETsa.setoCELsa(oCELsaRpta);
        
        oCETsaRpta = calcularTSA(oCETsa);
        
        oCEMostrarDatos.setoCELsa(oCELsaRpta);
        oCEMostrarDatos.setoCETsa(oCETsaRpta);
        oCEMostrarDatos.setValorPI(CEConstant.PI);

        String sNumero = String.valueOf(oCETsaRpta.getAte());
        LOG.info(" Numero Utility : {}", sNumero);
        oCEMostrarDatos.setRotarIzquiedaDerecha(oCUConvert.rotarIzquierdaDerecha(sNumero));
        oCEMostrarDatos.setPrimerUltimoCaracter(oCUConvert.rotarIzquierdaDerecha(sNumero));

        return oCEMostrarDatos;
    }

    protected double calcularDiametro(double pdRadio){
        return CEConstant.DOS * pdRadio;
    }
    
    protected String convertirNumeroLetra(double pdNumero){
        String numeroLetra="";
        //Convirtiendo un double en entero
        int result = (int) pdNumero;
        
        switch(result){
            case 5:
                numeroLetra = "Cinco";
                break;
            case 10:
                numeroLetra = "DIEz";
                break;
        }
        return numeroLetra;
    }
    
    protected double calcularAreaTrianguloEquilatero(double pdLado){
        return (Math.sqrt(CEConstant.TRES)*Math.pow(pdLado, CEConstant.DOS))/CEConstant.CUATRO;
    }
}
