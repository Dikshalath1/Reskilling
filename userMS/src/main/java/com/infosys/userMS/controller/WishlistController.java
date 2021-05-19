package com.infosys.userMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.userMS.dto.WishlistDTO;
import com.infosys.userMS.service.WishlistService;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {
	@Autowired
	WishlistService wishlistservice;
	
	@PostMapping(value="/additem")
	public ResponseEntity<String> add(@RequestBody WishlistDTO wishlistdto){
		try {
		String message =wishlistservice.addItems(wishlistdto);
		return new ResponseEntity<>(message,HttpStatus.OK);
	}catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
//	
//	@GetMapping(value="/getitem/{id}")
//	public ResponseEntity<List<Integer>> getwishList(@PathVariable Integer id){
//		
//		List<Integer> prod =wishlistservice.getwishlist(id);
//		return new ResponseEntity<>(prod,HttpStatus.OK);
//		
//	}
	
	
	
	

}
