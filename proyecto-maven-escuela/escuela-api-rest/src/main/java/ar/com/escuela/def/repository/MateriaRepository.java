package ar.com.escuela.def.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.def.bean.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long>{

	Materia findByDescripcion(String descripcion);
}
