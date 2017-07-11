package ar.com.escuela.seg.repository;

import org.springframework.data.repository.CrudRepository;

import ar.com.escuela.seg.bean.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

}
