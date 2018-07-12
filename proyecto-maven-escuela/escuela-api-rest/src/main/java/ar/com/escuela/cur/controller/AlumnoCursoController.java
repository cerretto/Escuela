package ar.com.escuela.cur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.cur.bean.AlumnoCurso;
import ar.com.escuela.cur.service.CursadoService;

@RestController
@RequestMapping("/inscripciones")
@CrossOrigin(origins = "*")
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
