package ar.com.escuela.cur.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.cur.bean.Evaluacion;
import ar.com.escuela.def.bean.Materia;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long>{

	List<Evaluacion> findByMateria(Materia materia);

}
