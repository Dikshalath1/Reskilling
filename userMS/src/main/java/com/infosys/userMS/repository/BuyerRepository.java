package com.infosys.userMS.repository;


import org.springframework.data.repository.CrudRepository;

import com.infosys.userMS.entity.Buyer;


public interface BuyerRepository extends CrudRepository<Buyer,Integer>{
	public Buyer findByPhoneno(String phoneNumber);
	
}