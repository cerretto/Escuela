package ar.com.escuela.pad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.pad.bean.Domicilio;
import ar.com.escuela.pad.service.PadronService;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {
	@Autowired
	private PadronService domicilioService;
	
	@RequestMapping("/")
	private List<Domicilio> getAllDomicilios(){
		return domicilioService.getAllDomicilios();
	}
	
	@RequestMapping("/{id}")
	private Domicilio getDomicilioById(@PathVariable Long id){
		return domicilioService.getDomicilioById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/")
	public void addDomicilio(@RequestBody Domicilio domicilio){
		domicilioService.addDomicilio(domicilio);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public void updateDomicilio(@RequestBody Domicilio domicilio, @PathVariable Long id){
		domicilioService.updateDomicilio(domicilio, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteDomicilio(@PathVariable Long id){
		domicilioService.deleteDomicilio(id);
	}
}
