package ar.com.escuela.noti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.noti.bean.Aviso;

public interface AvisoRepository  extends JpaRepository<Aviso, Long>{

}
