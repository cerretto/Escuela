package ar.com.escuela.cur.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.cur.bean.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long>{

}
