package ar.com.escuela.exceptions;

public class InvalidUserNameOrPasswordException extends EscuelaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidUserNameOrPasswordException(EscuelaRestErrorCode code, String error){
		super(code, error);
	}

}
