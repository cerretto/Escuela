package ar.com.escuela.seg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.seg.bean.UsuarioRol;
import ar.com.escuela.seg.service.SeguridadService;

@RestController
@RequestMapping("/usuariosroles")
public class UsuarioRolController {
	
	@Autowired SeguridadService seguridadService;
	
	@RequestMapping("/")
	public List<UsuarioRol> getAllUsuariosRoles(){
		return seguridadService.getAllUsuariosRoles();
	}
	
	@RequestMapping("/{id}") 
	public UsuarioRol getUsuarioRol(@PathVariable Long id){
		return seguridadService.getUsuarioRolById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/")
	public void addUsuarioRol(@RequestBody UsuarioRol usuarioRol){
		seguridadService.addUsuarioRol(usuarioRol);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateUsuarioRol(@RequestBody UsuarioRol usuarioRol, @PathVariable Long id){
		seguridadService.updateUsuarioRol(usuarioRol, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteUsuarioRol(@PathVariable Long id){
		seguridadService.deleteUsuarioRol(id);
	}
}
