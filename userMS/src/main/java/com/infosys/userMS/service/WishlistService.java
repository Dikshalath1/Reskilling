package com.infosys.userMS.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.userMS.dto.WishlistDTO;
import com.infosys.userMS.entity.Wishlist;
import com.infosys.userMS.repository.WishlistRepository;
//enter

@Service
@Transactional
public class WishlistService {

	@Autowired
	WishlistRepository wishlistrepository;
	
	public String addItems(WishlistDTO wishlist) {
		// TODO Auto-generated method stub
		Wishlist wishlisten=new Wishlist();
		wishlisten.setBuyerid(wishlist.getBuyerid());
		wishlisten.setProdid(wishlist.getProductId());
		wishlistrepository.save(wishlisten);
		
		return "product is Successfuly added";
	}
//	@Override
//	public List<Integer> getwishlist(Integer id) {
//		List<Integer> list=wishlistrepository.findByBuyerId(id);
//		return list;
	}