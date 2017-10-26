package ar.com.escuela.noti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.noti.bean.Aviso;
import ar.com.escuela.noti.service.NotificacionService;

@RestController
@RequestMapping("/avisos")
@CrossOrigin(origins = "http://localhost:4200")
public class AvisoController {
	
	@Autowired
	private NotificacionService avisoService;
	
	@RequestMapping("/")
	public List<Aviso> getAllAvisos(){
		return avisoService.getAllAvisos();
	}
	
	@RequestMapping("/{id}")	// otra forma "/novedad/{foo}" y poner @PathVariable("foo")
	public Aviso getAviso(@PathVariable Long id){
		return avisoService.getAvisoById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/")
	public void addAviso(@RequestBody Aviso aviso){
		avisoService.addAviso(aviso);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateAviso(@RequestBody Aviso aviso, @PathVariable Long id){
		avisoService.updateAviso(aviso, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteAviso(@PathVariable Long id){
		avisoService.deleteAviso(id);
	}
	
	
}
