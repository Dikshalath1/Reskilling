package com.infosys.infytel.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.infosys.infytel.product.Validator.Validator;
import com.infosys.infytel.product.dto.ProductDTO;
import com.infosys.infytel.product.entity.Product;
import com.infosys.infytel.product.repository.ProductRepository;
import com.infosys.infytel.product.repository.SubscribedProductRepository;

@Service
@Transactional
public class ProductService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductRepository productRepository;

	@Autowired
	SubscribedProductRepository subscribedproductRepo;
	
	@Autowired  
    Validator validator;
	
	@Autowired
	Environment environment;
	
	// Fetches all product details
	public List<ProductDTO> getAllProduct() throws Exception{
		System.out.println("Service");
		List<Product>products = productRepository.findAll();
	
		List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
		for(Product product:products) {
			ProductDTO productDTO = ProductDTO.valueOf(product);
			productDTOs.add(productDTO);
		}
		logger.info("Product details :{}", productDTOs);
		return productDTOs;
	}
	// Fetch product by Category
	 public List<ProductDTO> getProductByCategory(@PathVariable String category) throws Exception{
		 List<Product>products = productRepository.findByCategory(category);
		 List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
		 
		 for(Product product:products) {
			 productDTOs.add(ProductDTO.valueOf(product));
		 }
		 logger.info("Product details on base of category :{}", productDTOs);
			return productDTOs;
	 }
	// Fetch product by productName
		 public List<ProductDTO> getProductByProductName(@PathVariable String productName) throws Exception{
			 List<Product>products = productRepository.findByProductName(productName);
			 List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
			 
			 for(Product product:products) {
				 productDTOs.add(ProductDTO.valueOf(product));
			 }
			 logger.info("Product details on base of Name :{}", productDTOs);
				return productDTOs;
		 }
		// Fetch product by productId
				 public List<ProductDTO> getProductByProductId(@PathVariable String productId) throws Exception{
					 List<Product>products = productRepository.findByProdId(productId);
					 List<ProductDTO> productDTO = new ArrayList<ProductDTO>();
					 
					 for(Product product:products) {
						 productDTO.add(ProductDTO.valueOf(product));
					 }
					 logger.info("Product details on base of product Id :{}", productDTO);
						return productDTO;
				 }
		 // Add item from cart
				 public void addProduct(ProductDTO productDTO) throws Exception{
					 validator.validateProduct(productDTO);
					 List<Product> product = productRepository.findByProductName(productDTO.getProductname());
					 if(product.isEmpty()) {
						 Product products=productDTO.createEntity();
						 productRepository.save(products);
					 }else {
						 throw new Exception(environment.getProperty("Product already exits"));
					 }
				 }
			// Remove item by product ID
				 public boolean removeProduct(String productid) {
					 Optional<Product> product = productRepository.findById(productid);
					 if(product.isPresent()) {
						 Product product1= product.get();
						 productRepository.delete(product1);
						 return true;
					 }else {
						 return false;
					 }
				 }
				 
//				// Remove item buyerId
//				 public boolean removeProduct(String buyerid) {
//					 Optional<Product> product = productRepository.findById(buyerid);
//					 if(product.isPresent()) {
//						 Product product1= product.get();
//						 productRepository.delete(product1);
//						 return true;
//					 }else {
//						 return false;
//					 }
//				 }
//			//update item
//				 public boolean updateProduct(Integer productId) {
//					 Optional<Product> product = productRepository.findById(productId);
//					 if(product.isPresent()) {
//						 Product product1= product.get();
//						 productRepository.update(product1);
//						 return true;
//					 }else {
//						 return false;
//					 }
//				 }



}
