package ar.com.escuela.exceptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { EscuelaException.class })
	protected ResponseEntity<Object> handleConflict(EscuelaException ex, WebRequest request) {

		String code = ex.getCode().toString();
		List<String> errors = new ArrayList<String>();
		ex.getErrors().stream().forEach(x -> errors.add(x));
		HttpStatus status = HttpStatus.CONFLICT;

		RestApiError restError = new RestApiError(status, code, errors);

		return new ResponseEntity<Object>(restError, new HttpHeaders(), status);
	}

	@ExceptionHandler(AccessDeniedException.class)
	public ResponseEntity<Object> handleAccessDeniedException(AccessDeniedException ex, HttpServletResponse res)
			throws IOException {

		String code = EscuelaRestErrorCode.ACCESS_DENIED.toString();
		HttpStatus status = HttpStatus.FORBIDDEN;

		RestApiError restError = new RestApiError(status, code, ex.getLocalizedMessage());

		return new ResponseEntity<Object>(restError, new HttpHeaders(), status);
	}

	@ExceptionHandler(InvalidOrExpiredTokenException.class)
	public ResponseEntity<Object> handleInvalidOrExpiredTokenException(InvalidOrExpiredTokenException ex,
			HttpServletResponse res) throws IOException {

		String code = ex.getCode().toString();
		List<String> errors = new ArrayList<String>();
		ex.getErrors().stream().forEach(x -> errors.add(x));
		HttpStatus status = HttpStatus.FORBIDDEN;

		RestApiError restError = new RestApiError(status, code, errors);

		return new ResponseEntity<Object>(restError, new HttpHeaders(), status);
	}
	
	@ExceptionHandler(InvalidUserNameOrPasswordException.class)
	public ResponseEntity<Object> InvalidUserNameOrPasswordException(InvalidUserNameOrPasswordException ex,
			HttpServletResponse res) throws IOException {

		String code = ex.getCode().toString();
		List<String> errors = new ArrayList<String>();
		ex.getErrors().stream().forEach(x -> errors.add(x));
		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;

		RestApiError restError = new RestApiError(status, code, errors);

		return new ResponseEntity<Object>(restError, new HttpHeaders(), status);
	}

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleAll(Exception ex, WebRequest request) {

		String code = EscuelaRestErrorCode.GENERIC_ERROR.toString();
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

		RestApiError restError = new RestApiError(status, code, ex.getLocalizedMessage());

		return new ResponseEntity<Object>(restError, new HttpHeaders(), status);
	}

}
