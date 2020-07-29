package pe.bbva.evalua.spring5.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pe.bbva.evalua.spring5.entity.CE01TipoPlan;

@Component
public class CDTipoPlanDAO {
	private static final Logger LOG = LoggerFactory.getLogger("CDTipoPlanDAO");
	
	@PersistenceContext
	private EntityManager moEm;
	
	public void persist(CE01TipoPlan poCETipoPlan) {
		LOG.info("[EVL] =====[ Start persist ]=====");
		LOG.info("[EVL] Object CE01TipoPlan : {}", poCETipoPlan);
		LOG.info("[EVL] Intance EntityManager : {}", moEm);
		moEm.persist(poCETipoPlan);
	}
	
	public List<CE01TipoPlan> findAll(){
		LOG.info("[EVL] =====[ Start findAll ]=====");
		LOG.info("[EVL] Query  SQL_JPA_SELECT_ALL : {}", CD01ConstanteSQL.SQL_JPA_SELECT_ALL);
		LOG.info("[EVL] Intance EntityManager : {}", moEm);
		return moEm.createQuery(CD01ConstanteSQL.SQL_JPA_SELECT_ALL).getResultList();
	}
}
