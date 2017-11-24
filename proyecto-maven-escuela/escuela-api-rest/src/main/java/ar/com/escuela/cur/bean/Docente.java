package ar.com.escuela.cur.bean;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.pad.bean.Persona;

@Entity
@Table(name="docente")
public class Docente extends BaseBO {

	@OneToOne
	private Persona persona;
}
