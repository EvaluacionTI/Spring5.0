package pe.etg.bbva.spring.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.etg.bbva.spring.entity.CENoteIdentity;

public interface CINoteRepository extends JpaRepository<CENoteIdentity, Long>{

}
