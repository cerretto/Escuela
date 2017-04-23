package ar.com.escuela.novedades;

import java.util.List;

import org.springframework.stereotype.Service;


public interface NovedadService {

	public List<Novedad> getAllNovedades();
	public Novedad getNovedadById(Long id);
	public void addNovedad(Novedad novedad);
	public void updateNovedad(Novedad novedad, Long id);
	public void deleteNovedad(Long id);
}
