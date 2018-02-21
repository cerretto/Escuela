package ar.com.escuela.cur.bean;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ar.com.escuela.base.bean.BaseBO;
import ar.com.escuela.seg.bean.Usuario;

@Entity
@Table(name = "alumno")
public class Alumno extends BaseBO {

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
