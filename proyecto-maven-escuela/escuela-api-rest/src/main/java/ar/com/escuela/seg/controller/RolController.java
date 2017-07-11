package ar.com.escuela.seg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.seg.bean.Rol;
import ar.com.escuela.seg.service.RolService;


@RestController
public class RolController {
	
	@Autowired
	private RolService rolService;
	
	@RequestMapping("/roles")
	public List<Rol> getAllRoles(){
		
		return rolService.getAllRoles();
	}
	
	@RequestMapping("/roles/{id}")					// otra forma "/rol/{foo}" y poner @PathVariable("foo")
	public Rol getRol(@PathVariable Long id){
		
		return rolService.getRolById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/roles")
	public void addRol(@RequestBody Rol rol){
		rolService.addRol(rol);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/roles/{id}")
	public void updateRol(@RequestBody Rol rol, @PathVariable Long id){
		rolService.updateRol(rol, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/roles/{id}")
	public void deleteRol(@PathVariable Long id){
		rolService.deleteRol(id);
	}
	

}
