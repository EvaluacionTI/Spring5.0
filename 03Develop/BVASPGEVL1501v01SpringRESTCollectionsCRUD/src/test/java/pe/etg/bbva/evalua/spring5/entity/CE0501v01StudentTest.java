package pe.etg.bbva.evalua.spring5.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.etg.bbva.evalua.spring5.entity.CE0501v01Student;

@RunWith(Parameterized.class)
public class CE0501v01StudentTest {
	
	public static final Logger MOLOG = LoggerFactory.getLogger(CE0501v01StudentTest.class);
	private Long id;
	private String firtName;
	private String lastName;
	private String year;
	
	private CE0501v01Student moStudent;
	private CE0501v01Student moRptaStudent;
	
	public CE0501v01StudentTest(Long plId, String psFirstName, String psLastName, String psYear) {
		this.id = plId;
		this.firtName = psFirstName;
		this.lastName = psLastName;
		this.year = psYear;
	}
	
	@Before
	public void setUp() throws Exception {
		moStudent = new CE0501v01Student();
		moRptaStudent = new CE0501v01Student();
		
		MOLOG.info("[EVL] CEStudent : {}", moStudent);
		MOLOG.info("[EVL] CEStudent Rpta: {}", moStudent);
	}

	@Parameters
	public static Collection<Object[]> inputData() {
		return Arrays.asList(new Object[][] {
			{1L,"PC","PIC", "2010" },
			{2L,"GL","GLOMO PRIVADO", "2011" },
			{3L,"GM","GLOMO PÚBLICO", "2012" },
			{4L,"PH","FRONT APX", "2013"},
			{5L,"TM","ATM PÚBLICO", "2014"}
		});
	}	
	
	@Test
	public void testNotNullClass() {
	
		MOLOG.info(moStudent.toString());
		assertNotNull(moStudent);
	}
	
	@Test
	public void testObjectStudentDiferent() {
		MOLOG.info("[EVL] Esperado [" + moRptaStudent.toString());
		MOLOG.info("[EVL] Data     [" + moStudent.toString());
		assertNotEquals(moRptaStudent, moStudent);
	}
	
	@Test
	public void testStudentEqual() {
		moStudent = new CE0501v01Student();
		moRptaStudent = new CE0501v01Student();
		
		moStudent.setId(4L);
		moStudent.setFirtName("Illari");
		moStudent.setLastName("Laskhmi");
		moStudent.setYear("2014");
		
		moRptaStudent.setId(4L);
		moRptaStudent.setFirtName("Illari");
		moRptaStudent.setLastName("Laskhmi");
		moRptaStudent.setYear("2014");
		
		MOLOG.info("[EVL] Esperado [" + moRptaStudent.toString());
		MOLOG.info("[EVL] Dato     [" + moStudent.toString());
		assertEquals(moRptaStudent.getId(), moStudent.getId());
		assertEquals(moRptaStudent.getFirtName(), moStudent.getFirtName());
		assertEquals(moRptaStudent.getLastName(), moStudent.getLastName());
		assertEquals(moRptaStudent.getYear(), moStudent.getYear());
	}
	
	@Test
	public void testCEStudentToString() {
		String sExpectedResult;
		
		moRptaStudent.setId(this.id);
		moRptaStudent.setFirtName(this.firtName);
		moRptaStudent.setLastName(this.lastName);
		moRptaStudent.setYear(this.year);

		MOLOG.info("[EVL] CEStudent Data : {}", moRptaStudent );

		sExpectedResult = new StringBuilder()
				.append("CEStudent [id=").append(moRptaStudent.getId())
				.append(", firtName=").append(moRptaStudent.getFirtName())
				.append(", lastName=").append(moRptaStudent.getLastName())
				.append(", year=").append(moRptaStudent.getYear())
				.append("]").toString();
		MOLOG.info("[EVL] CEStudent Esperado : {}", sExpectedResult );		
		
		assertEquals(sExpectedResult, moRptaStudent.toString());
	}

}
