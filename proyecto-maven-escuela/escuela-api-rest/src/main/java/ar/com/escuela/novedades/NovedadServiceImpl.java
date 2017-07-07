package ar.com.escuela.novedades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovedadServiceImpl implements NovedadService {

	@Autowired
	private NovedadRepository novedadRepository;
	
	@Override
	public List<Novedad> getAllNovedades(){
		List<Novedad> novedades = new ArrayList<>();
		
		//novedadRepository sería el DAO. El add agarra a cada novedad y la mete en la lista de novedades.
		novedadRepository.findAll().forEach(novedades::add);
		
		return novedades;
	}
	
	@Override
	public void addNovedad(Novedad novedad){
		novedadRepository.save(novedad);
	}
	
	@Override
	public Novedad getNovedadById(Long id) {
		return novedadRepository.findOne(id);
	}

	@Override
	public void updateNovedad(Novedad novedad, Long id) {

		novedadRepository.save(novedad);
	}

	@Override
	public void deleteNovedad(Long id) {
		
		novedadRepository.delete(id);
	}
	
	
	
}
