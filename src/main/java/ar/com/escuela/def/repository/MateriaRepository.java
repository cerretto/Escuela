package ar.com.escuela.def.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ar.com.escuela.def.bean.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long>{

	Materia findByDescripcion(String descripcion);
	
	@Query(value = "select m.* from usuario u "
			+ "inner join persona p "
			+ "on u.persona_id = p.id "
			+ "inner join docente d "
			+ "on p.id = d.persona_id "
			+ "inner JOIN docente_materia dm "
			+ "on d.id = dm.docente_id "
			+ "inner join materia m "
			+ "on dm.materia_id = m.id "
			+ "where u.usr = ?1", nativeQuery=true)
	List<Materia> findMateriasByUsername(String username);
	
	
	
	
	
	
	
	
	
	
	
}
