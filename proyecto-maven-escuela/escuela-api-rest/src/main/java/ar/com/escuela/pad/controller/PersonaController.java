package ar.com.escuela.pad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.escuela.pad.bean.Persona;
import ar.com.escuela.pad.service.PadronService;

public class PersonaController {
	@Autowired
	private PadronService personaService;
	
	@RequestMapping("/")
	private List<Persona> getAllPersonas(){
		return personaService.getAllPersonas();
	}
	
	@RequestMapping("/{id}")
	private Persona getPersonaById(@PathVariable Long id){
		return personaService.getPersonaById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/")
	public void addPersona(@RequestBody Persona persona){
		personaService.addPersona(persona);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public void updatePersona(@RequestBody Persona persona, @PathVariable Long id){
		personaService.updatePersona(persona, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deletePersona(@PathVariable Long id){
		personaService.deletePersona(id);
	}
}
