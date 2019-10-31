package pe.etg.bbva.spring.batch.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import pe.etg.bbva.spring5.entity.CEReport;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CBReportMapper implements FieldSetMapper<CEReport> {

    private static final Logger MOLOG = LoggerFactory.getLogger(CBReportMapper.class);

    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public CEReport mapFieldSet(FieldSet fieldSet) throws BindException {
    	
        CEReport report = new CEReport();
        report.setId(fieldSet.readInt("ID"));
        report.setPrecio(fieldSet.readBigDecimal("PRECIO"));
        report.setCantidad(fieldSet.readInt("CANTIDAD"));
        report.setNombre(fieldSet.readString("NOMBRE"));

        String fecha = fieldSet.readString("FECHA");

        MOLOG.info("[EVL] Object FieldSet : {} ", fieldSet.toString());
        try {
            report.setFechaNacimiento(format.parse(fecha));
        } catch (ParseException e) {
        	MOLOG.error("[EVL] Error al Parsear la fecha {}", e.getMessage());
        }

        return report;
    }
}


