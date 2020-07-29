package pe.bbva.evalua.spring5.model.impl;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pe.bbva.evalua.spring5.entity.CE01TipoPlan;
import pe.bbva.evalua.spring5.model.CDTipoPlanDAO;

@Component
public class CDTipoPlanService {
	private static final Logger LOG = LoggerFactory.getLogger("CDTipoPlanService");
	
	@Autowired
	private CDTipoPlanDAO oCDTipoPlan;
	
	@Transactional
	public void add (CE01TipoPlan poTipoPlan) {
		LOG.info("[EVL] =====[ Start add ]=====");
		LOG.info("[EVL] Object CE01TipoPlan : {}", poTipoPlan);
		LOG.info("[EVL] Instance CDTipoPlanDAO : {}", oCDTipoPlan);
		oCDTipoPlan.persist(poTipoPlan);
	}
	
	@Transactional
	public void addAll(Collection<CE01TipoPlan> poListTipoPlan) {
		LOG.info("[EVL] =====[ Start addAll ]=====");
		
		LOG.info("[EVL] List Object CE01TipoPlan : {}", poListTipoPlan);
		LOG.info("[EVL] Instance CDTipoPlanDAO : {}", oCDTipoPlan);
		for(CE01TipoPlan item:poListTipoPlan) {
			oCDTipoPlan.persist(item);
		}
	}
	
	@Transactional(readOnly = true)
	public List<CE01TipoPlan> listAll() {
		LOG.info("[EVL] =====[ Start listAll ]=====");
		
		LOG.info("[EVL] Object List : {}", oCDTipoPlan);
		
		return oCDTipoPlan.findAll();
	}
}
