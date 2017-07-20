package ar.com.escuela.def.service;

import java.util.List;

import ar.com.escuela.def.bean.Comision;
import ar.com.escuela.def.bean.Materia;
import ar.com.escuela.def.bean.Nivel;

public interface DefinicionService {
	
	//Comision
	public List<Comision> getAllComisiones();
	public Comision getComisionById(Long id);
	public void addComision(Comision comision);
	public void updateComision(Comision comision, Long id);
	public void deleteComision(Long id);
	
	//Materia
	public List<Materia> getAllMaterias();
	public Materia getMateriaById(Long id);
	public void addMateria(Materia materia);
	public void updateMateria(Materia materia, Long id);
	public void deleteMateria(Long id);
	
	//Comision
	public List<Nivel> getAllNiveles();
	public Nivel getNivelById(Long id);
	public void addNivel(Nivel nivel);
	public void updateNivel(Nivel nivel, Long id);
	public void deleteNivel(Long id);
	
}
