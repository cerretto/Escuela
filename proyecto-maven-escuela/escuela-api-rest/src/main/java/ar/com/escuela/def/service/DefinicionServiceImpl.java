package ar.com.escuela.def.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.escuela.def.bean.Comision;
import ar.com.escuela.def.bean.Materia;
import ar.com.escuela.def.bean.Nivel;
import ar.com.escuela.def.repository.ComisionRepository;
import ar.com.escuela.def.repository.MateriaRepository;
import ar.com.escuela.def.repository.NivelRepository;

@Service
public class DefinicionServiceImpl implements DefinicionService{
	
	@Autowired
	private ComisionRepository comisionRepository;
	
	@Autowired
	private NivelRepository nivelRepository;
	
	@Autowired
	private MateriaRepository materiaRolRepository;
	
	//Servicios para Comision------------------------------------------------------------
	@Override
	public List<Comision> getAllComisiones(){
		List<Comision> comisiones = new ArrayList<>();
		
		//comisionRepository sería el DAO. El add agarra a cada comision y la mete en la lista de comisiones.
		comisionRepository.findAll().forEach(comisiones::add);
		
		return comisiones;
	}
	
	@Override
	public void addComision(Comision comision){
		comisionRepository.save(comision);
	}
	
	@Override
	public Comision getComisionById(Long id) {
		return comisionRepository.findOne(id);
	}

	@Override
	public void updateComision(Comision comision, Long id) {
		comisionRepository.save(comision);
	}

	@Override
	public void deleteComision(Long id) {
		comisionRepository.delete(id);
	}
	
	
	//Servicios para Nivel----------------------------------------------------------------------------
	@Override
	public List<Nivel> getAllNiveles(){
		List<Nivel> niveles = new ArrayList<>();
		
		//nivelRepository sería el DAO. El add agarra a cada nivel y la mete en la lista de niveles.
		nivelRepository.findAll().forEach(niveles::add);
		
		return niveles;
	}
	
	@Override
	public void addNivel(Nivel nivel){
		nivelRepository.save(nivel);
	}
	
	@Override
	public Nivel getNivelById(Long id) {
		return nivelRepository.findOne(id);
	}

	@Override
	public void updateNivel(Nivel nivel, Long id) {
		nivelRepository.save(nivel);
	}

	@Override
	public void deleteNivel(Long id) {
		nivelRepository.delete(id);
	}
	
	//Servicios para Materia--------------------------------------------------------------------------------
	@Override
	public List<Materia> getAllMaterias(){
		List<Materia> materias = new ArrayList<>();
		
		//materiaRolRepository sería el DAO. El add agarra a cada materia y la mete en la lista de materias.
		materiaRolRepository.findAll().forEach(materias::add);
		
		return materias;
	}
	
	@Override
	public void addMateria(Materia materia){
		materiaRolRepository.save(materia);
	}
	
	@Override
	public Materia getMateriaById(Long id) {
		return materiaRolRepository.findOne(id);
	}

	@Override
	public void updateMateria(Materia materia, Long id) {
		materiaRolRepository.save(materia);
	}

	@Override
	public void deleteMateria(Long id) {
		materiaRolRepository.delete(id);
	}
}
