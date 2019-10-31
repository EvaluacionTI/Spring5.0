package pe.etg.bbva.spring.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.etg.bbva.spring.entity.CECustomerAuto;
import pe.etg.bbva.spring.model.repository.CICustomerRepository;

@Service
public class CDCustomer implements CICustomerRepository{
	@Autowired
	CICustomerRepository oRepository;
	
	@Override
	public <S extends CECustomerAuto> S save(S entity) {
		oRepository.save(entity);
		return null;
	}

	@Override
	public <S extends CECustomerAuto> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CECustomerAuto> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<CECustomerAuto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<CECustomerAuto> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
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
	public void delete(CECustomerAuto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends CECustomerAuto> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
