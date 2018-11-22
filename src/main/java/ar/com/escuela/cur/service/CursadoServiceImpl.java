package ar.com.escuela.cur.service;

import java.util.ArrayList;
import java.util.Date;
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
import ar.com.escuela.def.bean.Curso;
import ar.com.escuela.def.bean.Materia;
import ar.com.escuela.def.repository.CursoRepository;
import ar.com.escuela.def.repository.MateriaRepository;

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
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private MateriaRepository materiaRepository;
	
	//Servicios para Alumnocurso------------------------------------------------------------------------------------
	@Override
	public List<AlumnoCurso> getAllAlumnoCursos(){
		List<AlumnoCurso> alumnoCursos = new ArrayList<>();
		
		//rolRepository sería el DAO. El add agarra a cada rol y la mete en la lista de rols.
		alumnoCursoRepository.findAll().forEach(alumnoCursos::add);
		
		return alumnoCursos;
	}
	
	@Override
	public void addAlumnoCurso(AlumnoCurso alumnoCurso) {
		
		// Seteamos la fecha de inscripción con la fecha actual
		alumnoCurso.setFechaInscripcion(new Date());
		
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
	
	@Override
	public AlumnoCurso getAlumnoCursoByAlumno(Alumno alumno) {
		
		AlumnoCurso alumnoCurso = alumnoCursoRepository.findByAlumno(alumno);
		
		return alumnoCurso;
	}
	
	@Override
	public List<AlumnoCurso> getAlumnoCursoByCurso(Long idCurso) {
		
		// Recuperamos el curso
		Curso curso = cursoRepository.findOne(idCurso);
		
		List<AlumnoCurso> listAlumnoCursos = alumnoCursoRepository.findAlumnoCursoByCurso(curso);
		
		return listAlumnoCursos;
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
		
		List<AlumnoCurso> listAlumnoCurso = alumnoCursoRepository.getListAlumnoCursoByEvaluacion(evaluacion.getId());
		
		for (AlumnoCurso alumnoCurso : listAlumnoCurso) {
			Nota nota = new Nota();
			
			nota.setFecha(new Date());
			nota.setAlumnoCurso(alumnoCurso);
			nota.setEvaluacion(evaluacion);
			
			notaRepository.save(nota);
		}
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
	
	@Override
	public List<Evaluacion> getEvaluacionesByMateria(Long idMateria) {
		Materia materia = materiaRepository.findOne(idMateria);
		
		List<Evaluacion> evaluaciones = evaluacionRepository.findByMateria(materia);
		
		return evaluaciones;
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
	
	@Override
	public List<Nota> getNotasByAlumnoCurso(Long idAlumnoCurso) {
		// Recuperamos el AlumnoCurso
		AlumnoCurso alumnoCurso = alumnoCursoRepository.findOne(idAlumnoCurso);
		
		List<Nota> listNotas = notaRepository.findNotasByAlumnoCurso(alumnoCurso);
		
		return listNotas;
	}
	
	@Override
	public List<Nota> getNotasByEvaluacion(Long idEvaluacion) {
		// Recuperamos la Evaluacion
		Evaluacion evaluacion = evaluacionRepository.findOne(idEvaluacion);
		
		List<Nota> listNotas = notaRepository.findNotasByEvaluacion(evaluacion);
		
		return listNotas;
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
