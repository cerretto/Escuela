package ar.com.escuela.cur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.cur.bean.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
