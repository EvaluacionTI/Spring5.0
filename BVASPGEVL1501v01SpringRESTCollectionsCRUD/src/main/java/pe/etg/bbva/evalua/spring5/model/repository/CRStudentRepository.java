package pe.etg.bbva.evalua.spring5.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.evalua.spring5.entity.CEStudent;

@Repository
public class CRStudentRepository {
	private static final Logger MOLOG = LoggerFactory.getLogger(CRStudentRepository.class);
	
	private Map<Long, CEStudent> oMapStudent = new HashMap<>();
	private Long currentId = (long) 100;

	// 3. Save a new Student
	public CEStudent save(CEStudent poCEStudent) {
		MOLOG.info("[EVL] Objeto CEStudent : {} ", poCEStudent.toString());
		
		poCEStudent.setId(++currentId);
		oMapStudent.put(poCEStudent.getId(), poCEStudent);
		
		MOLOG.info("[EVL] Objeto CEStudent : {} ", poCEStudent.toString());
		MOLOG.info("[EVL] Objeto Map<Long, CEStudent> : {} ", oMapStudent.size());
		
		return poCEStudent;
	}

	// 4. Update a Student
	public Optional<CEStudent> update(CEStudent poCEStudent){

		MOLOG.info(" {}", poCEStudent.toString());
		
		CEStudent currentStudent = oMapStudent.get(poCEStudent.getId());

		if (currentStudent != null) {
			oMapStudent.put(poCEStudent.getId(), poCEStudent);
			currentStudent = oMapStudent.get(poCEStudent.getId());
		}
		MOLOG.info("[EVL] Objeto CEStudent update : {} ", currentStudent);
		MOLOG.info("[EVL] Objeto Map<Long, CEStudent> : {} ", oMapStudent.size());
		
		return Optional.ofNullable(currentStudent);
	}

	// 5. Delete a Student
	public Optional<CEStudent> delete(Long pId){
		MOLOG.info("[EVL] Identificador current : {} ", pId);
		
		CEStudent currentStudent = oMapStudent.get(pId);
		MOLOG.info("[EVL] Objeto encontrado CEStudent : {} ", currentStudent.toString());
		MOLOG.info("[EVL] Cantidad antes de eliminar : {} ", oMapStudent.size());
		
		if (currentStudent != null) {
			oMapStudent.remove(pId);
		}
		MOLOG.info("[EVL] Cantidad antes de eliminar : {} ", oMapStudent.size());
		
		return Optional.ofNullable(currentStudent);
	}
	
	// 1. Return all collections
	public Collection<CEStudent> findAll(){
		
		MOLOG.info("[EVL] Cantidad Map<Long, CEStudent> : {} ", oMapStudent.size());
		
		return oMapStudent.values();
	}
	
	// 2. Find the student with this id
	public Optional<CEStudent> findById(Long pId){
		MOLOG.info("[EVL] Identificador current : {} ", pId);
		
		CEStudent oStudent = null;
		
		if (oMapStudent.containsKey(pId)) {
			oStudent = oMapStudent.get(pId);
		}
		MOLOG.info("[EVL] CEStudent : {} ", oStudent.toString());
		
		return Optional.ofNullable(oStudent);
	}
	

	

	
}
