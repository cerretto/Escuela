package ar.com.escuela.def.service;

import java.util.List;

import ar.com.escuela.def.bean.Curso;
import ar.com.escuela.def.bean.Materia;
import ar.com.escuela.def.bean.Nivel;
import ar.com.escuela.def.bean.Plan;

public interface DefinicionService {
	
	//Curso
	public List<Curso> getAllCursos();
	public Curso getCursoById(Long id);
	public void addCurso(Curso curso);
	public void updateCurso(Curso curso, Long id);
	public void deleteCurso(Long id);
	
	//Materia
	public List<Materia> getAllMaterias();
	public Materia getMateriaById(Long id);
	public void addMateria(Materia materia);
	public void updateMateria(Materia materia, Long id);
	public void deleteMateria(Long id);
	public List<Materia> getMateriasByUser(String username);
	
	//Nivel
	public List<Nivel> getAllNiveles();
	public Nivel getNivelById(Long id);
	public void addNivel(Nivel nivel);
	public void updateNivel(Nivel nivel, Long id);
	public void deleteNivel(Long id);
	
	//Plan
	public List<Plan> getAllPlanes();
	public Plan getPlanById(Long id);
	public void addPlan(Plan plan);
	public void updatePlan(Plan plan, Long id);
	public void deletePlan(Long id);
	
}
