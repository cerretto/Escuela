package ar.com.escuela.def.controller;

import ar.com.escuela.def.bean.Nivel;
import ar.com.escuela.def.service.DefinicionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/niveles")
public class NivelController {
	
	@Autowired
	private DefinicionService nivelService;
	
	@RequestMapping("")
	public List<Nivel> getAllNiveles(){
		return nivelService.getAllNiveles();
	}
	
	@RequestMapping("/{id}")
	public Nivel getNivel(@PathVariable Long id){
		return nivelService.getNivelById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void addNivel(@RequestBody Nivel nivel){
		nivelService.addNivel(nivel);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateNivel(@RequestBody Nivel nivel, @PathVariable Long id){
		nivelService.updateNivel(nivel, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	private void deleteNivel(@PathVariable Long id){
		nivelService.deleteNivel(id);
	}
}
