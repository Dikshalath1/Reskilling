package com.infosys.userMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.infosys.userMS.dto.BuyerDTO;
import com.infosys.userMS.service.BuyerService;


@RestController
@RequestMapping("User")
public class BuyerController {
	@Autowired
	BuyerService buyerService;
	
	@Autowired
	Environment environment;
	
	@PostMapping(value="/buyer/register")
	public ResponseEntity<String> register(@RequestBody BuyerDTO buyerdto) throws Exception{
		try
		{
		String message = buyerService.registerUser(buyerdto)+"is registered successfully";
		return new ResponseEntity<>(message,HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(value="/buyer/login")
	public ResponseEntity<String> login (@RequestBody BuyerDTO buyerdto) throws Exception{
		try
		{
		String message = buyerService.loginBuyer(buyerdto.getPhoneno(),buyerdto.getPassword());
		return new ResponseEntity<String>(message,HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	
}
}