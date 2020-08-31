package pe.bbva.evalua.spring5.model.impl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import pe.bbva.evalua.spring5.entity.CEUsuario;
import pe.bbva.evalua.spring5.model.CIUsuario;

@Service
public class CMUsuario implements CIUsuario {
	public static final Logger LOG = LoggerFactory.getLogger("CMUsuario");



	@Cacheable("fecha")
	public LocalDateTime fechaActual() {

		return LocalDateTime.now();

	}



	public List<CEUsuario> getUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}
}
