package ar.com.escuela.cur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.cur.bean.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long>{

}
