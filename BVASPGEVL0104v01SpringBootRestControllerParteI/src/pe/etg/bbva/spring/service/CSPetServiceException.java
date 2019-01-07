package pe.etg.bbva.spring.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_GATEWAY)
public class CSPetServiceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CSPetServiceException() {

	}

	public CSPetServiceException(String message) {
		super(message);

	}

	public CSPetServiceException(Throwable ex) {
		super(ex);

	}

	public CSPetServiceException(String message, Throwable ex) {
		super(message, ex);
	}
}
