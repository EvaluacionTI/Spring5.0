package pe.etg.bbva.spring.view;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.etg.bbva.spring.entity.CECanal;
import pe.etg.bbva.spring.model.CICanal;

@Component
public class CDCanalClient {
	private static final Logger MOLOG = LoggerFactory.getLogger(CDCanalClient.class);
	
	@Autowired
	CICanal<CECanal> moCICanal;
	
	public void process() {
		List<CECanal> oListCanal = moCICanal.loadAllCanal();
		MOLOG.info("=====> loadAllCanal {} ", oListCanal );

		Date oFechaSistema = new Date();
		CECanal oCECanal = new CECanal().createCanal("BG", "12", "ES", "PRUE", "PRUEBA", "1", "0", "0", "0", "0", "1", "XP94626", oFechaSistema);
		moCICanal.saveCanal(oCECanal);
		MOLOG.info("=====> saveCanal {} ", oCECanal );
		
		oFechaSistema = new Date();
		oCECanal = new CECanal().createCanal("GG", "12", "ES", "PRUE", "PRUEBA", "1", "0", "0", "0", "0", "1", "XP94626", oFechaSistema);
		moCICanal.saveCanal(oCECanal);
		MOLOG.info("=====> saveCanal {} ", oCECanal );
		
		List<CECanal> oListCanal2 = moCICanal.loadAllCanal();
		MOLOG.info("=====> loadAllCanal {} ", oListCanal2 );
	}
}
