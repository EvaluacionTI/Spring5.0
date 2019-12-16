package pe.etg.bbva.spring5.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CUConversionFecha {

	public int calcularAge(String birthdate) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		java.util.Date fechaHoy = new Date();
		Date fechaInicial=dateFormat.parse(birthdate);
		
 
		int dias=(int) fechaHoy.getYear() -fechaInicial.getYear();
		return dias;
	}

	public java.sql.Date convertirUtilDateASqlDate(java.util.Date pdFechaUtil) {
		if ( pdFechaUtil.equals(null)) {
			return null;
		}
	    java.sql.Date ldFechaSql = new java.sql.Date(pdFechaUtil.getTime());
	    return ldFechaSql;
	}

	public java.sql.Timestamp convertirUtilTimeStampASqlDate(java.util.Date pdFechaUtil) {
		if ( pdFechaUtil == null) {
			return null;
		}		
	    java.sql.Timestamp ldFechaSql = new java.sql.Timestamp(pdFechaUtil.getTime());
	    return ldFechaSql;
	}
	
	public java.util.Date convertirSqlDateAUtilDate(java.sql.Date pdFechaSql) {
		if ( pdFechaSql == null) {
			return null;
		}		
	    java.util.Date ldFechaUtil = new java.util.Date(pdFechaSql.getTime());
	    return ldFechaUtil;
	}		
}
