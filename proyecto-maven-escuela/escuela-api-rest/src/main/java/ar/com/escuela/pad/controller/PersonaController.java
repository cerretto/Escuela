package ar.com.escuela.pad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.pad.bean.Persona;
import ar.com.escuela.pad.service.PadronService;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "*")
public class PersonaController {
	@Autowired
	private PadronService personaService;
	
	@RequestMapping("")
	private ResponseEntity<List<Persona>> getAllPersonas(){
		List<Persona> personas = personaService.getAllPersonas(); 
		return new ResponseEntity<List<Persona>>(personas,HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")	// otra forma "/novedad/{foo}" y poner @PathVariable("foo")
	public ResponseEntity<Persona> getPersona(@PathVariable Long id){
		Persona persona = personaService.getPersonaById(id);
		
		return new ResponseEntity<Persona>(persona,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addPersona(@RequestBody Persona persona){
		personaService.addPersona(persona);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Void> updatePersona(@RequestBody Persona persona, @PathVariable Long id){
		personaService.updatePersona(persona, id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<Void> deletePersona(@PathVariable Long id){
		personaService.deletePersona(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
