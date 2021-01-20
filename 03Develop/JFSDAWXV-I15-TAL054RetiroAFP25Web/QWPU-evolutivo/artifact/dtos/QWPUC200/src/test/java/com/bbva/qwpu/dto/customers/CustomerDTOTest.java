package com.bbva.qwpu.dto.customers;

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
public class CustomerDTOTest {
    private static Logger MOLOG = LoggerFactory.getLogger(CustomerDTOTest.class);

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Long idOut;

    private CustomerDTO oCustomerDTO;

    public CustomerDTOTest(String piId, String psFirstName, String psLastName, String psEmail, Long pidOut) {

        MOLOG.info("Id", piId);
        this.id = piId;
        this.firstName = psFirstName;
        this.lastName = psLastName;
        this.email = psEmail;
        this.idOut = pidOut;
    }

    @Before
    public void initialize() {
        MOLOG.info("[APX] Start method : initialize()");

        oCustomerDTO = new CustomerDTO();
        MOLOG.info("[APX] Instancia generada : {} ", oCustomerDTO);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputData() {
        Object[][] aListData = new Object[][]{
                {"1", "XP", "XP", "XP", 10L},
                {"2", "HC", "HC", "HAREC", 20L},
                {"3", "TM", "TM", "TM", 30L},
                {"4", "BP", "BP", "BG", 40L},
                {"5", "BG", "BG", "BG", 50L}
        };
        return Arrays.asList(aListData);
    }

    @Test
    public void testCECustomerDTO() {
        MOLOG.info("[APX] Start method");

        oCustomerDTO.setId(this.id);
        oCustomerDTO.setFirstName(this.firstName);
        oCustomerDTO.setLastName(this.lastName);
        oCustomerDTO.setEmail(this.email);
        oCustomerDTO.setIdOut(this.idOut);

        MOLOG.info("[APX] Dato del oCustomerDTO: {}", oCustomerDTO);

        StringBuilder sExpected = new StringBuilder();
        sExpected.append("CustomerDTO [id=").append(id).append(", firstName=").append(firstName).append(", lastName=").append(lastName)
                .append(", email=").append(email).append(", idOut=").append(idOut).append("]");

        MOLOG.info("[APX] Dato Esperado : {}", sExpected);

        assertEquals(sExpected.toString(), oCustomerDTO.toString());
    }
}
