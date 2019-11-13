package com.work.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class loginEntity 
{
	private int identificacion;
	private String contrasena;
	
	
	
	

	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getContraseña() {
		return contrasena;
	}
	public void setContraseña(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

}
