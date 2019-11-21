package pe.etg.bbva.evalua.spring5.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.evalua.spring5.entity.CE0501v01Student;

@Repository
public class CR0501v01StudentRepository {
	private static final Logger MOLOG = LoggerFactory.getLogger(CR0501v01StudentRepository.class);
	
	private Map<Long, CE0501v01Student> oMapStudent = new HashMap<>();
	private Long currentId = (long) 100;
	
	// 1. Return all collections
	public Collection<CE0501v01Student> findAll(){
		MOLOG.info("=====> [CMStudentRepository] Start method : findAll() <===== ");
		
		MOLOG.info("=> Valores : {} ", oMapStudent.values());
		
		MOLOG.info("=====> [CMStudentRepository] End method : findAll() <===== ");
		
		return oMapStudent.values();
	}
	
	// 2. Find the student with this id
	public Optional<CE0501v01Student> findById(Long pId){
		MOLOG.info("=====> [CMStudentRepository] Start method : findById(Long pId) <=====");
		
		CE0501v01Student oStudent = null;
		
		if (oMapStudent.containsKey(pId)) {
			oStudent = oMapStudent.get(pId);
		}
		MOLOG.info("=> Studiant : {} ", oStudent);
		
		MOLOG.info("=====> [CMStudentRepository] End method : findById(Long pId) <=====");		
		return Optional.ofNullable(oStudent);
	}
	
	// 3. Save a new Student
	public CE0501v01Student save(CE0501v01Student poCEStudent) {
		MOLOG.info("=====> [CMStudentRepository]  Start method : save(CEStudent poCEStudent) <===== ");
		
		poCEStudent.setId(++currentId);
		oMapStudent.put(poCEStudent.getId(), poCEStudent);
		
		MOLOG.info("=> Objeto adicionado Map<Long, CEStudent> oMapStudent : {} ", oMapStudent);
		
		MOLOG.info("=====> [CMStudentRepository]  End method : save(CEStudent poCEStudent) <===== ");
		return poCEStudent;
	}
	
	// 4. Update a Student
	public Optional<CE0501v01Student> update(CE0501v01Student poCEStudent){
		MOLOG.info("=====> [CMStudentRepository] Start method : update(CEStudent poCEStudent) <===== ");
		
		CE0501v01Student currentStudent = oMapStudent.get(poCEStudent.getId());
		
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
	public Optional<CE0501v01Student> delete(Long pId){
		MOLOG.info("=====> [CMStudentRepository] Start method : delete(Long pId) <===== ");
		
		CE0501v01Student currentStudent = oMapStudent.get(pId);
		MOLOG.info("=> Objeto encontrado CEStudent : {} ", currentStudent);
		
		if (currentStudent != null) {
			oMapStudent.remove(pId);
		}
		MOLOG.info("=> Objeto eliminado : {} ", oMapStudent);
		
		MOLOG.info("=====> [CMStudentRepository] End method : delete(Long pId) <===== ");
		return Optional.ofNullable(currentStudent);
	}
}
