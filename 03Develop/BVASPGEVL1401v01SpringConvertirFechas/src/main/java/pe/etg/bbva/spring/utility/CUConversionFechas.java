package pe.etg.bbva.spring.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.etg.bbva.spring.entity.CEUnidadTiempo;

public class CUConversionFechas {
	private static Logger MOLOG = LoggerFactory.getLogger(CUConversionFechas.class);
	
	SimpleDateFormat oDateFormat;
	
	public int numeroDias(Date pdFechaInicial, Date pdFechaFinal) {
		MOLOG.info("=====> [SPG - CUConversionFechas] Start method : numeroDias(Date pdFechaInicial, Date pdFechaFinal) <===== ");
		oDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		int iNumeroDias = 0;
		
		MOLOG.info("=> Instancia de formato de fecha {}", oDateFormat);
		MOLOG.info("=> Fecha Final {}", pdFechaFinal.getTime());
		MOLOG.info("=> Fecha Inicial {}", pdFechaInicial.getTime());
		
		iNumeroDias = (int) ((pdFechaFinal.getTime()-pdFechaInicial.getTime())/CEUnidadTiempo.MILI_SEGUNDO);
		MOLOG.info("=====> [SPG - CUConversionFechas] End method : numeroDias(Date pdFechaInicial, Date pdFechaFinal) <=====");
		return iNumeroDias;
	}
	
	public int numeroDias(String psFechaInicial, String psFechaFinal) throws ParseException {
		MOLOG.info("=====> [SPG - CUConversionFechas] Start method : numeroDias(String psFechaInicial, String psFechaFinal) <===== ");
		oDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date oFechaInicial=oDateFormat.parse(psFechaInicial);
		Date oFechaFinal=oDateFormat.parse(psFechaFinal);
		MOLOG.info("=> Fecha Final {}", oFechaInicial);
		MOLOG.info("=> Fecha Inicial {}", oFechaFinal);
		
		int iNumeroDias = numeroDias(oFechaInicial, oFechaFinal);
		MOLOG.info("=====> [SPG - CUConversionFechas] End method : numeroDias(String psFechaInicial, String psFechaFinal) <=====");
		return iNumeroDias;
	}
	
}
