package com.work.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.work.entity.*;
import com.work.services.*;

@RestController
@Controller 
public class restController {
	
	@Autowired
	private userService usrS;
	@Autowired
	private planLoncheraService plnLoncheraServ;
	@Autowired
	private hijoService hijoS;
	
	/*Servicios Usuario*/
	
	@RequestMapping (value = "/addNewUsers", method = RequestMethod.POST)//Servicio de Registro
	public String addRequestUser(@RequestBody userEntity userNew)
	{
//		return "Servicio registro usuario"+userNew.getIdentificacion();
		
		usrS.save(userNew);
		
		if (userNew.isEmpty())
		{
            return "No se a creado correctamente el registro" + HttpStatus.BAD_REQUEST;
  
        }
        	return "se a creado correcto el registro " + HttpStatus.OK;
    }	
	
	@RequestMapping (value = "/getUser", method = RequestMethod.GET) // Servicio de login
	public ResponseEntity<userEntity>   getRequestUser(@RequestBody String correo)
	{	
//		return correo;
		
		//ResponseEntity<userEntity>
		ResponseEntity<userEntity> usuario = new ResponseEntity<>(usrS.find(correo),HttpStatus.OK);
		return usuario;

		
	}		
	/*Fin servicios usuario*/
	
	
	/*Servicios Registrar hijo*/
	
	@RequestMapping (value = "/addHijo", method = RequestMethod.POST)//Servicio de Registro
	public String addRequestHijo(@RequestBody hijoEntity userNew)
	{
	
		
		return "Servicio registro hijo"+userNew.getId_hijo();
//		
//		hijoS.save(userNew);
//		
//		if (userNew.isEmpty())
//		{
//            return "No se a creado correctamente el registro" + HttpStatus.BAD_REQUEST;
//  
//        }
//        	return "se a creado correcto el registro " + HttpStatus.OK;
		
    }	
	
	
	/*Fin servicios registro hijo*/
	
	/*Servicios registro de alergias*/
	
	
	
	 
	/*Fin servicios registro de alergias*/
	
	
	
	
	
	
	
	/*Sercicios Plan Lonchera*/
	
	@RequestMapping (value = "/addNewPlanLoncheras", method = RequestMethod.POST)
	public String addRequestPlnLonchera(@RequestBody planLoncheraEntity plnLonchera) {
		plnLoncheraServ.save(plnLonchera);
		if (plnLonchera.isEmpty()) {
            return "No se a creado correctamente el registro" + HttpStatus.BAD_REQUEST;
  
        }
        return "se a creado un nuevo plan de locnhera  " + HttpStatus.OK;
        }	
	
	@RequestMapping (value = "/getPlanLonchera", method = RequestMethod.GET)
	public ResponseEntity<Object> getPlanLonchera() {		
		return new ResponseEntity<>(plnLoncheraServ.listAll(),HttpStatus.OK);		
		
	}
	
}
