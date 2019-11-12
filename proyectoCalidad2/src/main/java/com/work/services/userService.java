package com.work.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.entity.userEntity;
import com.work.repository.usuarioRepo;

@Service
public class userService {
	
	@Autowired
	private usuarioRepo userrepo;
	
	public List<userEntity> listAll(){
		return userrepo.findAll();
	}
	public void save(userEntity user) {
		userrepo.save(user);
	}
	
	public void delete(String id) {
		userrepo.deleteById(id);
	}
}