package pe.unjfsc.daw.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEConstantCovid19;
import pe.unjfsc.daw.spring5.entity.CEVirusCovid19;
import pe.unjfsc.daw.spring5.logical.CICovid19;

public class CMCovid19 implements CICovid19{
	private static final Logger LOG = LoggerFactory.getLogger("CMCovid19");
	
	private CEVirusCovid19 oVirus;
	
	@Override
	public CEVirusCovid19 proyectarCovid19() {
				
		LOG.info("[EVL] Instancia CEVirusCovid19 : {}", oVirus);
		
		oVirus.setDayProyectado(CEConstantCovid19.NACIMIENTO_DAY);
		int iResult = (int) (CEConstantCovid19.POBLACION*CEConstantCovid19.CONTAGIO);
		oVirus.setNumeroContagio(iResult);
		oVirus.setNumeroFallecido(CEConstantCovid19.FALLECIDO);
		oVirus.setNumeroNacidos(CEConstantCovid19.NACIMIENTO_DAY);
		
		return oVirus;
	}

	public void setoVirus(CEVirusCovid19 oVirus) {
		this.oVirus = oVirus;
	}
}
