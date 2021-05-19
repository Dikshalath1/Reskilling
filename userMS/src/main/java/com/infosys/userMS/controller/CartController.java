
package com.infosys.userMS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.userMS.dto.CartDTO;
import com.infosys.userMS.entity.Cart;
import com.infosys.userMS.service.CartService;

@RestController
@CrossOrigin
public class CartController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CartService cartService;
	
	@PostMapping(value = "/addcart", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CartDTO> getCartItems(@RequestBody Cart cart){
		logger.info("adding wishlist items to cart");
		return cartService.addItems(cart);		
	}
}
