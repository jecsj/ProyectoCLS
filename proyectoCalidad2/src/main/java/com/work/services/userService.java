package com.work.services;
import java.util.HashSet;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.work.entity.userEntity;
import com.work.repository.usuarioRepo;

@Service
public class userService {
	
	@Autowired
	private usuarioRepo userrepo;
	
	public userEntity find(String id){
		return userrepo.getOne(id);
	}
	public void save(userEntity user) {
		userrepo.save(user);
	}
	
	public void delete(String id) {
		userrepo.deleteById(id);
	}
	
	
}