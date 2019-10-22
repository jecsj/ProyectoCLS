package com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.work.entity.usuarioEntity;

import com.work.services.*;



@RestController
public class restController {
	
	
	@Autowired
	private usuarioServicio userser;
	
	@RequestMapping (value = "/rest-usser", method = RequestMethod.POST)
	public ResponseEntity<Object> addRequestUser(@RequestBody usuarioEntity user) {
		userser.save(user);
		
		return new ResponseEntity<>("El usuario fue creado con exito", HttpStatus.CREATED);
		}	
	

}
