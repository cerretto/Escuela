package ar.com.escuela.pad.service;

import java.util.List;

import ar.com.escuela.pad.bean.Provincia;

public interface PadronService {
	
	//Provincia
	public List<Provincia> getAllProvincias();
	public Provincia getProvinciaById(Long id);
	public void addProvincia(Provincia provincia);
	public void updateProvincia(Provincia provincia, Long id);
	public void deleteProvincia(Long id);
}
