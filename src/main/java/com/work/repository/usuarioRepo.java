package com.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.entity.usuarioEntity;


@Repository
public interface usuarioRepo extends JpaRepository<usuarioEntity, String>{

}
