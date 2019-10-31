package pe.etg.bbva.evalua.spring5.model.repository;

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
import pe.etg.bbva.evalua.spring5.model.repository.CRStudentRepository;

public class CRStudentRepositoryTest {
	private static final Logger MOLOG = LoggerFactory.getLogger(CRStudentRepositoryTest.class); 

	private Collection<CEStudent> moCollectionStudent;
	private Optional<CEStudent> moOptionalStudent;
	private CRStudentRepository moCRStudentRepository;
	private CEStudent moCEStudent, moCEStudentEsperado;
	private Map<Long, CEStudent> moMapStudent = new HashMap<>();
	
	@Before
	public void setUp() throws Exception {
		moCRStudentRepository = new CRStudentRepository();
		moCEStudent = new CEStudent();

		MOLOG.info("[EVL]  CEStudent() : {} ", moCEStudent);
		MOLOG.info("[EVL]  CRStudentRepository() : {} ", moCRStudentRepository);
		
		dataStudent();
		
		MOLOG.info("[EVL]  HashMap<>() : {} ", moMapStudent);
		
	}

	@Test
	/*
	 * a) Que la data grabada no sea Nulo
	 * b) Que el identificador como data se igual a lo esperado
	 */
	public void testSaveStudent() {

		moCEStudent = new CEStudent();
		moCEStudent.setId(101L);
		moCEStudent.setFirtName("Esteban");
		moCEStudent.setLastName("Díaz");
		moCEStudent.setYear("2002");
		
		moMapStudent.put(101L, moCRStudentRepository.save(moCEStudent));
		MOLOG.info("[EVL]  {}", moCEStudent);
		
		moCEStudentEsperado = new CEStudent();
		moCEStudentEsperado = moCRStudentRepository.save(moCEStudent);
		
		MOLOG.info(" [EVL]  Data Esperada : {}", moCEStudent);
		MOLOG.info(" [EVL]  Data Entrada  : {}", moCEStudentEsperado);
		
		assertNotNull(moCEStudentEsperado);
		assertEquals(moCEStudentEsperado, moCEStudent);
		
	}

	@Test
	public void testUpdateStudent() {
		moCEStudent = new CEStudent();
		moCEStudent.setId(102L);
		moCEStudent.setFirtName("Isabela");
		moCEStudent.setLastName("Díaz");
		moCEStudent.setYear("2018");
		
		moOptionalStudent = moCRStudentRepository.update(moCEStudent);
		
		MOLOG.info(" [EVL]  Data Esperada : {}", moCEStudent);
		MOLOG.info(" [EVL]  Data Entrada  : {}", moOptionalStudent);
		
		MOLOG.info("[Rest - Esperado] ===[EVL]  {}", moOptionalStudent);
		assertNotNull(moOptionalStudent);
		assertEquals(moCEStudent, moOptionalStudent.get());
		
	}
	
	@Test
	public void testDeleteStudent() {
		moOptionalStudent = moCRStudentRepository.delete(103L);

		MOLOG.info(" [EVL]  Data Esperada : {}", 103L);
		MOLOG.info(" [EVL]  Data Entrada  : {}", moOptionalStudent.get().getId());
		
		assertNotNull(moOptionalStudent);
		assertEquals(103L, moOptionalStudent.get().getId().longValue());
		
	}
	
	
	@Test 
	public void testCollectionStudent() {
		moCollectionStudent  = moCRStudentRepository.findAll();
		
		MOLOG.info(" [EVL]  Data Esperada : {}", 4L);
		MOLOG.info(" [EVL]  Data Entrada  : {}", moCollectionStudent.size());

		assertNotNull(moCollectionStudent);
		assertEquals(4L, moCollectionStudent.size());
		
	}
	
	@Test
	public void testFindStudent() {
		
		moOptionalStudent = moCRStudentRepository.findById(103L);
		
		MOLOG.info("[EVL]  Data Esperada : {}", 103L);
		MOLOG.info("[EVL]  Data Entrada  : {}", moOptionalStudent);

		assertEquals(103L, moOptionalStudent.get().getId().longValue());

	}
	public void  dataStudent(){
		
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

	}
}
