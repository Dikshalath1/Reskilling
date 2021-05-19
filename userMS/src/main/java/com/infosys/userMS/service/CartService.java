package com.infosys.userMS.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.userMS.dto.CartDTO;
import com.infosys.userMS.entity.Cart;
import com.infosys.userMS.repository.CartRepository;

@Service
@Transactional
public class CartService{
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CartRepository cartRepository;
	
	
	public List<CartDTO> addItems(Cart cart) {
		cartRepository.save(cart);
		
		List<Cart> cartList = cartRepository.findAll();
		List<CartDTO> cartDTOList = new ArrayList<>();
		for(Cart item:cartList) {
			CartDTO cartDTO = CartDTO.valueOf(item);
			cartDTOList.add(cartDTO);
		}
		logger.info("cart items : {}", cartDTOList);
		return cartDTOList;
	}

}
