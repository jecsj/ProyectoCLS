package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table( name = "usuarios" ) 
@JsonIgnoreProperties(ignoreUnknown = true )
public class userEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "identificacion")
	private String identificacion;
	
	@Column (name = "correo")
	private String correo;
	
	@Column (name = "clave")
	private String clave;
	
	@Column (name = "numero_hijos")
	private int numero_hijos;
	
	@Column (name = "alerjias_adulto")
	private String alerjias_adulto;
	
	@Column (name = "plan_lonchera")
	private int plan_lonchera;
	
	@Column (name = "renovacion_automatica")
	private int renovacion_automatica;
	
	@Column (name = "id_hijo")
	private String id_hijo;

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
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

	public int getPlan_lonchera() {
		return plan_lonchera;
	}

	public void setPlan_lonchera(int plan_lonchera) {
		this.plan_lonchera = plan_lonchera;
	}

	public int getRenovacion_automatica() {
		return renovacion_automatica;
	}

	public void setRenovacion_automatica(int renovacion_automatica) {
		this.renovacion_automatica = renovacion_automatica;
	}

	public String getId_hijo() {
		return id_hijo;
	}

	public void setId_hijo(String id_hijo) {
		this.id_hijo = id_hijo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alerjias_adulto == null) ? 0 : alerjias_adulto.hashCode());
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((id_hijo == null) ? 0 : id_hijo.hashCode());
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + numero_hijos;
		result = prime * result + plan_lonchera;
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
		userEntity other = (userEntity) obj;
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
		if (id_hijo == null) {
			if (other.id_hijo != null)
				return false;
		} else if (!id_hijo.equals(other.id_hijo))
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (numero_hijos != other.numero_hijos)
			return false;
		if (plan_lonchera != other.plan_lonchera)
			return false;
		if (renovacion_automatica != other.renovacion_automatica)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "userEntity [identificacion=" + identificacion + ", correo=" + correo + ", clave=" + clave
				+ ", numero_hijos=" + numero_hijos + ", alerjias_adulto=" + alerjias_adulto + ", plan_lonchera="
				+ plan_lonchera + ", renovacion_automatica=" + renovacion_automatica + ", id_hijo=" + id_hijo
				+ ", getIdentificacion()=" + getIdentificacion() + ", getCorreo()=" + getCorreo() + ", getClave()="
				+ getClave() + ", getNumero_hijos()=" + getNumero_hijos() + ", getAlerjias_adulto()="
				+ getAlerjias_adulto() + ", getPlan_lonchera()=" + getPlan_lonchera() + ", getRenovacion_automatica()="
				+ getRenovacion_automatica() + ", getId_hijo()=" + getId_hijo() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	

}
