package ar.com.escuela.noti.controller;

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

import ar.com.escuela.noti.bean.Aviso;
import ar.com.escuela.noti.service.NotificacionService;

@RestController
@RequestMapping("/avisos")
@CrossOrigin(origins = "http://localhost:4200")
public class AvisoController {
	
	@Autowired
	private NotificacionService avisoService;
	
	@RequestMapping("")
	public ResponseEntity<List<Aviso>> getAllAvisos(){
		List<Aviso> avisos = avisoService.getAllAvisos();
		
		return new ResponseEntity<List<Aviso>>(avisos,HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")	// otra forma "/novedad/{foo}" y poner @PathVariable("foo")
	public ResponseEntity<Aviso> getAviso(@PathVariable Long id){
		Aviso aviso = avisoService.getAvisoById(id);
		
		return new ResponseEntity<Aviso>(aviso,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addAviso(@RequestBody Aviso aviso){
		avisoService.addAviso(aviso);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Void> updateAviso(@RequestBody Aviso aviso, @PathVariable Long id){
		avisoService.updateAviso(aviso, id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<Void> deleteAviso(@PathVariable Long id){
		avisoService.deleteAviso(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
}
