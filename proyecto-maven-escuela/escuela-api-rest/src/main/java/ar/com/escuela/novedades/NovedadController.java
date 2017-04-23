package ar.com.escuela.novedades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovedadController {
	
	@Autowired
	private NovedadService novedadService;
	
	@RequestMapping("/novedades")
	public List<Novedad> getAllNovedades(){
		
		return novedadService.getAllNovedades();
	}
	
	@RequestMapping("/novedades/{id}")					// otra forma "/novedad/{foo}" y poner @PathVariable("foo")
	public Novedad getNovedad(@PathVariable Long id){
		
		return novedadService.getNovedadById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/novedades")
	public void addNovedad(@RequestBody Novedad novedad){
		novedadService.addNovedad(novedad);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/novedades/{id}")
	public void updateNovedad(@RequestBody Novedad novedad, @PathVariable Long id){
		novedadService.updateNovedad(novedad, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/novedades/{id}")
	public void deleteNovedad(@PathVariable Long id){
		novedadService.deleteNovedad(id);
	}
	
	
}
