package pe.bbva.evalua.spring5.model.impl;

import java.time.LocalDateTime;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CSLoadFecha {
	public LocalDateTime fechaActualSinCache() { 
		return LocalDateTime.now();
	}
	
	@Cacheable("fechaCache")
	public LocalDateTime fechaActualConCache() { 
		return LocalDateTime.now();
	}
}
