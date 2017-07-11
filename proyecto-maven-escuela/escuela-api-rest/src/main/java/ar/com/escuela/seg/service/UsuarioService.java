package ar.com.escuela.seg.service;

import java.util.List;

import ar.com.escuela.seg.bean.Usuario;

public interface UsuarioService {

	public List<Usuario> getAllUsuarios();
	public Usuario getUsuarioById(Long id);
	public void addUsuario(Usuario usuario);
	public void updateUsuario(Usuario usuario, Long id);
	public void deleteUsuario(Long id);
	
}
