package ar.com.escuela.seg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.escuela.seg.bean.Usuario;
import ar.com.escuela.seg.repository.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> getAllUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		
		//usuarioRepository sería el DAO. El add agarra a cada usuario y la mete en la lista de usuarios.
		usuarioRepository.findAll().forEach(usuarios::add);
		
		return usuarios;
	}
	
	@Override
	public void addUsuario(Usuario usuario){
		usuarioRepository.save(usuario);
	}
	
	@Override
	public Usuario getUsuarioById(Long id) {
		return usuarioRepository.findOne(id);
	}

	@Override
	public void updateUsuario(Usuario usuario, Long id) {

		usuarioRepository.save(usuario);
	}

	@Override
	public void deleteUsuario(Long id) {
		
		usuarioRepository.delete(id);
	}
	
	
	
}
