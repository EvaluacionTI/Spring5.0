package etg.bbva.evalua.spring.vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CVFechaConDate {
	static SimpleDateFormat oDateFormat;
	
	public static void main(String[] args) throws ParseException {
		Date fecha = new Date();
		 System.out.println(fecha);

		 System.out.println(fechaSistema("24/10/2018 10:30:00"));
	}

	private static Date fechaSistema(String psFecha) throws ParseException {
		oDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Date oFechaInicial=oDateFormat.parse(psFecha);
		return oFechaInicial;
	}
}
