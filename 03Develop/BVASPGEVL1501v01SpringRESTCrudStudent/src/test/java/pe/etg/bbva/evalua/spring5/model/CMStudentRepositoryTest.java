package pe.etg.bbva.evalua.spring5.model;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.etg.bbva.evalua.spring5.entity.CEStudent;
import pe.etg.bbva.evalua.spring5.model.CMStudentRepository;

public class CMStudentRepositoryTest {
	private static final Logger MOLOG = LoggerFactory.getLogger(CMStudentRepositoryTest.class); 

	private Collection<CEStudent> moCollectionStudent;
	private Optional<CEStudent> moOptionalStudent;
	private CMStudentRepository moCRStudentRepository;
	private CEStudent moCEStudent, moCEStudentEsperado;
	private Map<Long, CEStudent> moMapStudent = new HashMap<>();
	
	@Before
	public void setUp() throws Exception {
		MOLOG.info("=====> Start method : setUp() <===== ");
		
		moCRStudentRepository = new CMStudentRepository();
		moCEStudent = new CEStudent();

		MOLOG.info("=> CEStudent() : {} ", moCEStudent);
		MOLOG.info("=> CMStudentRepository() : {} ", moCRStudentRepository);
		
		dataStudent();
		
		MOLOG.info("=> HashMap<>() : {} ", moMapStudent);
		
		MOLOG.info("=====> End method : setUp() <=====");
	}

	@Test
	/*
	 * a) Que la data grabada no sea Nulo
	 * b) Que el identificador como data se igual a lo esperado
	 */
	public void testSaveStudent() {
		MOLOG.info("=====> Start method : testSaveStudent() <===== ");
		
		moCEStudent = new CEStudent();
		moCEStudent.setId(101L);
		moCEStudent.setFirtName("Esteban");
		moCEStudent.setLastName("Díaz");
		moCEStudent.setYear("2002");
		
		moMapStudent.put(101L, moCRStudentRepository.save(moCEStudent));
		MOLOG.info("=> {}", moCEStudent);
		
		moCEStudentEsperado = new CEStudent();
		moCEStudentEsperado = moCRStudentRepository.save(moCEStudent);
		
		MOLOG.info(" => Data Esperada : {}", moCEStudent);
		MOLOG.info(" => Data Entrada  : {}", moCEStudentEsperado);
		
		assertNotNull(moCEStudentEsperado);
		assertEquals(moCEStudentEsperado, moCEStudent);
		
		MOLOG.info("=====> End method : testSaveStudent() <===== ");
	}

	@Test
	public void testUpdateStudent() {
		MOLOG.info("=====> Start method : testUpdateStudent() <===== ");
		
		moCEStudent = new CEStudent();
		moCEStudent.setId(102L);
		moCEStudent.setFirtName("Isabela");
		moCEStudent.setLastName("Díaz");
		moCEStudent.setYear("2018");
		
		moOptionalStudent = moCRStudentRepository.update(moCEStudent);
		
		MOLOG.info(" => Data Esperada : {}", moCEStudent);
		MOLOG.info(" => Data Entrada  : {}", moOptionalStudent);
		
		MOLOG.info("[Rest - Esperado] ====> {}", moOptionalStudent);
		assertNotNull(moOptionalStudent);
		assertEquals(moCEStudent, moOptionalStudent.get());
		
		MOLOG.info("=====> End method : testUpdateStudent() <===== ");
	}
	
	@Test
	public void testDeleteStudent() {
		MOLOG.info("=====> Start method : testDeleteStudent() <===== ");
		
		moOptionalStudent = moCRStudentRepository.delete(103L);

		MOLOG.info(" => Data Esperada : {}", 103L);
		MOLOG.info(" => Data Entrada  : {}", moOptionalStudent.get().getId());
		
		assertNotNull(moOptionalStudent);
		assertEquals(103L, moOptionalStudent.get().getId().longValue());
		
		MOLOG.info("=====> End method : testDeleteStudent() <===== ");
	}
	
	
	@Test 
	public void testCollectionStudent() {
		MOLOG.info("=====> Start method : testCollectionStudent() <===== ");
		
		moCollectionStudent  = moCRStudentRepository.findAll();
		
		MOLOG.info(" => Data Esperada : {}", 4L);
		MOLOG.info(" => Data Entrada  : {}", moCollectionStudent.size());

		assertNotNull(moCollectionStudent);
		assertEquals(4L, moCollectionStudent.size());
		
		MOLOG.info("=====> End method : testCollectionStudent() <===== ");
	}
	
	@Test
	public void testFindStudent() {
		MOLOG.info("=====> Start method : testFindStudent() <===== ");
		
		moOptionalStudent = moCRStudentRepository.findById(103L);
		
		MOLOG.info("=> Data Esperada : {}", 103L);
		MOLOG.info("=> Data Entrada  : {}", moOptionalStudent);

		assertEquals(103L, moOptionalStudent.get().getId().longValue());

		MOLOG.info("=====> End method : testFindStudent() <===== ");
	}
	public void  dataStudent(){
		MOLOG.info("=====> Start method : dataStudent() <===== ");
		
		moMapStudent = new HashMap<>();
		moCEStudent = new CEStudent();
		
		moCEStudent.setId(5L);
		moCEStudent.setFirtName("Esteban");
		moCEStudent.setLastName("Díaz");
		moCEStudent.setYear("2002");
		moMapStudent.put(100L, moCRStudentRepository.save(moCEStudent));

		moCEStudent = new CEStudent();
		moCEStudent.setId(22L);
		moCEStudent.setFirtName("Illari");
		moCEStudent.setLastName("Laskhmi");
		moCEStudent.setYear("2014");
		moMapStudent.put(105L, moCRStudentRepository.save(moCEStudent));
		
		moCEStudent = new CEStudent();
		
		moCEStudent.setId(30L);
		moCEStudent.setFirtName("Luis");
		moCEStudent.setLastName("Vega");
		moCEStudent.setYear("2017");
		moMapStudent.put(110L, moCRStudentRepository.save(moCEStudent));

		moCEStudent = new CEStudent();
		
		moCEStudent.setId(14L);
		moCEStudent.setFirtName("Isabella");
		moCEStudent.setLastName("Vega");
		moCEStudent.setYear("2018");
		moMapStudent.put(115L, moCRStudentRepository.save(moCEStudent));
		
		MOLOG.info("=====> End method : dataStudent() <===== ");
	}
}
