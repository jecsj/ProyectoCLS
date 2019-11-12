package com.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.entity.userEntity;

@Repository
public interface usuarioRepo extends JpaRepository<userEntity, String>{

}
