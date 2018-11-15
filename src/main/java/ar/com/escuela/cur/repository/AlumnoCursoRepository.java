package ar.com.escuela.cur.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.cur.bean.Alumno;
import ar.com.escuela.cur.bean.AlumnoCurso;
import ar.com.escuela.def.bean.Curso;

@Repository
public interface AlumnoCursoRepository extends JpaRepository<AlumnoCurso, Long>{

	AlumnoCurso findByAlumno(Alumno alumno);
	
	List<AlumnoCurso> findAlumnoCursoByCurso(Curso curso);

}
