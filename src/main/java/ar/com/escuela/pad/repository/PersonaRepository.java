package ar.com.escuela.pad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.pad.bean.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
