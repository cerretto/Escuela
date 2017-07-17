package ar.com.escuela.pad.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Persona {

	private String nombre;
	private String apellido;
	private String nroDocumento;
	private Date fechaNacimiento;
	private String telefono;
	
	@OneToMany
	@JoinColumn(name = "idPersona")
	private List<Domicilio> listDomicilio;
	
	
	
	
	public List<Domicilio> getListDomicilio() {
		return listDomicilio;
	}
	public void setListDomicilio(List<Domicilio> listDomicilio) {
		this.listDomicilio = listDomicilio;
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

}
