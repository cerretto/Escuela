package ar.com.escuela.seg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.escuela.seg.bean.Rol;
import ar.com.escuela.seg.bean.Usuario;
import ar.com.escuela.seg.bean.UsuarioRol;
import ar.com.escuela.seg.repository.RolRepository;
import ar.com.escuela.seg.repository.UsuarioRepository;
import ar.com.escuela.seg.repository.UsuarioRolRepository;

public class SeguridadServiceImpl implements SeguridadService {

	@Autowired
	private RolRepository rolRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioRolRepository usuarioRolRepository;
	
	//Servicios para Rol
	@Override
	public List<Rol> getAllRoles(){
		List<Rol> rols = new ArrayList<>();
		
		//rolRepository sería el DAO. El add agarra a cada rol y la mete en la lista de rols.
		rolRepository.findAll().forEach(rols::add);
		
		return rols;
	}
	
	@Override
	public void addRol(Rol rol){
		rolRepository.save(rol);
	}
	
	@Override
	public Rol getRolById(Long id) {
		return rolRepository.findOne(id);
	}

	@Override
	public void updateRol(Rol rol, Long id) {

		rolRepository.save(rol);
	}

	@Override
	public void deleteRol(Long id) {
		
		rolRepository.delete(id);
	}
	
	//Servicios para Usuairio
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
	
	//Servicios para UsuarioRol
	@Override
	public List<UsuarioRol> getAllUsuariosRoles(){
		List<UsuarioRol> usuariosRoles = new ArrayList<>();
		
		//usuarioRolRepository sería el DAO. El add agarra a cada usuario y la mete en la lista de usuarios.
		usuarioRolRepository.findAll().forEach(usuariosRoles::add);
		
		return usuariosRoles;
	}
	
	@Override
	public void addUsuarioRol(UsuarioRol usuarioRol){
		usuarioRolRepository.save(usuarioRol);
	}
	
	@Override
	public UsuarioRol getUsuarioRolById(Long id) {
		return usuarioRolRepository.findOne(id);
	}

	@Override
	public void updateUsuarioRol(UsuarioRol usuarioRol, Long id) {
		usuarioRolRepository.save(usuarioRol);
	}

	@Override
	public void deleteUsuarioRol(Long id) {
		usuarioRolRepository.delete(id);
	}
	
}
