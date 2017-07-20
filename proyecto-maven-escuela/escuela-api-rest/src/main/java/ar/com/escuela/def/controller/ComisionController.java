package ar.com.escuela.def.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.def.bean.Comision;
import ar.com.escuela.def.service.DefinicionService;

@RestController
@RequestMapping("/comisiones")
public class ComisionController {
	
	@Autowired
	private DefinicionService comisionService;
	
	@RequestMapping("/")
	public List<Comision> getAllComisiones(){
		return comisionService.getAllComisiones();
	}
	
	@RequestMapping("/{id}")
	public Comision getComision(@PathVariable Long id){
		return comisionService.getComisionById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public void addComision(@RequestBody Comision comision){
		comisionService.addComision(comision);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateComision(@RequestBody Comision comision, @PathVariable Long id){
		comisionService.updateComision(comision, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	private void deleteComision(@PathVariable Long id){
		comisionService.deleteComision(id);
	}
}
