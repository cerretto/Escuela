package ar.com.escuela.seg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.seg.bean.Rol;
import ar.com.escuela.seg.service.SeguridadService;

@RestController
@RequestMapping("/roles")
public class RolController {
	
	@Autowired
	private SeguridadService rolService;
	
	@RequestMapping("/")
	public List<Rol> getAllRoles(){
		return rolService.getAllRoles();
	}
	
	@RequestMapping("/{id}") // otra forma "/rol/{foo}" y poner @PathVariable("foo")
	public Rol getRol(@PathVariable Long id){
		return rolService.getRolById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/")
	public void addRol(@RequestBody Rol rol){
		rolService.addRol(rol);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateRol(@RequestBody Rol rol, @PathVariable Long id){
		rolService.updateRol(rol, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteRol(@PathVariable Long id){
		rolService.deleteRol(id);
	}
}