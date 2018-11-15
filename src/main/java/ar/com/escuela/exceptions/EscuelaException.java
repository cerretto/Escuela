package ar.com.escuela.exceptions;

import java.util.Arrays;
import java.util.List;

public class EscuelaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private EscuelaRestErrorCode code;
	
	private List<String> errors;
	
	EscuelaException() {}
	
	public EscuelaException(EscuelaRestErrorCode code, String error){
		super();
		this.code = code;
		this.errors = Arrays.asList(error);
	}
	
	public EscuelaException(EscuelaRestErrorCode code, List<String> errors){
		super();
		this.code = code;
		this.errors = errors;
	}

	public EscuelaRestErrorCode getCode() {
		return code;
	}

	public void setCode(EscuelaRestErrorCode code) {
		this.code = code;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	
	
		
	
}
