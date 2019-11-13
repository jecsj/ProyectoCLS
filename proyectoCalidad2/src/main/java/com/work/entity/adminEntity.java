package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity 
@Table( name = "administrador" ) 
@JsonIgnoreProperties(ignoreUnknown = true )
public class adminEntity 
{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column (name = "id_administrador")
	private int id_administrador;
	
	@Column (name = "correo")
	private String correo;
	
	@Column (name = "clave")
	private String clave;
	
	
	public int getId_administrador()
	{
		return id_administrador;
	}
	public void setId_administrador(int id_administrador)
	{
		this.id_administrador = id_administrador;
	}
	
	public String getCorre() 
	{
		return correo;
	}
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}
	
	public String getClave()
	{
		return clave;
	}
	public void setClave(String clave)
	{
		this.clave = clave;
	}
	
	
}	
