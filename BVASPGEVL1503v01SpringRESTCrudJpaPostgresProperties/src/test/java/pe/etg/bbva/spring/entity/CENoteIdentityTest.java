package pe.etg.bbva.spring.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Parameterized.class)
@SpringBootTest
public class CENoteIdentityTest {
	public static final Logger MOLOG = LoggerFactory.getLogger(CENoteIdentityTest.class);
	
	private Long id;
	private String title;
	private String content;
	private String createAt;
	private String updateAt;
	private CENoteIdentity oCENote;
	
	public CENoteIdentityTest(Long piId, String psTitle, String psContent, String psCreateAt, String psUpdateAt) {
		this.id = piId;
		this.title = psTitle;
		this.content = psContent;
		this.createAt = psCreateAt;
		this.updateAt = psUpdateAt;
	}

	@Before
	public void setUp() throws Exception {
		MOLOG.info("=====> Start method : setUp() <===== ");
		
		oCENote = new CENoteIdentity();
		MOLOG.info("=> Object instanciado : {} ", oCENote.toString());
		
		MOLOG.info("=====> End method : setUp() <=====");
	}
	
	@Parameters
	public static Collection<Object[]> inputData() {
		return Arrays.asList(new Object[][] {
			{1L,"PC","PIC", "17/10/2018 10:30:30", "" },
			{2L,"GL","GLOMO PRIVADO", "18/10/2018 10:30:20", "9/10/2018 10:30:45"},
			{3L,"GM","GLOMO PÚBLICO", "19/10/2018 10:30:10", "" },
			{4L,"PH","FRONT APX", "20/10/2018 10:30:00", "22/10/2018 10:30:30"},
			{5L,"TM","ATM PÚBLICO", "21/10/2018 11:30:00", ""}
		});
	}	
	
	@Test
	public void testCENote() throws ParseException {
		MOLOG.info("=====> Start method : testNote() <=====");
		String sExpectedResult;
		
		oCENote.setId(this.id);
		oCENote.setTitle(this.title);
		oCENote.setContent(this.content);
		oCENote.setCreateAt(validaFecha(this.createAt));
		oCENote.setUpdateAt(validaFecha(this.updateAt));

		MOLOG.info("=> Dato entrada  : {}", oCENote );
		
		sExpectedResult = new StringBuilder()
				.append("CENote [id=").append(oCENote.getId())
				.append(", title=").append(oCENote.getTitle())
				.append(", content=").append(oCENote.getContent())
				.append(", createAt=").append(oCENote.getCreateAt())
				.append(", updateAt=").append(oCENote.getUpdateAt())
				.append("]").toString();
		MOLOG.info("=> Dato esperado : {}", sExpectedResult );	
		
		assertNotNull(oCENote);
		assertEquals(sExpectedResult, oCENote.toString());
		
		MOLOG.info("=====> End method : testNote() <=====");
	}

	private Date validaFecha(String psFecha) throws ParseException {
		
		SimpleDateFormat oDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		if (psFecha.equals("")) {
			return null;
		}else {
			Date oFechaInicial=oDateFormat.parse(psFecha);
			return oFechaInicial;
		}
	}
}
