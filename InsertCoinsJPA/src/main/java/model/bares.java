package model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: bares
 *
 */
@Entity
@Table(name="bares" , schema = "insertcoins")
public class bares implements Serializable {

	   
	@Id 
	private Integer id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idbar == null) ? 0 : idbar.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bares other = (bares) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idbar == null) {
			if (other.idbar != null)
				return false;
		} else if (!idbar.equals(other.idbar))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "bares [id=" + id + ", idbar=" + idbar + ", nombre=" + nombre + "]";
	}

	private Integer idbar;
	private String nombre;
	private static final long serialVersionUID = 1L;

	public bares() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Integer getIdbar() {
		return this.idbar;
	}

	public void setIdbar(Integer idbar) {
		this.idbar = idbar;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
