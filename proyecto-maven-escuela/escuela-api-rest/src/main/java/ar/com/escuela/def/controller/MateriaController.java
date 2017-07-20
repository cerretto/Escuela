package ar.com.escuela.def.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.def.bean.Materia;
import ar.com.escuela.def.service.DefinicionService;

@RestController
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private DefinicionService materiaService;
	
	@RequestMapping("/")
	public List<Materia> getAllMaterias(){
		return materiaService.getAllMaterias();
	}
	
	@RequestMapping("/{id}")
	public Materia getMateria(@PathVariable Long id){
		return materiaService.getMateriaById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public void addMateria(@RequestBody Materia materia){
		materiaService.addMateria(materia);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateMateria(@RequestBody Materia materia, @PathVariable Long id){
		materiaService.updateMateria(materia, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	private void deleteMateria(@PathVariable Long id){
		materiaService.deleteMateria(id);
	}
}
