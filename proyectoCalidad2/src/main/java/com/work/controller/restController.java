package com.work.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.work.entity.userEntity;
import com.work.services.userService;


@RestController 
public class restController {
	
	@Autowired
	private userService usrS;
	
	
	@RequestMapping (value = "/addNewUsers", method = RequestMethod.POST)
	public String addRequestUser(@RequestBody userEntity userNew) {
		usrS.save(userNew);
		if (userNew.isEmpty()) {
            return "No se a creado correctamente el registro" + HttpStatus.BAD_REQUEST;
  
        }
        return "se a creado correctamente el registro " + HttpStatus.OK;
	}
	
	
	
	@RequestMapping (value = "/getUser", method = RequestMethod.GET)
	public ResponseEntity<Object> getRequestUser() {		
		return new ResponseEntity<>(usrS.listAll(),HttpStatus.OK);
	}
		
	
}