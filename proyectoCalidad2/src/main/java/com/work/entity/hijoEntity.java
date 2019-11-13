package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity 
@Table( name = "hijo" ) 
@JsonIgnoreProperties(ignoreUnknown = true )
public class hijoEntity
{
	

	@Id
	@Column (name = "id_hijo")
	private int id_hijo;
	

	@Column (name = "nombre")
	private String nombre;
	

	@Column (name = "direccion")
	private String direccion;
	
	
	
	@Column (name = "id_lonchera")
	private int id_lonchera;
	

	@Column (name = "renovacion_automatica")
	private int renovacion_automatica;


	@Column (name = "id_usuario")
	private int id_usuario;
	
	
	public int getId_hijo()
	{
		return id_hijo;
	}
	public void setId_hijo(int id_hijo)
	{
		this.id_hijo = id_hijo;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	public int getId_lonchera()
	{
		return id_lonchera;
	}
	public void setId_loncherar(int id_lonchera)
	{
		this.id_lonchera = id_lonchera;
	}
	
	public int getRenovacion()
	{
		return renovacion_automatica;
	}
	public void setRenovacion(int renovacion_automatica)
	{
		this.renovacion_automatica = renovacion_automatica;
	}
	
	public int getId_usuario()
	{
		return id_usuario;
	}
	public void setId_usuario(int id_usuario)
	{
		this.id_usuario = id_usuario;
	}
}
