package ar.com.escuela.seg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.seg.bean.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
