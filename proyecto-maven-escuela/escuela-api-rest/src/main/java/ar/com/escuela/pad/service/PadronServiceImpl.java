package ar.com.escuela.pad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.escuela.pad.bean.Domicilio;
import ar.com.escuela.pad.bean.Localidad;
import ar.com.escuela.pad.bean.Persona;
import ar.com.escuela.pad.bean.Provincia;
import ar.com.escuela.pad.repository.DomicilioRepository;
import ar.com.escuela.pad.repository.LocalidadRepository;
import ar.com.escuela.pad.repository.PersonaRepository;
import ar.com.escuela.pad.repository.ProvinciaRepository;


public class PadronServiceImpl implements PadronService {
	
	@Autowired
	private ProvinciaRepository provinciaRepository;
	
	@Autowired
	private LocalidadRepository localidadRepository;
	
	@Autowired
	private DomicilioRepository domicilioRepository;
	
	@Autowired
	private PersonaRepository personaRepository;
	
	//-----------------------------------------------------------------------------
	// Servicios para Provincia
	//------------------------------------------------------------------------------
	@Override
	public List<Provincia> getAllProvincias(){
		List<Provincia> provincia = new ArrayList<>();
		
		//provinciaRepository sería el DAO. El add agarra a cada provincia y la mete en la lista de provincias.
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
	
	//-----------------------------------------------------------------------------
	// Servicios para Localidad
	//------------------------------------------------------------------------------
	@Override
	public List<Localidad> getAllLocalidades(){
		List<Localidad> localidad = new ArrayList<>();
		//localidaRepository sería el DAO. El add agarra a cada localidad y la mete en la lista de localidades.
		localidadRepository.findAll().forEach(localidad::add);
		return localidad;
	}
	
	@Override
	public Localidad getLocalidadById(Long id){
		return localidadRepository.findOne(id);
	}
	
	@Override
	public void addLocalidad(Localidad localidad){
		localidadRepository.save(localidad);
	}
	
	@Override
	public void updateLocalidad(Localidad localidad, Long id){
		localidadRepository.save(localidad);
	}
	
	@Override
	public void deleteLocalidad(Long id){
		localidadRepository.delete(id);
	}
	
	//-----------------------------------------------------------------------------
	// Servicios para Domicilio
	//------------------------------------------------------------------------------
	@Override
	public List<Domicilio> getAllDomicilios(){
		List<Domicilio> domicilio = new ArrayList<>();
		//domicilioRepository sería el DAO. El add agarra a cada domicilio y la mete en la lista de domicilios.
		domicilioRepository.findAll().forEach(domicilio::add);
		return domicilio;
	}
	
	@Override
	public Domicilio getDomicilioById(Long id){
		return domicilioRepository.findOne(id);
	}
	
	@Override
	public void addDomicilio(Domicilio domicilio){
		domicilioRepository.save(domicilio);
	}
	
	@Override
	public void updateDomicilio(Domicilio domicilio, Long id){
		domicilioRepository.save(domicilio);
	}
	
	@Override
	public void deleteDomicilio(Long id){
		domicilioRepository.delete(id);
	}
	
	//-----------------------------------------------------------------------------
	// Servicios para Persona
	//------------------------------------------------------------------------------
	@Override
	public List<Persona> getAllPersonas(){
		List<Persona> persona = new ArrayList<>();
		//personaRepository sería el DAO. El add agarra a cada persona y la mete en la lista de personas.
		personaRepository.findAll().forEach(persona::add);
		return persona;
	}
	
	@Override
	public Persona getPersonaById(Long id){
		return personaRepository.findOne(id);
	}
	
	@Override
	public void addPersona(Persona persona){
		personaRepository.save(persona);
	}
	
	@Override
	public void updatePersona(Persona persona, Long id){
		personaRepository.save(persona);
	}
	
	@Override
	public void deletePersona(Long id){
		personaRepository.delete(id);
	}
}
