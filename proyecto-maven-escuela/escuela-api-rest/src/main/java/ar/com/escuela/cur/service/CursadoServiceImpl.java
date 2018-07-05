package ar.com.escuela.cur.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.escuela.cur.bean.Alumno;
import ar.com.escuela.cur.bean.AlumnoCurso;
import ar.com.escuela.cur.bean.DocenteMateria;
import ar.com.escuela.cur.bean.Evaluacion;
import ar.com.escuela.cur.bean.Nota;
import ar.com.escuela.cur.repository.AlumnoCursoRepository;
import ar.com.escuela.cur.repository.AlumnoRepository;
import ar.com.escuela.cur.repository.DocenteMateriaRepository;
import ar.com.escuela.cur.repository.EvaluacionRepository;
import ar.com.escuela.cur.repository.NotaRepository;

@Service
public class CursadoServiceImpl implements CursadoService {

	
	@Autowired
	private DocenteMateriaRepository docenteMateriaRepository;
	
	@Autowired
	private AlumnoCursoRepository alumnoCursoRepository;
	
	@Autowired
	private EvaluacionRepository evaluacionRepository;
	
	@Autowired
	private NotaRepository notaRepository;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	//Servicios para Alumnocurso------------------------------------------------------------------------------------
	@Override
	public List<AlumnoCurso> getAllAlumnoCursos(){
		List<AlumnoCurso> alumnoCursos = new ArrayList<>();
		
		//rolRepository sería el DAO. El add agarra a cada rol y la mete en la lista de rols.
		alumnoCursoRepository.findAll().forEach(alumnoCursos::add);
		
		return alumnoCursos;
	}
	
	@Override
	public void addAlumnoCurso(AlumnoCurso alumnoCurso){
		alumnoCursoRepository.save(alumnoCurso);
	}
	
	@Override
	public AlumnoCurso getAlumnoCursoById(Long id) {
		return alumnoCursoRepository.findOne(id);
	}

	@Override
	public void updateAlumnoCurso(AlumnoCurso alumnoCurso, Long id) {

		alumnoCursoRepository.save(alumnoCurso);
	}

	@Override
	public void deleteAlumnoCurso(Long id) {
		
		alumnoCursoRepository.delete(id);
	}
	
	//Servicios para DocenteMateria----------------------------------------------------------------------------
	@Override
	public List<DocenteMateria> getAllDocenteMaterias(){
		List<DocenteMateria> docenteMaterias = new ArrayList<>();
		
		//docenteMateriaRepository sería el DAO. El add agarra a cada docenteMateria y la mete en la lista de docenteMaterias.
		docenteMateriaRepository.findAll().forEach(docenteMaterias::add);
		
		return docenteMaterias;
	}
	
	@Override
	public void addDocenteMateria(DocenteMateria docenteMateria){
		docenteMateriaRepository.save(docenteMateria);
	}
	
	@Override
	public DocenteMateria getDocenteMateriaById(Long id) {
		return docenteMateriaRepository.findOne(id);
	}

	@Override
	public void updateDocenteMateria(DocenteMateria docenteMateria, Long id) {
		docenteMateriaRepository.save(docenteMateria);
	}

	@Override
	public void deleteDocenteMateria(Long id) {
		docenteMateriaRepository.delete(id);
	}
	
	//Servicios para Evaluacion--------------------------------------------------------------------------------
	@Override
	public List<Evaluacion> getAllEvaluaciones(){
		List<Evaluacion> evaluaciones = new ArrayList<>();
		
		//evaluacionRepository sería el DAO. El add agarra a cada usuario y la mete en la lista de usuarios.
		evaluacionRepository.findAll().forEach(evaluaciones::add);
		
		return evaluaciones;
	}
	
	@Override
	public void addEvaluacion(Evaluacion evaluacion){
		evaluacionRepository.save(evaluacion);
	}
	
	@Override
	public Evaluacion getEvaluacionById(Long id) {
		return evaluacionRepository.findOne(id);
	}

	@Override
	public void updateEvaluacion(Evaluacion evaluacion, Long id) {
		evaluacionRepository.save(evaluacion);
	}

	@Override
	public void deleteEvaluacion(Long id) {
		evaluacionRepository.delete(id);
	}
	
	//Servicios para Nota--------------------------------------------------------------------------------
	@Override
	public List<Nota> getAllNotas(){
		List<Nota> notas = new ArrayList<>();
		
		//notaRepository sería el DAO. El add agarra a cada usuario y la mete en la lista de usuarios.
		notaRepository.findAll().forEach(notas::add);
		
		return notas;
	}
	
	@Override
	public void addNota(Nota nota){
		notaRepository.save(nota);
	}
	
	@Override
	public Nota getNotaById(Long id) {
		return notaRepository.findOne(id);
	}

	@Override
	public void updateNota(Nota nota, Long id) {
		notaRepository.save(nota);
	}

	@Override
	public void deleteNota(Long id) {
		notaRepository.delete(id);
	}
	
	//-----------------------------------------------------------------------------
	// Servicios para Alumno
	//------------------------------------------------------------------------------
	@Override
	public List<Alumno> getAllAlumnos(){
		List<Alumno> alumno = new ArrayList<>();
		//personaRepository sería el DAO. El add agarra a cada alumno y la mete en la lista de alumnos.
		alumnoRepository.findAll().forEach(alumno::add);
		return alumno;
	}
	
	@Override
	public Alumno getAlumnoById(Long id){
		return alumnoRepository.findOne(id);
	}
	
	@Override
	public void addAlumno(Alumno alumno){
		alumnoRepository.save(alumno);
	}
	
	@Override
	public void updateAlumno(Alumno alumno, Long id){
		alumnoRepository.save(alumno);
	}
	
	@Override
	public void deleteAlumno(Long id){
		alumnoRepository.delete(id);
	}

}
