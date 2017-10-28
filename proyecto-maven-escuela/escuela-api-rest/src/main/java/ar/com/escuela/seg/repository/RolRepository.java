package ar.com.escuela.seg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.seg.bean.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
	
	Rol findByCodRol(String cod);

}
