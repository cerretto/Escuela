package ar.com.escuela.noti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.noti.bean.TipoAviso;

public interface TipoAvisoRepository extends JpaRepository<TipoAviso, Long>{

}
