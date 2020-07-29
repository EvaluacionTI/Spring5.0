package pe.bbva.evalua.spring5.model;


import org.springframework.data.repository.CrudRepository;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public interface CDSaldoAfiliado<P> extends CrudRepository<CESaldoAfiliadoCustom, Integer>{
	CESaldoAfiliadoCustom findByCodigoAfiliado(String psCodigo);
}
