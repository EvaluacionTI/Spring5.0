package pe.etg.bbva.spring.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CV02DifereciaFechas {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		Date fechaInicial=dateFormat.parse("2018-10-09");
		Date fechaFinal=dateFormat.parse("2018-10-09");
		Date oFechaSistema;
		oFechaSistema = new Date();
		System.out.println(oFechaSistema);
		
		int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
 
		System.out.println("Hay "+dias+" dias de diferencia");
		
		dias=(int) ((oFechaSistema.getTime()-fechaInicial.getTime())/86400000);
		System.out.println("Hay "+dias+" dias de diferencia"); 
		
	}

}
