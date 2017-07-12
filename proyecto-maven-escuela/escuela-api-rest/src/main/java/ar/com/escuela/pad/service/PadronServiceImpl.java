package ar.com.escuela.pad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.escuela.pad.bean.Provincia;
import ar.com.escuela.pad.repository.ProvinciaRepository;



public class PadronServiceImpl implements PadronService {
	
	@Autowired
	private ProvinciaRepository provinciaRepository;
	
	//-----------------------------------------------------------------------------
	// Servicios para TipoAviso
	//------------------------------------------------------------------------------
	@Override
	public List<Provincia> getAllProvincias(){
		List<Provincia> provincia = new ArrayList<>();
		
		//novedadRepository sería el DAO. El add agarra a cada novedad y la mete en la lista de novedades.
		provinciaRepository.findAll().forEach(provincia::add);
		
		return provincia;
	}
	
	@Override
	public Provincia getProvinciaById(Long id) {
		return provinciaRepository.findOne(id);
	}
	
	@Override
	public void addProvincia(Provincia provincia){
		provinciaRepository.save(provincia);
	}

	@Override
	public void updateProvincia(Provincia provincia, Long id) {
		provinciaRepository.save(provincia);
	}

	@Override
	public void deleteProvincia(Long id) {
		provinciaRepository.delete(id);
	}
}
