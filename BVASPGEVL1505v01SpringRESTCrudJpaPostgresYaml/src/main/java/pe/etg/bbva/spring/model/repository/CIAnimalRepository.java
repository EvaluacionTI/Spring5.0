package pe.etg.bbva.spring.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.spring.entity.CEAnimal;

/*
 * @Repository es una anotación que marca la clase específica como un objeto de datos Access. 
 * Otros marcadores de la misma categoría son @Service y @Controller.
 * 
 * @Autowired es una anotación con un significado completamente diferente: básicamente le dice al contenedor de DI para inyectar una dependencia
 */
@Repository
public interface CIAnimalRepository extends JpaRepository<CEAnimal, Long>{

}
