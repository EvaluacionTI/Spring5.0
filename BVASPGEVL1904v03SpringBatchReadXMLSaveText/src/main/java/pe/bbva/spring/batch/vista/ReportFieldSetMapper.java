package pe.bbva.spring.batch.vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.etg.bbva.evalua.spring5.entity.Report;





public class ReportFieldSetMapper implements FieldSetMapper<Report> {

	Report reportObjt;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		reportObjt = new Report();
		reportObjt.setId(fieldSet.readInt(0));
		reportObjt.setSales(fieldSet.readBigDecimal(1));
		reportObjt.setQty(fieldSet.readInt(2));
		reportObjt.setStaffName(fieldSet.readString(3));
		
		return null;
	}
	
/*	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		

		
		//default format yyyy-MM-dd
		//fieldSet.readDate(4);
		String date = fieldSet.readString(4);
		try {
			reportObjt.setDate(dateFormat.parse(date));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return report;
		
	}*/

}