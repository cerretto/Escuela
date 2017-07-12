package ar.com.escuela.pad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.pad.bean.Provincia;
import ar.com.escuela.pad.service.PadronService;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController {
	
	@Autowired
	private PadronService provinciaService;
	
	@RequestMapping("/")
	public List<Provincia> getAllProvincias(){
		return provinciaService.getAllProvincias();
	}
	
	@RequestMapping("/{id}")
	public Provincia getProvincia(@PathVariable Long id){
		return provinciaService.getProvinciaById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public void addProvincia(@RequestBody Provincia provincia){
		provinciaService.addProvincia(provincia);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateProvincia(@RequestBody Provincia provincia,@PathVariable Long id){
		provinciaService.updateProvincia(provincia, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteProvincia(@PathVariable Long id){
		provinciaService.deleteProvincia(id);
	}
}
