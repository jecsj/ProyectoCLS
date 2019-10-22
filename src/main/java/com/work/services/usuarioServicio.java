package com.work.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.repository.usuarioRepo;
import com.work.entity.usuarioEntity;;

@Service
public class usuarioServicio {

	
	
	@Autowired
	private usuarioRepo repo ;
	
	
	public List<usuarioEntity> listAll(){
		return repo.findAll();
	}
	
	public void save(usuarioEntity user) {
		repo.save(user);
		
	}
		
	public void delete(String id) {
		repo.deleteById(id);
	}
	
	
}
