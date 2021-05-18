package com.infosys.infytel.product.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.infosys.infytel.product.dto.ProductDTO;

@Component
public class Validator {
	@Autowired
	Environment environment;
	
	public void validateProduct(ProductDTO product) throws Exception{
		if(!Valatename(product.getProductname())) {
			throw new Exception(environment.getProperty("Invalid_Name"));
		}
		if(!ValateDescription(product.getDescription())) {
			throw new Exception(environment.getProperty("Invalid_Description"));
		}
		if(!ValatePrice(product.getPrice())) {
			throw new Exception(environment.getProperty("Invalid_Price"));
		}
		if(!ValateStock(product.getStock())) {
			throw new Exception(environment.getProperty("Invalid_Stock"));
		}
		if(!ValateImage(product.getImage())) {
			throw new Exception(environment.getProperty("Invalid_Image"));
		}
	}

	private boolean Valatename(String productname) {
		// TODO Auto-generated method stub
		String regex="([A-Za-z]+\\s?)+[^@#$%^&*_!0-9]";
		if(productname.matches(regex)&& productname.length()<=100) {
			return true;
		}else
		return false;
	}

	private boolean ValateDescription(String description) {
		// TODO Auto-generated method stub
		if(description.length()<=500)
			return true;
		else
		return false;
	}

	private boolean ValatePrice(Double price) {
		// TODO Auto-generated method stub
		if(price>=200.0)
			return true;
		else
		return false;
	}
	private boolean ValateImage(String image) {
		// TODO Auto-generated method stub
		String regex="([http://]+[^\\s]+(\\.?i)(jpeg|png))$)";
		if(image.matches(regex)) {
			return true;
		}
		return false;
	}
	private boolean ValateStock(Integer stock) {
		// TODO Auto-generated method stub
		if(stock>10)
			return true;
		else
		return false;
	}

}
