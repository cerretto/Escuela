package ar.com.escuela.def.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="materias")
public class Materia {
	
	private String desMateria;
	private String horario;
	private String salon;
	
	@ManyToOne
	@JoinColumn(name="idNivel")
	private Nivel nivel;
	
	public Materia(){
	}
	
	public String getDesMateria() {
		return desMateria;
	}

	public void setDesMateria(String desMateria) {
		this.desMateria = desMateria;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
}
