package ar.com.escuela.cur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.cur.bean.AlumnoCurso;
import ar.com.escuela.cur.service.CursadoService;


@RestController
@RequestMapping("/alumnocurso")
public class AlumnoCursoController {
	

	
	@Autowired
	private CursadoService cursadoService;
	
	@RequestMapping("/")
	public List<AlumnoCurso> getAllAlumnoCursos(){
		return cursadoService.getAllAlumnoCursos();
	}
	
	@RequestMapping("/{id}") // otra forma "/alumnoCurso/{foo}" y poner @PathVariable("foo")
	public AlumnoCurso getAlumnoCurso(@PathVariable Long id){
		return cursadoService.getAlumnoCursoById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/")
	public void addAlumnoCurso(@RequestBody AlumnoCurso alumnoCurso){
		cursadoService.addAlumnoCurso(alumnoCurso);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateAlumnoCurso(@RequestBody AlumnoCurso alumnoCurso, @PathVariable Long id){
		cursadoService.updateAlumnoCurso(alumnoCurso, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteAlumnoCurso(@PathVariable Long id){
		cursadoService.deleteAlumnoCurso(id);
	}


}
