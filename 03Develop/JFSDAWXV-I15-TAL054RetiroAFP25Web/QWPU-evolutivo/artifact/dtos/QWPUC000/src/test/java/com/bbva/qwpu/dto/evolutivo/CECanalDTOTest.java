package com.bbva.qwpu.dto.evolutivo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CECanalDTOTest {
    private static Logger MOLOG = LoggerFactory.getLogger(CECanalDTOTest.class);
    private int id;
    private String codigo;
    private String abreviatura;
    private String descripcion;
    private Boolean siNoActivo;
    private Date fechaRegistro;
    private CECanalDTO oCECanalDTO;

    public CECanalDTOTest(int piId, String psCodigo, String psAbreviatura, String psDescripcion, Boolean psSiNoActivo, String psFechaRegistro) throws ParseException {
        SimpleDateFormat oFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        this.id = piId;
        this.codigo = psCodigo;
        this.abreviatura = psAbreviatura;
        this.descripcion = psDescripcion;
        this.siNoActivo = psSiNoActivo;
        this.fechaRegistro = oFormatoFecha.parse(psFechaRegistro);	;
    }

    @Before
    public void initialize() {
        MOLOG.info("[APX] Start initialize()");

        oCECanalDTO = new CECanalDTO();
        MOLOG.info("[APX] Instancia generada : {} ", oCECanalDTO );
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputData() {
        return Arrays.asList(new Object[][] {
                {1, "XP","XP", "XP", true, "03/10/2018" },
                {2, "HC","HC", "HAREC", false, "02/10/2018" },
                {3, "TM","TM", "TM", true, "01/10/2018" },
                {4, "BP","BP", "BG", false, "28/09/2018" },
                {5, "BG","BG", "BG", true, "27/09/2018" }
        });
    }

    @Test
    public void testCECanalDTO() {
        MOLOG.info("[APX] Start method : testCECanalDTO()");

        oCECanalDTO.setId(this.id);
        oCECanalDTO.setCodigo(this.codigo);
        oCECanalDTO.setAbreviatura(this.abreviatura);
        oCECanalDTO.setDescripcion(this.descripcion);
        oCECanalDTO.setSiNoActivo(this.siNoActivo);
        oCECanalDTO.setFechaRegistro(this.fechaRegistro);

        MOLOG.info("[APX] Dato del oCECanalDTO : {}", oCECanalDTO );

        StringBuilder sExpected = new StringBuilder();
        sExpected.append("CECanalDTO [id=").append(id).append(", codigo=").append(codigo).append(", abreviatura=")
                .append(abreviatura).append(", descripcion=").append(descripcion).append(", siNoActivo=")
                .append(siNoActivo).append(", fechaRegistro=").append(fechaRegistro).append("]");

        MOLOG.info("[APX] Dato Esperado : {}", sExpected );

        assertEquals(oCECanalDTO.toString(), sExpected.toString());
    }
}
