package ar.com.escuela.cur.service;

import java.util.List;

import ar.com.escuela.cur.bean.Alumno;
import ar.com.escuela.cur.bean.AlumnoCurso;
import ar.com.escuela.cur.bean.DocenteMateria;
import ar.com.escuela.cur.bean.Evaluacion;
import ar.com.escuela.cur.bean.Nota;

public interface CursadoService {

	//AlumnoCurso
	public List<AlumnoCurso> getAllAlumnoCursos();
	public AlumnoCurso getAlumnoCursoById(Long id);
	public void addAlumnoCurso(AlumnoCurso alumnoCurso);
	public void updateAlumnoCurso(AlumnoCurso alumnoCurso, Long id);
	public void deleteAlumnoCurso(Long id);
	public AlumnoCurso getAlumnoCursoByAlumno(Alumno alumno);
	
	//DocenteMateria
	public List<DocenteMateria> getAllDocenteMaterias();
	public DocenteMateria getDocenteMateriaById(Long id);
	public void addDocenteMateria(DocenteMateria docenteMateria);
	public void updateDocenteMateria(DocenteMateria docenteMateria, Long id);
	public void deleteDocenteMateria(Long id);
	
	//Nota
	public List<Nota> getAllNotas();
	public Nota getNotaById(Long id);
	public void addNota(Nota nota);
	public void updateNota(Nota nota, Long id);
	public void deleteNota(Long id);
	
	//Evaluacion
	public List<Evaluacion> getAllEvaluaciones();
	public Evaluacion getEvaluacionById(Long id);
	public void addEvaluacion(Evaluacion evaluacion);
	public void updateEvaluacion(Evaluacion evaluacion, Long id);
	public void deleteEvaluacion(Long id);
	
	//Alumno
	public List<Alumno> getAllAlumnos();
	public Alumno getAlumnoById(Long id);
	public void addAlumno(Alumno alumno);
	public void updateAlumno(Alumno alumno, Long id);
	public void deleteAlumno(Long id);
	
}
