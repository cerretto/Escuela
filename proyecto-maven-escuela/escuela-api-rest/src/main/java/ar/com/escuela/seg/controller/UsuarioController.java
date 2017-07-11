package ar.com.escuela.seg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.seg.bean.Usuario;
import ar.com.escuela.seg.service.UsuarioService;

@RestController
public class UsuarioController {
		
		@Autowired
		private UsuarioService usuarioService;
		
		@RequestMapping("/usuarioes")
		public List<Usuario> getAllUsuarioes(){
			
			return usuarioService.getAllUsuarios();
		}
		
		@RequestMapping("/usuarioes/{id}")					// otra forma "/usuario/{foo}" y poner @PathVariable("foo")
		public Usuario getUsuario(@PathVariable Long id){
			
			return usuarioService.getUsuarioById(id);
		}
		
		@RequestMapping(method=RequestMethod.POST , value="/usuarioes")
		public void addUsuario(@RequestBody Usuario usuario){
			usuarioService.addUsuario(usuario);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/usuarioes/{id}")
		public void updateUsuario(@RequestBody Usuario usuario, @PathVariable Long id){
			usuarioService.updateUsuario(usuario, id);
			
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/usuarioes/{id}")
		public void deleteUsuario(@PathVariable Long id){
			usuarioService.deleteUsuario(id);
		}
		
	
}
