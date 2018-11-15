package ar.com.escuela.pad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.pad.bean.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long>{

}
