package pe.bbva.evalua.spring5.service;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.CDSaldoAfiliado;

@Component
public class CSSaldoAfiliado {
	private static final Logger LOG = LoggerFactory.getLogger("CDSaldoAfiliado");
	
	@Autowired
	private CDSaldoAfiliado oCDSaldo;

	@Transactional
	public void add(CESaldoAfiliadoCustom poSaldo) {
		LOG.info("[EVL] =====[ Start add ]=====");
		LOG.info("[EVL] Object CESaldoAfiliadoCustom : {}", poSaldo);
		LOG.info("[EVL] Instance CDSaldoAfiliado : {}", oCDSaldo);
		oCDSaldo.persist(poSaldo);
	}
	
	@Transactional
	public void addAll(Collection<CESaldoAfiliadoCustom> poListSaldo) {
		LOG.info("[EVL] =====[ Start addAll ]=====");
		
		LOG.info("[EVL] List Object CESaldoAfiliadoCustom : {}", poListSaldo);
		LOG.info("[EVL] Instance CDSaldoAfiliado : {}", oCDSaldo);
		for (CESaldoAfiliadoCustom item : poListSaldo) {
			oCDSaldo.persist(item);
		}
	}

	@Transactional(readOnly = true)
	public List<CESaldoAfiliadoCustom> listAll() {
		LOG.info("[EVL] =====[ Start listAll ]=====");
		
		LOG.info("[EVL] Object List  : {}", oCDSaldo);
		
		return oCDSaldo.findAll();
	}
}
