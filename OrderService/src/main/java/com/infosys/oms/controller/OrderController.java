package com.infosys.oms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.oms.dto.CartDTO;
import com.infosys.oms.dto.ProductsOrderedDTO;
import com.infosys.oms.entity.CartId;
import com.infosys.oms.service.OrderService;

@RestController
@CrossOrigin
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderService orderService;

	@Autowired DiscoveryClient client;
	// display all cart items
	@GetMapping(value = "/cart", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CartDTO> getCartItems(){
		logger.info("Fetching cart items");
		return orderService.getCartItems();				
	}
	
	// remove item from cart
	@DeleteMapping(value = "/cart/{prodid}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<CartDTO> removeItem(@PathVariable String prodid){
//		CartId id = new CartId();
//		id.setBuyerId(buyerId);
//		id.setProdId(prodId);
		
//		logger.info("removing item of id {}", id);
		return orderService.removeItem(prodid);
	}
	
	//Orders based on products
	@GetMapping(value = "/seller/{productid}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsOrderedDTO> getOrdersByProducts(@PathVariable String productid){
		return orderService.ordersByProduct(productid);

	}
	
	@PostMapping(value = "/order",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String placeOrder() {
		
		return null;
		
	}
}
