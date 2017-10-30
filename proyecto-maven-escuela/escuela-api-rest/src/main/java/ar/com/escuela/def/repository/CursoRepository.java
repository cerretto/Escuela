package ar.com.escuela.def.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.def.bean.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
