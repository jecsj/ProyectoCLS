package com.work.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.work.entity.alergias_usuariosEntity;
import com.work.repository.alergias_usuariosRepo;

@Service
public class alergiaService {

	
		@Autowired
		private alergias_usuariosRepo alergiasRepo;
		
		
		public void save(alergias_usuariosEntity alergias_usuariosRe) 
		{
			alergiasRepo.save(alergias_usuariosRe);
		}
		
	
	
}
