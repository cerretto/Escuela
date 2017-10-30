package ar.com.escuela.noti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.noti.bean.TipoAviso;

@Repository
public interface TipoAvisoRepository extends JpaRepository<TipoAviso, Long>{

}
