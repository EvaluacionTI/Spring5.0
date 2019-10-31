package pe.etg.bbva.spring.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.spring.entity.CEStudent;

@Repository
public class CMStudentRepository {
	private static final Logger MOLOG = LoggerFactory.getLogger(CMStudentRepository.class);
	
	private Map<Long, CEStudent> oMapStudent = new HashMap<>();
	private Long currentId = (long) 100;
	
	// 1. Return all collections
	public Collection<CEStudent> findAll(){
		MOLOG.info("=====> [CMStudentRepository] Start method : findAll() <===== ");
		
		MOLOG.info("=> Valores : {} ", oMapStudent.values());
		
		MOLOG.info("=====> [CMStudentRepository] End method : findAll() <===== ");
		
		return oMapStudent.values();
	}
	
	// 2. Find the student with this id
	public Optional<CEStudent> findById(Long pId){
		MOLOG.info("=====> [CMStudentRepository] Start method : findById(Long pId) <=====");
		
		CEStudent oStudent = null;
		
		if (oMapStudent.containsKey(pId)) {
			oStudent = oMapStudent.get(pId);
		}
		MOLOG.info("=> Studiant : {} ", oStudent);
		
		MOLOG.info("=====> [CMStudentRepository] End method : findById(Long pId) <=====");		
		return Optional.ofNullable(oStudent);
	}
	
	// 3. Save a new Student
	public CEStudent save(CEStudent poCEStudent) {
		MOLOG.info("=====> [CMStudentRepository]  Start method : save(CEStudent poCEStudent) <===== ");
		
		poCEStudent.setId(++currentId);
		oMapStudent.put(poCEStudent.getId(), poCEStudent);
		
		MOLOG.info("=> Objeto adicionado Map<Long, CEStudent> oMapStudent : {} ", oMapStudent);
		
		MOLOG.info("=====> [CMStudentRepository]  End method : save(CEStudent poCEStudent) <===== ");
		return poCEStudent;
	}
	
	// 4. Update a Student
	public Optional<CEStudent> update(CEStudent poCEStudent){
		MOLOG.info("=====> [CMStudentRepository] Start method : update(CEStudent poCEStudent) <===== ");
		
		CEStudent currentStudent = oMapStudent.get(poCEStudent.getId());
		
		MOLOG.info("=> Objeto encontrado CEStudent : {} ", oMapStudent);
		
		if (currentStudent != null) {
			oMapStudent.put(poCEStudent.getId(), poCEStudent);
			currentStudent = oMapStudent.get(poCEStudent.getId());
		}
		MOLOG.info("=> Objeto actualizado CEStudent : {} ", currentStudent);
		
		MOLOG.info("=====> [CMStudentRepository] End method : update(CEStudent poCEStudent) <===== ");
		return Optional.ofNullable(currentStudent);
	}

	// 5. Delete a Student
	public Optional<CEStudent> delete(Long pId){
		MOLOG.info("=====> [CMStudentRepository] Start method : delete(Long pId) <===== ");
		
		CEStudent currentStudent = oMapStudent.get(pId);
		MOLOG.info("=> Objeto encontrado CEStudent : {} ", currentStudent);
		
		if (currentStudent != null) {
			oMapStudent.remove(pId);
		}
		MOLOG.info("=> Objeto eliminado : {} ", oMapStudent);
		
		MOLOG.info("=====> [CMStudentRepository] End method : delete(Long pId) <===== ");
		return Optional.ofNullable(currentStudent);
	}
	
}
