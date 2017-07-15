package ar.com.escuela.pad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.pad.bean.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
