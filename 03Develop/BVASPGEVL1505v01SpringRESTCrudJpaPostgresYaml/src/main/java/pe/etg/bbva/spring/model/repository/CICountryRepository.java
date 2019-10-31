package pe.etg.bbva.spring.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.spring.entity.CECountry;

@Repository
public interface CICountryRepository extends CrudRepository<CECountry, Long>{

}
