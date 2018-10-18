package pe.bbva.spring.batch.mapper;

import pe.bbva.spring.batch.dto.Report;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReportMapper implements FieldSetMapper<Report> {

    private static final Logger log = LoggerFactory.getLogger(ReportMapper.class);

    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public Report mapFieldSet(FieldSet fieldSet) throws BindException {
        Report report = new Report();
        report.setId(fieldSet.readInt("ID"));
        report.setPrecio(fieldSet.readBigDecimal("PRECIO"));
        report.setCantidad(fieldSet.readInt("CANTIDAD"));
        report.setNombre(fieldSet.readString("NOMBRE"));

        String fecha = fieldSet.readString("FECHA");

        try {
            report.setFechaNacimiento(format.parse(fecha));
        } catch (ParseException e) {
            log.error("Error al Parsear la fecha {}", e.getMessage());
        }

        return report;
    }
}


