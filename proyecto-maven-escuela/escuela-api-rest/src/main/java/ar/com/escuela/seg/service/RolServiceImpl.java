package ar.com.escuela.seg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.escuela.seg.bean.Rol;
import ar.com.escuela.seg.repository.RolRepository;

public class RolServiceImpl implements RolService {

	@Autowired
	private RolRepository rolRepository;
	
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
	
	
	
}
