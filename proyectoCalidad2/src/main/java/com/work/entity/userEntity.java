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
	private int identificacion;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "correo")
	private String correo;
	
	@Column (name = "clave")
	private String clave;
	
	@Column (name = "plan_lonchera")
	private int plan_lonchera;
	
	@Column (name = "renovacion_automatica")
	private int renovacion_automatica;
	
	@Column (name = "direccion")
	private String direccion;
	
	
	
	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
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
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + identificacion;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (identificacion != other.identificacion)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (plan_lonchera != other.plan_lonchera)
			return false;
		if (renovacion_automatica != other.renovacion_automatica)
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "userEntity [identificacion=" + identificacion + ", nombre=" + nombre + ", correo=" + correo + ", clave="
				+ clave + ", plan_lonchera=" + plan_lonchera + ", renovacion_automatica=" + renovacion_automatica
				+ ", direccion=" + direccion + ", getIdentificacion()=" + getIdentificacion() + ", getNombre()="
				+ getNombre() + ", getCorreo()=" + getCorreo() + ", getClave()=" + getClave() + ", getPlan_lonchera()="
				+ getPlan_lonchera() + ", getRenovacion_automatica()=" + getRenovacion_automatica()
				+ ", getDireccion()=" + getDireccion() + ", hashCode()=" + hashCode() + ", isEmpty()=" + isEmpty()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}	
}
