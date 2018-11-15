package ar.com.escuela.pad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.pad.bean.Localidad;
import ar.com.escuela.pad.service.PadronService;

@RestController
@RequestMapping("/localidades")
public class LocalidadController {
	
	@Autowired
	private PadronService localidadService;
	
	@RequestMapping("/")
	private List<Localidad> getAllLocalidades(){
		return localidadService.getAllLocalidades();
	}
	
	@RequestMapping("/{id}")
	private Localidad getLocalidadById(@PathVariable Long id){
		return localidadService.getLocalidadById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/")
	public void addLocalidad(@RequestBody Localidad localidad){
		localidadService.addLocalidad(localidad);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public void updateLocalidad(@RequestBody Localidad localidad, @PathVariable Long id){
		localidadService.updateLocalidad(localidad, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteLocalidad(@PathVariable Long id){
		localidadService.deleteLocalidad(id);
	}

}
