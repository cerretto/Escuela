package ar.com.escuela.noti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.noti.bean.Aviso;

@Repository
public interface AvisoRepository  extends JpaRepository<Aviso, Long>{

}
