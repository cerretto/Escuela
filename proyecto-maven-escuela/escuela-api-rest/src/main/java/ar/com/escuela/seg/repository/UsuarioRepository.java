package ar.com.escuela.seg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.seg.bean.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
