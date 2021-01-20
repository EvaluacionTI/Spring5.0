package com.bbva.qwpu.dto.employed;

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
public class CEEmployedDTOTest {
    private static Logger MOLOG = LoggerFactory.getLogger(CEEmployedDTOTest.class);
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private Double limitCredit;
    private Boolean siNoActivo;
    private Date fechaRegistro;
    private CEEmployedDTO oCEEmployedDTO;

    public CEEmployedDTOTest(String piId, String psFirstName, String psLastName, String psEmail, Integer piAge, Double pdLimitCredit,
                             Boolean psSiNoActivo, String psFechaRegistro) throws ParseException {
        SimpleDateFormat oFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        this.id = piId;
        this.firstName = psFirstName;
        this.lastName = psLastName;
        this.email = psEmail;
        this.age = piAge;
        this.limitCredit = pdLimitCredit;
        this.siNoActivo = psSiNoActivo;
        this.fechaRegistro = oFormatoFecha.parse(psFechaRegistro);	;
    }

    @Before
    public void initialize() {
        MOLOG.info("[APX] Start method : initialize()");

        oCEEmployedDTO = new CEEmployedDTO();
        MOLOG.info("[APX] Instancia generada : {} ", oCEEmployedDTO );
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputData() {
        Object[][] aListData = new Object[][]{
                {"1", "XP","XP", "XP", 10,15000.0, true, "03/10/2018" },
                {"2", "HC","HC", "HAREC", 12, 10000.00, false, "02/10/2018" },
                {"3", "TM","TM", "TM", 14, 8000.00, true, "01/10/2018" },
                {"4", "BP","BP", "BG", 16, 6000.00, false, "28/09/2018" },
                {"5", "BG","BG", "BG", 18, 4000.00, true, "27/09/2018" }
        };
        return Arrays.asList(aListData);
    }
/*
 *
 */
    @Test
    public void testCEEmployedDTO() {
        MOLOG.info("[APX] Start method");

        oCEEmployedDTO.setId(this.id);
        oCEEmployedDTO.setFirstName(this.firstName);
        oCEEmployedDTO.setLastName(this.lastName);
        oCEEmployedDTO.setEmail(this.email);
        oCEEmployedDTO.setAge(this.age);
        oCEEmployedDTO.setLimitCredit(this.limitCredit);
        oCEEmployedDTO.setSiNoActivo(this.siNoActivo);
        oCEEmployedDTO.setFechaRegistro(this.fechaRegistro);

        MOLOG.info("[APX] Dato del ooCEEmployedDTO: {}", oCEEmployedDTO );

        StringBuilder sExpected = new StringBuilder();
        sExpected.append("CEEmployedDTO [id=").append(id).append(", firstName=").append(firstName).append(", lastName=").append(lastName)
                .append(", email=").append(email).append(", age=").append(age).append(", limitCredit=").append(limitCredit)
                .append(", siNoActivo=").append(siNoActivo).append(", fechaRegistro=").append(fechaRegistro).append("]");

        MOLOG.info("[APX] Dato Esperado : {}", sExpected );

        assertEquals(oCEEmployedDTO.toString(), sExpected.toString());
    }
}
