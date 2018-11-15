package ar.com.escuela.noti.service;

import java.util.List;

import ar.com.escuela.noti.bean.Aviso;
import ar.com.escuela.noti.bean.TipoAviso;


public interface NotificacionService {

	//Avisos
	public List<Aviso> getAllAvisos();
	public Aviso getAvisoById(Long id);
	public void addAviso(Aviso novedad);
	public void updateAviso(Aviso novedad, Long id);
	public void deleteAviso(Long id);
	
	//Tipo Aviso
	public List<TipoAviso> getAllTipoAviso();
	public TipoAviso getTipoAvisoById(Long id);
	public void addTipoAviso(TipoAviso novedad);
	public void updateTipoAviso(TipoAviso novedad, Long id);
	public void deleteTipoAviso(Long id);

}
