package ar.com.escuela.def.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.def.bean.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
