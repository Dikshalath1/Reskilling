package com.infosys.userMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.userMS.dto.BuyerDTO;
import com.infosys.userMS.dto.SellerDTO;
import com.infosys.userMS.service.SellerService;

@RestController
@RequestMapping("User")
public class SellerController {
	
	@Autowired
	SellerService sellerService;
	
	@PostMapping(value="/seller/register")
	public ResponseEntity<String> register(@RequestBody SellerDTO sellerdto){
		try {
		String message = sellerService.registerSeller(sellerdto)+"is registered successfully";
		return new ResponseEntity<>(message,HttpStatus.OK);
	}catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	

	@PostMapping(value="/seller/login")
	public ResponseEntity<String> login (@RequestBody BuyerDTO buyerdto) throws Exception{
		try
		{
		String message = sellerService.loginSeller(buyerdto.getPhoneno(),buyerdto.getPassword());
		return new ResponseEntity<String>(message,HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

}
