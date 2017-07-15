package ar.com.escuela.pad.service;

import java.util.List;

import ar.com.escuela.pad.bean.Domicilio;
import ar.com.escuela.pad.bean.Localidad;
import ar.com.escuela.pad.bean.Persona;
import ar.com.escuela.pad.bean.Provincia;

public interface PadronService {
	
	//Provincia
	public List<Provincia> getAllProvincias();
	public Provincia getProvinciaById(Long id);
	public void addProvincia(Provincia provincia);
	public void updateProvincia(Provincia provincia, Long id);
	public void deleteProvincia(Long id);
	
	//Localidad
	public List<Localidad> getAllLocalidades();
	public Localidad getLocalidadById(Long id);
	public void addLocalidad(Localidad localidad);
	public void updateLocalidad(Localidad localidad, Long id);
	public void deleteLocalidad(Long id);
	
	//Domicilio
	public List<Domicilio> getAllDomicilios();
	public Domicilio getDomicilioById(Long id);
	public void addDomicilio(Domicilio domicilio);
	public void updateDomicilio(Domicilio domicilio, Long id);
	public void deleteDomicilio(Long id);
	
	//Persona
	public List<Persona> getAllPersonas();
	public Persona getPersonaById(Long id);
	public void addPersona(Persona persona);
	public void updatePersona(Persona persona, Long id);
	public void deletePersona(Long id);
}
