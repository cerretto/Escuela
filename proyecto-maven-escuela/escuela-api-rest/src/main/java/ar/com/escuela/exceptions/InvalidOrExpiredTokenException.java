package ar.com.escuela.exceptions;

public class InvalidOrExpiredTokenException extends EscuelaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidOrExpiredTokenException(EscuelaRestErrorCode code, String error){
		super();
	}

}
