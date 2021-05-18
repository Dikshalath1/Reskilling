package com.infosys.oms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.oms.dto.CartDTO;
import com.infosys.oms.dto.OrderDTO;
import com.infosys.oms.dto.ProductsOrderedDTO;
import com.infosys.oms.entity.Cart;
import com.infosys.oms.entity.CartId;
import com.infosys.oms.entity.ProductsOrdered;
import com.infosys.oms.repository.CartRepository;
import com.infosys.oms.repository.OrderRepository;
import com.infosys.oms.repository.ProductsOrderedRepository;

@Service
@Transactional
public class OrderService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	CartRepository cartRepo;
	
	@Autowired
	ProductsOrderedRepository productsOrderedRepository;
	
	// display all cart items
	public List<CartDTO> getCartItems(){
		List<Cart> cartList = cartRepo.findAll();
		List<CartDTO> cartDTOList = new ArrayList<>();
		for(Cart cart:cartList) {
			CartDTO cartDTO = CartDTO.valueOf(cart);
			cartDTOList.add(cartDTO);
		}
		logger.info("cart items : {}", cartDTOList);
		return cartDTOList;
		
	}
	
	
	// remove item from cart	
	public List<CartDTO> removeItem(String prodid) {
		cartRepo.deleteByProdId(prodid);
		List<Cart> cartList = cartRepo.findAll();
		List<CartDTO> cartDTOList = new ArrayList<>();
		for(Cart cart:cartList) {
			CartDTO cartDTO = CartDTO.valueOf(cart);
			cartDTOList.add(cartDTO);
		}
		logger.info("cart items : {}", cartDTOList);
		return cartDTOList;
//		if(item.isPresent()) {
//	    cartRepo.deleteById(prodId);;
//		}
//		List<Cart> cartList = cartRepo.findAll();
//		List<CartDTO> cartDTOList = new ArrayList<>();
//		for(Cart cart:cartList) {
//			CartDTO cartDTO = CartDTO.valueOf(cart);
//			cartDTOList.add(cartDTO);
//		}
//		logger.info("cart items : {}", cartDTOList);
//		return cartDTOList;
		
	}
	
	
	
	//Orders based on products
	public List<ProductsOrderedDTO> ordersByProduct(String prodId){
		List<ProductsOrdered> list =productsOrderedRepository.findByProdId(prodId);
		List<ProductsOrderedDTO> dtolist = new ArrayList<>();
		for(ProductsOrdered item:list) {
			ProductsOrderedDTO obj = new ProductsOrderedDTO();
			obj.setBuyerId(item.getBuyerId());
			obj.setProdId(item.getProdId());
			obj.setSellerId(item.getSellerId());
			obj.setQuantity(item.getQuantity());
			dtolist.add(obj);
		}
		
		return dtolist;
	}
	
	// Place an order
		public OrderDTO placeOrder() {
			
			
			return null;
			
		}
}
