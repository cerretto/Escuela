package ar.com.escuela.novedades;

public class Novedad {
	
	private int Id;
	private String nombre;
	private String descripcion;
	
	public Novedad(){
		
	}
	
	public Novedad(int id, String nombre, String descripcion) {
		super();
		Id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
