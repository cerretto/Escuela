package ar.com.escuela.def.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.def.bean.Curso;
import ar.com.escuela.def.service.DefinicionService;

@RestController
@RequestMapping("/cursos")
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {
	
	@Autowired
	private DefinicionService cursoService;
	
	@RequestMapping("")
	public List<Curso> getAllCursos(){
		return cursoService.getAllCursos();
	}
	
	@RequestMapping("/{id}")
	public Curso getCurso(@PathVariable Long id){
		return cursoService.getCursoById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public void addCurso(@RequestBody Curso curso){
		cursoService.addCurso(curso);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateCurso(@RequestBody Curso curso, @PathVariable Long id){
		cursoService.updateCurso(curso, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	private void deleteCurso(@PathVariable Long id){
		cursoService.deleteCurso(id);
	}
}
