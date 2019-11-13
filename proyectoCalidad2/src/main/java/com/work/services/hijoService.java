package com.work.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.work.entity.hijoEntity;
import com.work.repository.hijoRepo;
import com.work.repository.usuarioRepo;

@Service
public class hijoService
{

	@Autowired
	private hijoRepo hijorepo;
	
	
	public void save(hijoEntity hijo) 
	{
		hijorepo.save(hijo);
	}
	
	
}
