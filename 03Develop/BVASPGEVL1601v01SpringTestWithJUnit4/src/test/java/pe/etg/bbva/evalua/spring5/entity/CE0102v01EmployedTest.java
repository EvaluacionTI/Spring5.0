package pe.etg.bbva.evalua.spring5.entity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.etg.bbva.evalua.spring5.entity.CE0102v01Employed;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CE0102v01EmployedTest {
	private static Logger MOLOG = LoggerFactory.getLogger(CE0102v01EmployedTest.class);

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Integer age;
	private Double limitCredit;
	private Boolean siNoActivo;
	private Date fechaRegistro;
	private CE0102v01Employed oCERptaEmployed;

	public CE0102v01EmployedTest(String piId, String psFirstName, String psLastName, String psEmail, Integer piAge,
			Double pdLimitCredit, Boolean psSiNoActivo, String psFechaRegistro) throws ParseException {
		SimpleDateFormat oFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");

		this.id = piId;
		this.firstName = psFirstName;
		this.lastName = psLastName;
		this.email = psEmail;
		this.age = piAge;
		this.limitCredit = pdLimitCredit;
		this.siNoActivo = psSiNoActivo;
		this.fechaRegistro = oFormatoFecha.parse(psFechaRegistro);
		;
	}

	@Before
	public void initialize() {
		oCERptaEmployed = new CE0102v01Employed();
		MOLOG.info("[EVL] Instancia generada : {} ", oCERptaEmployed);
	}

	@Parameterized.Parameters
	public static Collection<Object[]> inputData() {
		Object[][] oaListData = new Object[][] { { "1", "XP", "XP", "XP", 10, 15000.0, true, "03/10/2018" },
				{ "2", "HC", "HC", "HAREC", 12, 10000.00, false, "02/10/2018" },
				{ "3", "TM", "TM", "TM", 14, 8000.00, true, "01/10/2018" },
				{ "4", "BP", "BP", "BG", 16, 6000.00, false, "28/09/2018" },
				{ "5", "BG", "BG", "BG", 18, 4000.00, true, "27/09/2018" } };

		return Arrays.asList(oaListData);
	}

	@Test
	public void testCEEmployed() {
		MOLOG.info("[EVL] Start method");

		oCERptaEmployed.setId(this.id);
		oCERptaEmployed.setFirstName(this.firstName);
		oCERptaEmployed.setLastName(this.lastName);
		oCERptaEmployed.setEmail(this.email);
		oCERptaEmployed.setAge(this.age);
		oCERptaEmployed.setLimitCredit(this.limitCredit);
		oCERptaEmployed.setSiNoActivo(this.siNoActivo);
		oCERptaEmployed.setFechaRegistro(this.fechaRegistro);

		MOLOG.info("[EVL] Dato del CEEmployed: {}", oCERptaEmployed);

		StringBuilder sExpected = new StringBuilder();
		sExpected.append("CE0102v01Employed [id=").append(id).append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", email=").append(email).append(", age=").append(age)
				.append(", limitCredit=").append(limitCredit).append(", siNoActivo=").append(siNoActivo)
				.append(", fechaRegistro=").append(fechaRegistro).append("]");

		MOLOG.info("[EVL] Dato Esperado : {}", sExpected);

		assertEquals(oCERptaEmployed.toString(), sExpected.toString());
	}
}
