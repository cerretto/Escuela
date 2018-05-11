package ar.com.escuela.seg.service;

import java.util.List;

import ar.com.escuela.seg.bean.Rol;
import ar.com.escuela.seg.bean.Usuario;
import ar.com.escuela.seg.bean.UsuarioRol;
 
public interface SeguridadService {
	
	//Rol
	public List<Rol> getAllRoles();
	public Rol getRolById(Long id);
	public void addRol(Rol rol);
	public void updateRol(Rol rol, Long id);
	public void deleteRol(Long id);
	
	//UsuarioRol
	public List<UsuarioRol> getAllUsuariosRoles();
	public UsuarioRol getUsuarioRolById(Long id);
	public void addUsuarioRol(UsuarioRol usuarioRol);
	public void updateUsuarioRol(UsuarioRol usuarioRol, Long id);
	public void deleteUsuarioRol(Long id);
	
	//Usuario
	public List<Usuario> getAllUsuarios();
	public Usuario getUsuarioById(Long id);
	public void addUsuario(Usuario usuario);
	public void updateUsuario(Usuario usuario, Long id);
	public void deleteUsuario(Long id);
	public Usuario getUsuarioByUserName(String userName);
	
}
