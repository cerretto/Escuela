package ar.com.escuela.cur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.cur.bean.DocenteMateria;
import ar.com.escuela.cur.service.CursadoService;

@RestController
@RequestMapping("/docentemateria")
public class DocenteMateriaController {

	

	
	@Autowired
	private CursadoService cursadoService;
	
	@RequestMapping("/")
	public List<DocenteMateria> getAllDocenteMaterias(){
		return cursadoService.getAllDocenteMaterias();
	}
	
	@RequestMapping("/{id}") // otra forma "/docenteMateria/{foo}" y poner @PathVariable("foo")
	public DocenteMateria getDocenteMateria(@PathVariable Long id){
		return cursadoService.getDocenteMateriaById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/")
	public void addDocenteMateria(@RequestBody DocenteMateria docenteMateria){
		cursadoService.addDocenteMateria(docenteMateria);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateDocenteMateria(@RequestBody DocenteMateria docenteMateria, @PathVariable Long id){
		cursadoService.updateDocenteMateria(docenteMateria, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteDocenteMateria(@PathVariable Long id){
		cursadoService.deleteDocenteMateria(id);
	}




}
