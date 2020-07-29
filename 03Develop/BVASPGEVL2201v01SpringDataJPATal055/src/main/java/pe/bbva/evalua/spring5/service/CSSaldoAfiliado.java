package pe.bbva.evalua.spring5.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.CDSaldoAfiliado;

@Service
public class CSSaldoAfiliado {
	private static final Logger LOG = LoggerFactory.getLogger("CSSaldoAfiliado");

	@Autowired(required=true)
	private CDSaldoAfiliado<CESaldoAfiliadoCustom> oCRSaldo;

	@Transactional
	public boolean addSaldoAfiliado(CESaldoAfiliadoCustom poCESaldo) {
		LOG.info("[EVL] =====[ Start addSaldoAfiliado ]=====");
		LOG.info("[EVL] Object CESaldoAfiliadoCustom : {}", poCESaldo);
		LOG.info("[EVL] Instance CDSaldoAfiliado : {}", oCRSaldo);
		return oCRSaldo.save(poCESaldo) != null;
	}

	@Transactional
	public boolean updateSaldoAfiliado(CESaldoAfiliadoCustom poCESaldo) {
		LOG.info("[EVL] =====[ Start updateSaldoAfiliado ]=====");
		LOG.info("[EVL] Object CESaldoAfiliadoCustom : {}", poCESaldo);
		LOG.info("[EVL] Instance CDSaldoAfiliado : {}", oCRSaldo);
		return oCRSaldo.save(poCESaldo) != null;
	}

	@Transactional
	public void deleteSaldoAfiliado(Integer piId) {
		LOG.info("[EVL] =====[ Start deleteSaldoAfiliado ]=====");
		LOG.info("[EVL] Id : {}", piId);
		oCRSaldo.deleteById(piId);
		;
	}

	@Transactional
	public void addAllSaldoAfiliado(Collection<CESaldoAfiliadoCustom> poListSaldo) {
		LOG.info("[EVL] =====[ Start addAllSaldoAfiliado ]=====");

		LOG.info("[EVL] List Object CESaldoAfiliadoCustom : {}", poListSaldo);
		LOG.info("[EVL] Instance CDSaldoAfiliado : {}", oCRSaldo);
		oCRSaldo.saveAll(poListSaldo);
	}

	@Transactional(readOnly = true)
	public List<CESaldoAfiliadoCustom> getAllSaldoAfiliado() {
		LOG.info("[EVL] =====[ Start getAllSaldoAfiliado ]=====");

		LOG.info("[EVL] Object List  : {}", oCRSaldo);

		return (List<CESaldoAfiliadoCustom>) oCRSaldo.findAll();
	}

	@Transactional(readOnly = true)
	public Optional<CESaldoAfiliadoCustom> getByIdSaldoAfiliado(Integer piId) {
		LOG.info("[EVL] =====[ Start getByIdSaldoAfiliado ]=====");

		LOG.info("[EVL] Integer  : {}", piId);
		return oCRSaldo.findById(piId);
	}

	@Transactional(readOnly = true)
	public CESaldoAfiliadoCustom getByCodigoSaldoAfiliado(String psCodigo) {
		LOG.info("[EVL] =====[ Start getByCodigoSaldoAfiliado ]=====");

		LOG.info("[EVL] String  : {}", psCodigo);

		return oCRSaldo.findByCodigoAfiliado(psCodigo);
	}
}
