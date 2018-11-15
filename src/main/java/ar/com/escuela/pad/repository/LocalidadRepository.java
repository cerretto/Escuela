package ar.com.escuela.pad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.pad.bean.Localidad;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {

}
