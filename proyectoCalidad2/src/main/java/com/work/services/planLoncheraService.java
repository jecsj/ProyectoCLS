package com.work.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.entity.planLoncheraEntity;
import com.work.entity.userEntity;
import com.work.repository.planLoncheraRepo;;

@Service
public class planLoncheraService {
	@Autowired
	private planLoncheraRepo loncheraRepo;
	
	public List<planLoncheraEntity> listAll(){
		return loncheraRepo.findAll();
	}
	public void save(planLoncheraEntity lonchera) {
		loncheraRepo.save(lonchera);
	}
	
	public void delete(String id) {
		loncheraRepo.deleteById(id);
	}
}
