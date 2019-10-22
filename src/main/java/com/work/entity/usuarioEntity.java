package com.work.entity;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name = "visits") 

@JsonIgnoreProperties(ignoreUnknown = true )
public class usuarioEntity {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	 @GeneratedValue
	@Column( name = "identificacion")
	private int identificacion;
	
	@Column( name = "correo")
	private String correo;
	
	@Column( name = "clave")
	private String clave;
	
	@Column (name = "numero_hijos")
	private int numero_hijos;
	
	@Column (name = "alerjias_adulto")
	private String alerjias_adulto;
	
	@Column (name = "paln_lonchera")
	private int paln_lonchera;
	
	@Column (name = "renovacion_automatica")
	private int renovacion_automatica;
	
	@Column (name = "id_hijo")
	private int id_hijo;
	
	
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getNumero_hijos() {
		return numero_hijos;
	}
	public void setNumero_hijos(int numero_hijos) {
		this.numero_hijos = numero_hijos;
	}
	public String getAlerjias_adulto() {
		return alerjias_adulto;
	}
	public void setAlerjias_adulto(String alerjias_adulto) {
		this.alerjias_adulto = alerjias_adulto;
	}
	public int getPaln_lonchera() {
		return paln_lonchera;
	}
	public void setPaln_lonchera(int paln_lonchera) {
		this.paln_lonchera = paln_lonchera;
	}
	public int getRenovacion_automatica() {
		return renovacion_automatica;
	}
	public void setRenovacion_automatica(int renovacion_automatica) {
		this.renovacion_automatica = renovacion_automatica;
	}
	public int getId_hijo() {
		return id_hijo;
	}
	public void setId_hijo(int id_hijo) {
		this.id_hijo = id_hijo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alerjias_adulto == null) ? 0 : alerjias_adulto.hashCode());
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + id_hijo;
		result = prime * result + identificacion;
		result = prime * result + numero_hijos;
		result = prime * result + paln_lonchera;
		result = prime * result + renovacion_automatica;
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
		usuarioEntity other = (usuarioEntity) obj;
		if (alerjias_adulto == null) {
			if (other.alerjias_adulto != null)
				return false;
		} else if (!alerjias_adulto.equals(other.alerjias_adulto))
			return false;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (id_hijo != other.id_hijo)
			return false;
		if (identificacion != other.identificacion)
			return false;
		if (numero_hijos != other.numero_hijos)
			return false;
		if (paln_lonchera != other.paln_lonchera)
			return false;
		if (renovacion_automatica != other.renovacion_automatica)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "usuarioEntity [identificacion=" + identificacion + ", correo=" + correo + ", clave=" + clave
				+ ", numero_hijos=" + numero_hijos + ", alerjias_adulto=" + alerjias_adulto + ", paln_lonchera="
				+ paln_lonchera + ", renovacion_automatica=" + renovacion_automatica + ", id_hijo=" + id_hijo
				+ ", getIdentificacion()=" + getIdentificacion() + ", getCorreo()=" + getCorreo() + ", getClave()="
				+ getClave() + ", getNumero_hijos()=" + getNumero_hijos() + ", getAlerjias_adulto()="
				+ getAlerjias_adulto() + ", getPaln_lonchera()=" + getPaln_lonchera() + ", getRenovacion_automatica()="
				+ getRenovacion_automatica() + ", getId_hijo()=" + getId_hijo() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
