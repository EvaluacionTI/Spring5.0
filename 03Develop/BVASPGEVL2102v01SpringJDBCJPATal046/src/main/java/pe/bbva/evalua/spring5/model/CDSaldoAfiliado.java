package pe.bbva.evalua.spring5.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

@Component
public class CDSaldoAfiliado {
	private static final Logger LOG = LoggerFactory.getLogger("CDSaldoAfiliado");
	
	@PersistenceContext
	private EntityManager moEm;
	
	public void persist(CESaldoAfiliadoCustom poCESaldoAfiliado) {
		LOG.info("[EVL] =====[ Start persist ]=====");
		LOG.info("[EVL] Object CESaldoAfiliadoCustom : {}", poCESaldoAfiliado);
		LOG.info("[EVL] Intance EntityManager : {}", moEm);
		moEm.persist(poCESaldoAfiliado);
	}
	
	public List<CESaldoAfiliadoCustom> findAll(){
		LOG.info("[EVL] =====[ Start findAll ]=====");
		LOG.info("[EVL] Query  SQL_JPA_SELECT_ALL : {}", CEConstant.HSQL_JPA_SELECT_ALL);
		LOG.info("[EVL] Intance EntityManager : {}", moEm);
		return moEm.createQuery(CEConstant.HSQL_JPA_SELECT_ALL).getResultList();
	}
}
