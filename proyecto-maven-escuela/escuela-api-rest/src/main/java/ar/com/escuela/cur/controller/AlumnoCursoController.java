package ar.com.escuela.cur.controller;

import ar.com.escuela.cur.bean.AlumnoCurso;
import ar.com.escuela.cur.service.CursadoService;
import ar.com.escuela.exceptions.EscuelaException;
import ar.com.escuela.exceptions.EscuelaRestErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inscripciones")
public class AlumnoCursoController {
	
	@Autowired
	private CursadoService cursadoService;
	
	@RequestMapping("")
	public ResponseEntity<List<AlumnoCurso>> getAllAlumnoCursos(){
		List<AlumnoCurso> listAlumnoCurso = cursadoService.getAllAlumnoCursos();
		return new ResponseEntity<List<AlumnoCurso>>(listAlumnoCurso,HttpStatus.OK);
	}
	
	@RequestMapping("/{id}") // otra forma "/alumnoCurso/{foo}" y poner @PathVariable("foo")
	public ResponseEntity<AlumnoCurso> getAlumnoCurso(@PathVariable Long id){
		AlumnoCurso alumnoCurso = cursadoService.getAlumnoCursoById(id);
		
		return new ResponseEntity<AlumnoCurso>(alumnoCurso,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addAlumnoCurso(@RequestBody AlumnoCurso alumnoCurso){
		
		// Validaciones de campos requeridos
		if (alumnoCurso.getAlumno() == null) {
			throw new EscuelaException(EscuelaRestErrorCode.REQUERIDO, "El alumno es requerido.");
		}
		
		if (alumnoCurso.getCurso() == null) {
			throw new EscuelaException(EscuelaRestErrorCode.REQUERIDO, "El curso es requerido.");
		}
		
		if (alumnoCurso.getAnio() == null) {
			throw new EscuelaException(EscuelaRestErrorCode.REQUERIDO, "El año es requerido.");
		}
		
		AlumnoCurso ac = cursadoService.getAlumnoCursoByAlumno(alumnoCurso.getAlumno());
		
		if (ac != null) {
			// Valida que si el alumno ya está inscripto a un curso no se pueda inscribir a otro curso
			throw new EscuelaException(EscuelaRestErrorCode.ALUMNO_INSCRIPTO, "El alumno ya está inscripto a un curso.");
		}
		
		cursadoService.addAlumnoCurso(alumnoCurso);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Void> updateAlumnoCurso(@RequestBody AlumnoCurso alumnoCurso, @PathVariable Long id){
		cursadoService.updateAlumnoCurso(alumnoCurso, id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<Void> deleteAlumnoCurso(@PathVariable Long id){
		cursadoService.deleteAlumnoCurso(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
