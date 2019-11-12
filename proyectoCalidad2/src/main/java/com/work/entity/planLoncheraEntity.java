package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "plan_loncheras") 
@JsonIgnoreProperties(ignoreUnknown = true )
public class planLoncheraEntity  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "id_plan")	
	private int id_plan;
	
	@Column (name = "id_loncheras")
	private String id_loncheras;
	
	@Column (name = "id_nombreplan")
	private String id_nombreplan;

	public int getId_plan() {
		return id_plan;
	}

	public void setId_plan(int id_plan) {
		this.id_plan = id_plan;
	}

	public String getId_loncheras() {
		return id_loncheras;
	}

	public void setId_loncheras(String id_loncheras) {
		this.id_loncheras = id_loncheras;
	}

	public String getId_nombreplan() {
		return id_nombreplan;
	}

	public void setId_nombreplan(String id_nombreplan) {
		this.id_nombreplan = id_nombreplan;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_loncheras == null) ? 0 : id_loncheras.hashCode());
		result = prime * result + ((id_nombreplan == null) ? 0 : id_nombreplan.hashCode());
		result = prime * result + id_plan;
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
		planLoncheraEntity other = (planLoncheraEntity) obj;
		if (id_loncheras == null) {
			if (other.id_loncheras != null)
				return false;
		} else if (!id_loncheras.equals(other.id_loncheras))
			return false;
		if (id_nombreplan == null) {
			if (other.id_nombreplan != null)
				return false;
		} else if (!id_nombreplan.equals(other.id_nombreplan))
			return false;
		if (id_plan != other.id_plan)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "planLoncheraEntity [id_plan=" + id_plan + ", id_loncheras=" + id_loncheras + ", id_nombreplan="
				+ id_nombreplan + ", getId_plan()=" + getId_plan() + ", getId_loncheras()=" + getId_loncheras()
				+ ", getId_nombreplan()=" + getId_nombreplan() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
