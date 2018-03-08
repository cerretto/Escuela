package ar.com.escuela.def.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.escuela.def.bean.Curso;
import ar.com.escuela.def.bean.Materia;
import ar.com.escuela.def.bean.Nivel;
import ar.com.escuela.def.bean.Plan;
import ar.com.escuela.def.repository.CursoRepository;
import ar.com.escuela.def.repository.MateriaRepository;
import ar.com.escuela.def.repository.NivelRepository;
import ar.com.escuela.def.repository.PlanRepository;
import ar.com.escuela.exceptions.EscuelaException;
import ar.com.escuela.exceptions.EscuelaRestErrorCode;

@Service
public class DefinicionServiceImpl implements DefinicionService{
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private NivelRepository nivelRepository;
	
	@Autowired
	private MateriaRepository materiaRepository;
	
	@Autowired
	private PlanRepository planRepository;
	
	//Servicios para Curso------------------------------------------------------------
	@Override
	public List<Curso> getAllCursos(){
		List<Curso> cursos = new ArrayList<>();
		//cursoRepository sería el DAO. El add agarra a cada curso y la mete en la lista de cursos.
		cursoRepository.findAll().forEach(cursos::add);
		return cursos;
	}
	
	@Override
	public void addCurso(Curso curso){
		cursoRepository.save(curso);
	}
	
	@Override
	public Curso getCursoById(Long id) {
		return cursoRepository.findOne(id);
	}

	@Override
	public void updateCurso(Curso curso, Long id) {
		cursoRepository.save(curso);
	}

	@Override
	public void deleteCurso(Long id) {
		cursoRepository.delete(id);
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
		materiaRepository.findAll().forEach(materias::add);
		return materias;
	}
	
	@Override
	public void addMateria(Materia materia){
		
		Materia materiaExistente = materiaRepository.findByDescripcion(materia.getDescripcion());
		if (materiaExistente != null) 
			throw new EscuelaException(EscuelaRestErrorCode.VALIDATION_ERROR, "Existe una materia con esa Descripcion.");
		
		materiaRepository.save(materia);
	}
	
	@Override
	public Materia getMateriaById(Long id) {
		return materiaRepository.findOne(id);
	}

	@Override
	public void updateMateria(Materia materia, Long id) {
		materiaRepository.save(materia);
	}

	@Override
	public void deleteMateria(Long id) {
		materiaRepository.delete(id);
	}
	
	//Servicios para Plan--------------------------------------------------------------------------------
	@Override
	public List<Plan> getAllPlanes(){
		List<Plan> planes = new ArrayList<>();
		//planRepository sería el DAO. El add agarra a cada plan y la mete en la lista de planes.
		planRepository.findAll().forEach(planes::add);
		return planes;
	}
	
	@Override
	public void addPlan(Plan plan){
		planRepository.save(plan);
	}
	
	@Override
	public Plan getPlanById(Long id) {
		return planRepository.findOne(id);
	}

	@Override
	public void updatePlan(Plan plan, Long id) {
		planRepository.save(plan);
	}

	@Override
	public void deletePlan(Long id) {
		planRepository.delete(id);
	}
}
