package ar.com.escuela.exceptions;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

public class RestApiError {

	private HttpStatus status;
	
	private String message;
	
	private List<String> erros;
	
	public RestApiError(HttpStatus status, String message, List<String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.erros = errors;
	}
	
	public RestApiError(HttpStatus status, String message, String error) {
		super();
		this.status = status;
		this.message = message;
		this.erros = Arrays.asList(error);
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}
}
