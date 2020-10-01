package pe.unjfsc.daw.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEAreaTotalSuperficie;
import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CEMostrarDatos;
import pe.unjfsc.daw.spring5.logical.CIEvaluarSuperficieOnlyInyection;
import pe.unjfsc.daw.spring5.utility.CUConvert;

public class CMEvaluarAreaOnlyInyection implements CIEvaluarSuperficieOnlyInyection{
	private static final Logger LOG = LoggerFactory.getLogger("CMEvaluarAreaOnlyInyection");

	private CEAreaSuperficieLateral oCELsaRequest;
	private CEAreaSuperficieLateral oCELsaResponse;
	private CEAreaTotalSuperficie oCETsaRequest;
	private CEAreaTotalSuperficie oCETsaResponse;
	private CEMostrarDatos oCEMostrarDatos;
	private CUConvert oCUConvert;
	
	@Override
	public CEAreaSuperficieLateral calcularLSA(CEAreaSuperficieLateral poLSA) {
		double radio;
		
		LOG.info("[EVL] Receiver CEAreaSuperficieLateral : {}", poLSA);
		radio = (poLSA.getLsa() / (CEConstant.DOS * CEConstant.PI * poLSA.getAltura()));
		
		LOG.info("[EVL] radio obtenido : {}", radio);
		LOG.info("[EVL] Inyection set  CEAreaSuperficieLateral : {}", oCELsaResponse);
		
		oCELsaResponse.setLsa(poLSA.getLsa());
		oCELsaResponse.setAltura(poLSA.getAltura());
		oCELsaResponse.setRadio(radio);
		oCELsaResponse.setDiametro(calcularDiametro(radio));
		oCELsaResponse.setRadioLetra(convertiNumeroLetra(radio));
		oCELsaResponse.setDiametroLetra(convertiNumeroLetra(calcularDiametro(radio)));
		
		return oCELsaResponse;
	}

	@Override
	public CEAreaTotalSuperficie calcularTSA(CEAreaTotalSuperficie poTSA) {
		
		LOG.info("[EVL] Receiver CEAreaTotalSuperficie : {}", poTSA);
		double dAreaTSA = poTSA.getoCELsa().getLsa() + CEConstant.DOS * CEConstant.PI * Math.pow(poTSA.getoCELsa().getRadio(), CEConstant.DOS);
		LOG.info("[EVL] Area TSA : {}", dAreaTSA);
		LOG.info("[EVL] Inyection set  CEAreaTotalSuperficie : {}", oCETsaResponse);
		oCETsaResponse = poTSA;
		oCETsaResponse.setTsa(dAreaTSA);
		oCETsaResponse.setAte(calcularAreaTriangulo(poTSA.getoCELsa().getRadio()));
		
		return oCETsaResponse;
	}

	@Override
	public CEMostrarDatos procesarData(CEMostrarDatos poData) {
		oCELsaRequest = calcularLSA(poData.getoCELsa());
		oCETsaRequest.setoCELsa(oCELsaRequest);
		
		oCETsaResponse = calcularTSA(oCETsaRequest);
		
		oCEMostrarDatos.setoCELsa(oCELsaRequest);
		oCEMostrarDatos.setoCETsa(oCETsaResponse);
		oCEMostrarDatos.setValorPI(CEConstant.PI);
		
		String sNumero =  String.valueOf(oCETsaResponse.getAte());
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

	public void setoCELsaRequest(CEAreaSuperficieLateral oCELsaRequest) {
		this.oCELsaRequest = oCELsaRequest;
	}

	public void setoCELsaResponse(CEAreaSuperficieLateral oCELsaResponse) {
		this.oCELsaResponse = oCELsaResponse;
	}

	public void setoCETsaRequest(CEAreaTotalSuperficie oCETsaRequest) {
		this.oCETsaRequest = oCETsaRequest;
	}

	public void setoCETsaResponse(CEAreaTotalSuperficie oCETsaResponse) {
		this.oCETsaResponse = oCETsaResponse;
	}

	public void setoCEMostrarDatos(CEMostrarDatos oCEMostrarDatos) {
		this.oCEMostrarDatos = oCEMostrarDatos;
	}

	public void setoCUConvert(CUConvert oCUConvert) {
		this.oCUConvert = oCUConvert;
	}
}
