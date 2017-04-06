package ar.com.escuela.novedades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovedadService {

	@Autowired
	private NovedadRepository novedadRepository;
	
	public List<Novedad> getAllNovedades(){
		List<Novedad> novedades = new ArrayList<>();
		
		novedadRepository.findAll().forEach(novedades::add);
		
		return novedades;
	}
	
	public void addNovedad(Novedad novedad){
		novedadRepository.save(novedad);
	}
	
	
	
}
