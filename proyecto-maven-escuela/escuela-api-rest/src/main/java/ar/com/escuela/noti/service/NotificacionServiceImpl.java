package ar.com.escuela.noti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.escuela.noti.bean.Aviso;
import ar.com.escuela.noti.bean.TipoAviso;
import ar.com.escuela.noti.repository.AvisoRepository;
import ar.com.escuela.noti.repository.TipoAvisoRepository;

@Service
public class NotificacionServiceImpl implements NotificacionService {

	@Autowired
	private AvisoRepository avisoRepository;
	
	@Autowired
	private TipoAvisoRepository tipoAvisoRepository;
	
	
	
	
	
	
	//-----------------------------------------------------------------------------
	// Servicios para Aviso
	//------------------------------------------------------------------------------
	@Override
	public List<Aviso> getAllAvisos(){
		List<Aviso> avisos = new ArrayList<>();
		
		//avisoRepository sería el DAO. El add agarra a cada novedad y la mete en la lista de novedades.
		avisoRepository.findAll().forEach(avisos::add);
		
		return avisos;
	}
	
	@Override
	public void addAviso(Aviso aviso){
		avisoRepository.save(aviso);
	}
	
	@Override
	public Aviso getAvisoById(Long id) {
		return avisoRepository.findOne(id);
	}

	@Override
	public void updateAviso(Aviso aviso, Long id) {

		avisoRepository.save(aviso);
	}

	@Override
	public void deleteAviso(Long id) {
		
		avisoRepository.delete(id);
	}
	//------------------------------------------------------------------------------
	
	
	//-----------------------------------------------------------------------------
	// Servicios para TipoAviso
	//------------------------------------------------------------------------------
	@Override
	public List<TipoAviso> getAllTipoAviso(){
		List<TipoAviso> tipoAvisos = new ArrayList<>();
		
		//novedadRepository sería el DAO. El add agarra a cada novedad y la mete en la lista de novedades.
		tipoAvisoRepository.findAll().forEach(tipoAvisos::add);
		
		return tipoAvisos;
	}
	
	@Override
	public void addTipoAviso(TipoAviso tipoAviso){
		tipoAvisoRepository.save(tipoAviso);
	}
	
	@Override
	public TipoAviso getTipoAvisoById(Long id) {
		return tipoAvisoRepository.findOne(id);
	}

	@Override
	public void updateTipoAviso(TipoAviso tipoAviso, Long id) {

		tipoAvisoRepository.save(tipoAviso);
	}

	@Override
	public void deleteTipoAviso(Long id) {
		
		tipoAvisoRepository.delete(id);
	}
	//------------------------------------------------------------------------------
	
	
}
