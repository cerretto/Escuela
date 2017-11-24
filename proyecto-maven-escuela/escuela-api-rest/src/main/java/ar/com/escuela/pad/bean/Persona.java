package ar.com.escuela.pad.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;

@Entity
@Table(name="persona")
public class Persona extends BaseBO{

	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String nroDocumento;
	
	@Column
	private Date fechaNacimiento;
	
	@Column
	private String telefono;
	
	@OneToMany
	private List<Domicilio> domicilios;
	
	@ManyToOne
	private Persona responsable;
	
	@OneToMany
	private List<Persona> hijos;
	
	
	
	
	public List<Domicilio> getDomicilios() {
		return domicilios;
	}
	public void setDomicilios(List<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Persona getResponsable() {
		return responsable;
	}
	public void setResponsable(Persona responsable) {
		this.responsable = responsable;
	}
	public List<Persona> getHijos() {
		return hijos;
	}
	public void setHijos(List<Persona> hijos) {
		this.hijos = hijos;
	}

}
