package ar.com.escuela.def.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.def.bean.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long>{

}
