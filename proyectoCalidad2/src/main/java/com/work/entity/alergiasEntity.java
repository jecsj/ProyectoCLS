package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity 
@Table( name = "alergias" ) 
@JsonIgnoreProperties(ignoreUnknown = true )
public class alergiasEntity 
{
	@Id
	@Column (name = "id_alergia")
	private int id_alergia;
	
	@Column (name = "nombre_alergia")
	private String nombre_alergia;
	
	

	public int getId_alergia()
	{
		return id_alergia;
	}
	public void setId_alergia(int id_alergia)
	{
		this.id_alergia = id_alergia;
	}
	

	public String getNombre_alergia()
	{
		return nombre_alergia;
	}
	public void setNombre_alergia(String nombre_alergia)
	{
		this.nombre_alergia = nombre_alergia;
	}
	
	
	

}
