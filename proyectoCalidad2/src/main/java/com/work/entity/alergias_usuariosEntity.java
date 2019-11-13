package com.work.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity 
@Table( name = "alergias_usuarios" ) 
@JsonIgnoreProperties(ignoreUnknown = true )
public class alergias_usuariosEntity 
{
	
	
	@Id
	@Column (name = "id_usuario")
	private int id_usuario;
	
	@Column (name = "id_alergia")
	private int id_alergia;
	
	
	public int getId_usuario()
	{
		return id_usuario;
	}
	public void setId_usuario(int id_usuario)
	{
		this.id_usuario = id_usuario;
	}
	
	public int getId_alergia()
	{
		return id_alergia;
	}
	public void setId_alergia(int id_alergia)
	{
		this.id_alergia = id_alergia;
	}
	
	
	

}
