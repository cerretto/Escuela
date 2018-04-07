package ar.com.escuela.seg.controller;

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

import ar.com.escuela.seg.bean.Rol;
import ar.com.escuela.seg.service.SeguridadService;

@RestController
@RequestMapping("/roles")
@CrossOrigin(origins = "http://localhost:4200")
public class RolController {
	
	@Autowired
	private SeguridadService seguridadService;
	
	@RequestMapping("")
	public ResponseEntity<List<Rol>> getAllRoles(){
		List<Rol> roles = seguridadService.getAllRoles();
		return new ResponseEntity<List<Rol>>(roles,HttpStatus.OK);
	}
	
	@RequestMapping("/{id}") // otra forma "/rol/{foo}" y poner @PathVariable("foo")
	public ResponseEntity<Rol> getRol(@PathVariable Long id){
		Rol rol = seguridadService.getRolById(id);
		return new ResponseEntity<Rol>(rol,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addRol(@RequestBody Rol rol){
		seguridadService.addRol(rol);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Void> updateRol(@RequestBody Rol rol, @PathVariable Long id){
		seguridadService.updateRol(rol, id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<Void> deleteRol(@PathVariable Long id){
		seguridadService.deleteRol(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
