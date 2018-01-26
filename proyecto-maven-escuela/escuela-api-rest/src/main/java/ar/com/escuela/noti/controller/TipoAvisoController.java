package ar.com.escuela.noti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.noti.bean.TipoAviso;
import ar.com.escuela.noti.service.NotificacionService;

@RestController
@RequestMapping("/tipo-avisos")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoAvisoController {
	
	@Autowired
	private NotificacionService notificacionService;
	
	@RequestMapping("")
	public List<TipoAviso> getAllTipoAvisos(){
		
		return notificacionService.getAllTipoAviso();
	}
	
	@RequestMapping("/{id}")					// otra forma "/novedad/{foo}" y poner @PathVariable("foo")
	public TipoAviso getTipoAviso(@PathVariable Long id){
		
		return notificacionService.getTipoAvisoById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void addTipoAviso(@RequestBody TipoAviso tipoAviso){
		notificacionService.addTipoAviso(tipoAviso);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateTipoAviso(@RequestBody TipoAviso tipoAviso, @PathVariable Long id){
		notificacionService.updateTipoAviso(tipoAviso, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteTipoAviso(@PathVariable Long id){
		notificacionService.deleteTipoAviso(id);
	}

}
