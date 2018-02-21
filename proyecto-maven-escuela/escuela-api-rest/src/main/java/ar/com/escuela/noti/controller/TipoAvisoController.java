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

import ar.com.escuela.noti.bean.TipoAviso;
import ar.com.escuela.noti.service.NotificacionService;

@RestController
@RequestMapping("/tipoaviso")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoAvisoController {
	
	@Autowired
	private NotificacionService notificacionService;
	
	@RequestMapping("")
	public ResponseEntity<List<TipoAviso>> getAllTipoAvisos(){
		List<TipoAviso> tipoAvisos = notificacionService.getAllTipoAviso();
		return new ResponseEntity<List<TipoAviso>>(tipoAvisos, HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")					// otra forma "/novedad/{foo}" y poner @PathVariable("foo")
	public ResponseEntity<TipoAviso> getTipoAviso(@PathVariable Long id){
		TipoAviso tipoAviso = notificacionService.getTipoAvisoById(id);
		return new ResponseEntity<TipoAviso>(tipoAviso, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addTipoAviso(@RequestBody TipoAviso tipoAviso){
		notificacionService.addTipoAviso(tipoAviso);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Void> updateTipoAviso(@RequestBody TipoAviso tipoAviso, @PathVariable Long id){
		notificacionService.updateTipoAviso(tipoAviso, id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<Void> deleteTipoAviso(@PathVariable Long id){
		notificacionService.deleteTipoAviso(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
