package ar.com.escuela.cur.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.pad.bean.Persona;

@Entity
@Table(name="alumno")
public class Alumno extends BaseBO {

	@OneToOne
	private Persona persona;
	
	@OneToMany
	private List<AlumnoCurso> alumnoCursos;
}
