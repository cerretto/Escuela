package ar.com.escuela.seg.service;

import java.util.List;

import ar.com.escuela.seg.bean.Rol;
 


public interface RolService {

	public List<Rol> getAllRoles();
	public Rol getRolById(Long id);
	public void addRol(Rol rol);
	public void updateRol(Rol rol, Long id);
	public void deleteRol(Long id);
	
}
