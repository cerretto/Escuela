package ar.com.escuela.cur.controller;

import ar.com.escuela.cur.bean.Alumno;
import ar.com.escuela.cur.service.CursadoService;
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
@RequestMapping("/alumnos")
public class AlumnoController {
	
	@Autowired
	private CursadoService alumnoService;
	
	@RequestMapping("")
	private ResponseEntity<List<Alumno>> getAllAlumnos(){
		List<Alumno> alumnos = alumnoService.getAllAlumnos(); 
		return new ResponseEntity<List<Alumno>>(alumnos,HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")	// otra forma "/alumno/{foo}" y poner @PathVariable("foo")
	public ResponseEntity<Alumno> getAlumno(@PathVariable Long id){
		Alumno alumno = alumnoService.getAlumnoById(id);
		
		return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addAlumno(@RequestBody Alumno alumno){
		alumnoService.addAlumno(alumno);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Void> updateAlumno(@RequestBody Alumno alumno, @PathVariable Long id){
		alumnoService.updateAlumno(alumno, id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<Void> deleteAlumno(@PathVariable Long id){
		alumnoService.deleteAlumno(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
