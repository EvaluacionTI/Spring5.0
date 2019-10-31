package pe.etg.bbva.spring.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import pe.etg.bbva.spring.utility.CUConversionFechas;

public class CV03RestaFechas {

	public static void main(String[] args) throws ParseException {
		CUConversionFechas oConversion = new CUConversionFechas();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fechaInicial=dateFormat.parse("09/10/2018");
		Date fechaFinal=dateFormat.parse("09/10/2018");
		
		
		int iNumeroDias = oConversion.numeroDias(fechaInicial, fechaFinal);
		System.out.println("Número de dias : "+iNumeroDias);

		iNumeroDias = oConversion.numeroDias("09/10/2018", "09/10/2018");
		System.out.println("Número de dias : "+iNumeroDias);
		
	}

}
