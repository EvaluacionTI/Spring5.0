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
	private CEAreaSuperficieLateral oCELsa, oCELsaRequest;
	private CEAreaTotalSuperficie oCETsa, oCETsaRpta, oCETsaRequest;
	private CEMostrarDatos oCEMostrarDatos;
	private CUConvert oCUConvert;
	
	public CEAreaSuperficieLateral calcularLSA(CEAreaSuperficieLateral poLSA) {
		oCELsa = new CEAreaSuperficieLateral();
		double radio;
		
		LOG.info("[EVL] Receiver CEAreaSuperficieLateral : {}", poLSA);
		radio = (poLSA.getLsa() / (CEConstant.DOS * CEConstant.PI * poLSA.getAltura()));
		LOG.info("[EVL] radio obtenido : {}", radio);
		
		oCELsa.setLsa(poLSA.getLsa());
		oCELsa.setAltura(poLSA.getAltura());
		oCELsa.setRadio(radio);
		oCELsa.setDiametro(calcularDiametro(radio));
		oCELsa.setRadioLetra(convertiNumeroLetra(radio));
		oCELsa.setDiametroLetra(convertiNumeroLetra(calcularDiametro(radio)));
		
		return oCELsa;
	}

	public CEAreaTotalSuperficie calcularTSA(CEAreaTotalSuperficie poTSA) {
		oCETsa = new CEAreaTotalSuperficie();
		
		LOG.info("[EVL] Receiver CEAreaTotalSuperficie : {}", oCETsa);
		double dAreaTSA = poTSA.getoCELsa().getLsa() + CEConstant.DOS * CEConstant.PI * Math.pow(poTSA.getoCELsa().getRadio(), CEConstant.DOS);
		LOG.info("[EVL] Area TSA : {}", dAreaTSA);
		
		oCETsa = poTSA;
		oCETsa.setTsa(dAreaTSA);
		oCETsa.setAte(calcularAreaTriangulo(poTSA.getoCELsa().getRadio()));
		
		return oCETsa;
	}

	public CEMostrarDatos procesarData(CEMostrarDatos poData) {
		oCEMostrarDatos = new CEMostrarDatos();
		oCELsaRequest = new CEAreaSuperficieLateral();
		oCETsaRequest = new CEAreaTotalSuperficie();
		oCETsaRpta = new CEAreaTotalSuperficie();
		oCUConvert = new CUConvert();
		
		oCELsaRequest = calcularLSA(poData.getoCELsa());
		oCETsaRequest.setoCELsa(oCELsaRequest);
		
		oCETsaRpta = calcularTSA(oCETsaRequest);
		
		oCEMostrarDatos.setoCELsa(oCELsaRequest);
		oCEMostrarDatos.setoCETsa(oCETsaRpta);
		oCEMostrarDatos.setValorPI(CEConstant.PI);
		
		String sNumero =  String.valueOf(oCETsaRpta.getAte());
		LOG.info("[EVL] Numero a utility : {}", sNumero);
		oCEMostrarDatos.setRotarDerechaIzquierda(oCUConvert.rotarDerechaIzquierda(sNumero));
		oCEMostrarDatos.setPrimerUltimoCaracter(oCUConvert.extraerPrimerUltimaPosicion(sNumero));
		
		return oCEMostrarDatos;
	}

	protected double calcularDiametro(double pdRadio) {
		return CEConstant.DOS * pdRadio;
	}
	
	protected String convertiNumeroLetra(double pdNumero) {
		String numeroLetra="";
		
		int result = (int) pdNumero;
		switch (result) {
		case 5:
			numeroLetra = "Cinco";
			break;
		case 10:
			numeroLetra = "DIEz";
			break;
		}
		return numeroLetra;
	}
	
	protected double calcularAreaTriangulo(double pdLado) {
		double areaTsa;
		areaTsa = (Math.sqrt(CEConstant.TRES) * Math.pow(pdLado, CEConstant.DOS)) / CEConstant.CUATRO;
		return areaTsa;
	}
}
