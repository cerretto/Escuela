package ar.com.escuela.def.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.def.bean.Nivel;

@Repository
public interface NivelRepository extends JpaRepository<Nivel, Long>{

}
