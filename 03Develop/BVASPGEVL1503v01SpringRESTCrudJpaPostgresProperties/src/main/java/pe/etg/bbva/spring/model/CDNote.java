package pe.etg.bbva.spring.model;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import pe.etg.bbva.spring.entity.CENoteIdentity;
import pe.etg.bbva.spring.model.repository.CINoteRepository;

@Service
public class CDNote implements CINoteRepository {
	private static final Logger MOLOG = LoggerFactory.getLogger(CDNote.class);
	
	@Autowired
	private CINoteRepository oNoteRepository;
	
	@Override
	public List<CENoteIdentity> findAll() {
		MOLOG.info("[EVL] =====> Stard method findAll() <=====");
		
		List<CENoteIdentity> oaListCountry = (List<CENoteIdentity>) oNoteRepository.findAll();
		
		MOLOG.debug("[EVL] => Lista : {} ", oaListCountry);

		MOLOG.info("[EVL] =====> End method findAll() <=====");
		return oaListCountry;
	}

	@Override
	public List<CENoteIdentity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CENoteIdentity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CENoteIdentity> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends CENoteIdentity> S saveAndFlush(S entity) {
		
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<CENoteIdentity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CENoteIdentity getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CENoteIdentity> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CENoteIdentity> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CENoteIdentity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CENoteIdentity> S save(S entity) {
		oNoteRepository.save(entity);
		return null;
	}

	@Override
	public Optional<CENoteIdentity> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CENoteIdentity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends CENoteIdentity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends CENoteIdentity> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CENoteIdentity> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CENoteIdentity> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends CENoteIdentity> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
