package ar.com.escuela.cur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.cur.bean.Evaluacion;
import ar.com.escuela.cur.service.CursadoService;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionController {

	@Autowired
	private CursadoService cursadoService;
	
	
	
	@RequestMapping("/")
	public List<Evaluacion> getAllEvaluaciones(){
		return cursadoService.getAllEvaluaciones();
	}
	
	@RequestMapping("/{id}") // otra forma "/evaluacion/{foo}" y poner @PathVariable("foo")
	public Evaluacion getEvaluacion(@PathVariable Long id){
		return cursadoService.getEvaluacionById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/")
	public void addEvaluacion(@RequestBody Evaluacion evaluacion){
		cursadoService.addEvaluacion(evaluacion);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateEvaluacion(@RequestBody Evaluacion evaluacion, @PathVariable Long id){
		cursadoService.updateEvaluacion(evaluacion, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteEvaluacion(@PathVariable Long id){
		cursadoService.deleteEvaluacion(id);
	}






}
