package ar.com.escuela.security;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.seg.service.SeguridadService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private SeguridadService seguridadService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> login(@Valid @RequestBody Login login){
		
		String response = seguridadService.login(login.getUsername(), login.getPassword());
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
