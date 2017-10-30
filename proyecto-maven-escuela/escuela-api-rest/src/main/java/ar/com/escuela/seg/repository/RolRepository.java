package ar.com.escuela.seg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.seg.bean.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
	
	Rol findByCodigo(String codigo);

}
