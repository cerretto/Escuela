package ar.com.escuela.cur.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.com.escuela.cur.bean.Alumno;
import ar.com.escuela.cur.bean.AlumnoCurso;
import ar.com.escuela.def.bean.Curso;

@Repository
public interface AlumnoCursoRepository extends JpaRepository<AlumnoCurso, Long>{

	AlumnoCurso findByAlumno(Alumno alumno);
	
	List<AlumnoCurso> findAlumnoCursoByCurso(Curso curso);
	
	@Query(value = "select ac.* from evaluacion e "
			+ "inner join materia m "
			+ "on e.materia_id = m.id "
			+ "inner join nivel n "
			+ "on m.nivel_id = n.id "
			+ "inner JOIN curso c "
			+ "on n.id = c.nivel_id "
			+ "inner join alumno_curso ac "
			+ "on c.id = ac.curso_id "
			+ "where e.id = ?1", nativeQuery=true)
	List<AlumnoCurso> getListAlumnoCursoByEvaluacion(Long idEvaluacion);

}
