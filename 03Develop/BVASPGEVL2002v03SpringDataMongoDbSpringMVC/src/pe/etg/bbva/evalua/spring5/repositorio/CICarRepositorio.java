package pe.etg.bbva.evalua.spring5.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.evalua.spring5.entidad.CECar;

@Repository
public interface CICarRepositorio extends MongoRepository<CECar, String>{
	@Query("{'model':?0}")
	CECar findByModel(String model);
	
	@Query(value="{'brand':?0}")
	List<CECar> findByBrand(String brand);
}
