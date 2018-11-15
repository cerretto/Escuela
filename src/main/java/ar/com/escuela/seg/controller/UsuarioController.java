package ar.com.escuela.seg.controller;

import ar.com.escuela.seg.bean.Usuario;
import ar.com.escuela.seg.service.SeguridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private SeguridadService seguridadService;

    @RequestMapping("")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuarioList = seguridadService.getAllUsuarios();
        return new ResponseEntity<>(usuarioList, HttpStatus.OK);
    }

    @RequestMapping("/{id}") // otra forma "/usuario/{foo}" y poner @PathVariable("foo")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Long id) {

        return ResponseEntity.ok(seguridadService.getUsuarioById(id));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public void addUsuario(@RequestBody Usuario usuario) {
        seguridadService.addUsuario(usuario);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {
        seguridadService.updateUsuario(usuario, id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        seguridadService.deleteUsuario(id);
    }

    @GetMapping(value = "/me")
    @PreAuthorize("hasRole('ADMIN') or hasRole('DOCENTE')")
    public Usuario whoami(HttpServletRequest req) {
        return seguridadService.whoami(req);
    }

}
