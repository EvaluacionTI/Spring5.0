package pe.etg.bbva.evalua.spring5.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.evalua.spring5.entidad.CEUsuario;

@Repository
public interface CIUsuarioRepositorio extends MongoRepository<CEUsuario, String>{

}
