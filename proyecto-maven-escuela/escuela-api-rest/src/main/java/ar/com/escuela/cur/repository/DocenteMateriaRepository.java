package ar.com.escuela.cur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.cur.bean.DocenteMateria;

@Repository
public interface DocenteMateriaRepository extends JpaRepository<DocenteMateria, Long>{

}
