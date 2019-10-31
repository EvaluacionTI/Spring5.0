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

import pe.etg.bbva.evalua.spring5.entity.CEStudent;

@RunWith(Parameterized.class)
public class CEStudentTest {
	
	public static final Logger MOLOG = LoggerFactory.getLogger(CEStudentTest.class);
	private Long id;
	private String firtName;
	private String lastName;
	private String year;
	
	private CEStudent moStudent;
	private CEStudent moRptaStudent;
	
	public CEStudentTest(Long plId, String psFirstName, String psLastName, String psYear) {
		this.id = plId;
		this.firtName = psFirstName;
		this.lastName = psLastName;
		this.year = psYear;
	}
	
	@Before
	public void setUp() throws Exception {
		MOLOG.info("=====> Start method : setUp() <===== ");
		
		moStudent = new CEStudent();
		moRptaStudent = new CEStudent();
		
		MOLOG.info("=====> End method : setUp() <=====");
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
		MOLOG.info("=====> Start method : testNotNullClass() <===== ");
		
		MOLOG.info(moStudent.toString());
		assertNotNull(moStudent);
		
		MOLOG.info("=====> End method : testNotNullClass() <=====");
	}
	
	@Test
	public void testObjectStudentDiferent() {
		MOLOG.info("=====> Start method : testObjectStudentDiferent() <=====");
		MOLOG.info("====> Student Esperado [" + moRptaStudent.toString());
		MOLOG.info("====> Student dato [" + moStudent.toString());
		assertNotEquals(moRptaStudent, moStudent);
		MOLOG.info("=====> End method : testObjectStudentDiferent() <=====");
	}
	
	@Test
	public void testStudentEqual() {
		MOLOG.info("=====> Start method : testStudentEqual() <=====");
		
		moStudent = new CEStudent();
		moRptaStudent = new CEStudent();
		
		moStudent.setId(4L);
		moStudent.setFirtName("Illari");
		moStudent.setLastName("Laskhmi");
		moStudent.setYear("2014");
		
		moRptaStudent.setId(4L);
		moRptaStudent.setFirtName("Illari");
		moRptaStudent.setLastName("Laskhmi");
		moRptaStudent.setYear("2014");
		
		MOLOG.info("====> Student Esperado [" + moRptaStudent.toString());
		MOLOG.info("====> Student dato [" + moStudent.toString());
		assertEquals(moRptaStudent.getId(), moStudent.getId());
		assertEquals(moRptaStudent.getFirtName(), moStudent.getFirtName());
		assertEquals(moRptaStudent.getLastName(), moStudent.getLastName());
		assertEquals(moRptaStudent.getYear(), moStudent.getYear());
		MOLOG.info("=====> End method : testStudentEqual() <=====");
	}
	
	@Test
	public void testCEStudentToString() {
		MOLOG.info("=====> Start method : testCEStudentToString() <=====");
		
		String sExpectedResult;
		
		moRptaStudent.setId(this.id);
		moRptaStudent.setFirtName(this.firtName);
		moRptaStudent.setLastName(this.lastName);
		moRptaStudent.setYear(this.year);

		MOLOG.info("=> Dato del CEStudent : {}", moRptaStudent );

		sExpectedResult = new StringBuilder()
				.append("CEStudent [id=").append(moRptaStudent.getId())
				.append(", firtName=").append(moRptaStudent.getFirtName())
				.append(", lastName=").append(moRptaStudent.getLastName())
				.append(", year=").append(moRptaStudent.getYear())
				.append("]").toString();
		MOLOG.info("=> Dato Esperado : {}", sExpectedResult );		
		
		assertEquals(sExpectedResult, moRptaStudent.toString());
		
		MOLOG.info("=====> End method : testCEStudentToString() <=====");
	}

}
