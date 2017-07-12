package ar.com.escuela.seg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.seg.bean.Usuario;
import ar.com.escuela.seg.service.SeguridadService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
		
	@Autowired
	private SeguridadService seguridadService;
	
	@RequestMapping("/")
	public List<Usuario> getAllUsuarios(){
		return seguridadService.getAllUsuarios();
	}
	
	@RequestMapping("/{id}")	// otra forma "/usuario/{foo}" y poner @PathVariable("foo")
	public Usuario getUsuario(@PathVariable Long id){
		return seguridadService.getUsuarioById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/")
	public void addUsuario(@RequestBody Usuario usuario){
		seguridadService.addUsuario(usuario);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateUsuario(@RequestBody Usuario usuario, @PathVariable Long id){
		seguridadService.updateUsuario(usuario, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteUsuario(@PathVariable Long id){
		seguridadService.deleteUsuario(id);
	}
}
