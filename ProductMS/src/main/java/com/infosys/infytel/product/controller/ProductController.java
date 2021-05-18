package com.infosys.infytel.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.infosys.infytel.product.dto.ProductDTO;
import com.infosys.infytel.product.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductService productService;

	// Fetches all product details
	@GetMapping(value="/api/product", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductDTO> getAllProducts() throws Exception{
		logger.info("Fetching all product");
		return productService.getAllProduct();
	}
	@GetMapping(value = "/api/productid/{prodId}",produces = MediaType.APPLICATION_JSON_VALUE)
    	public List<ProductDTO> getProductById(@PathVariable String prodId) throws Exception {
 		logger.info("Fetching details of productId {}",prodId);
		return productService.getProductByProductId(prodId);
	}
	// Fetch plan details of a specific plan
	@GetMapping(value = "/api/product/{productName}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductDTO> getProductByName(@PathVariable String productName) throws Exception {
		logger.info("Fetching details of productName {}",productName);
		return productService.getProductByProductName(productName);
	}
	// Fetch plan details of a specific plan
		@GetMapping(value = "/api/productCategory/{category}",produces = MediaType.APPLICATION_JSON_VALUE)
		public List<ProductDTO> getoductsByCategory(@PathVariable String category) throws Exception{
			logger.info("Fetching details of productCategory {}",category);
			return productService.getProductByCategory(category);
		}
		// add item
		@PostMapping(value="/api/product/add")
		public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO){
		logger.info(" Add for product",productDTO);
		ResponseEntity<String>response;
		String successMessage="Product added";
		String errorMessage="doplicate product found";
		try {
			productService.addProduct(productDTO);
			response = new ResponseEntity<String>(successMessage,HttpStatus.CREATED);
		}catch(Exception e) {
			response = new ResponseEntity<String>(successMessage,HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
		@DeleteMapping(value="/api/product/{product}/remove")
		public ResponseEntity<String> removeProduct(@PathVariable String productid){
			logger.info("Remove request for product",productid);
			ResponseEntity<String>response;
			String successMessage="Product remove";
			String errorMessage="NO such product found";
			if(productService.removeProduct(productid)) {
				response = new ResponseEntity<String>(successMessage,HttpStatus.OK);
			}else {
				response = new ResponseEntity<String>(errorMessage, HttpStatus.BAD_REQUEST);
			}
			return response;
		}
		
//		@PutMapping(value="/wishList",produces = MediaType.APPLICATION_JSON_VALUE)
//		public List<ProductDTO> updateItem(@PathVariable String prodid){
//			logger.info("update item of id{}",prodid);
//			return ProductService.updateProduct(prodid);
//		}
		

}
	
