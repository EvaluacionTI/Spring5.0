package pe.etg.bbva.evalua.spring5.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_GATEWAY)
public class CS0201v01PetServiceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CS0201v01PetServiceException() {

	}

	public CS0201v01PetServiceException(String message) {
		super(message);

	}

	public CS0201v01PetServiceException(Throwable ex) {
		super(ex);

	}

	public CS0201v01PetServiceException(String message, Throwable ex) {
		super(message, ex);
	}
}
