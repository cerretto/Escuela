package ar.com.escuela.def.controller;

import ar.com.escuela.def.bean.Materia;
import ar.com.escuela.def.service.DefinicionService;
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
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private DefinicionService materiaService;
	
	@RequestMapping("")
	public ResponseEntity<List<Materia>> getAllMaterias(){
		List<Materia> materias = materiaService.getAllMaterias();
		return new ResponseEntity<List<Materia>>(materias, HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<Materia> getMateria(@PathVariable Long id){
		Materia materias = materiaService.getMateriaById(id);
		return new ResponseEntity<Materia>(materias, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addMateria(@RequestBody Materia materia){
		materiaService.addMateria(materia);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Void> updateMateria(@RequestBody Materia materia, @PathVariable Long id){
		materiaService.updateMateria(materia, id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	private ResponseEntity<Void> deleteMateria(@PathVariable Long id){
		materiaService.deleteMateria(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{username}")
	public ResponseEntity<List<Materia>> getMateriasByUser(@PathVariable String username){
		List<Materia> materias = materiaService.getMateriasByUser(username);
		return new ResponseEntity<List<Materia>>(materias, HttpStatus.OK);
	}
}
