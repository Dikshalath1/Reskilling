package com.infosys.userMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.infosys.userMS.entity.Seller;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Integer> {
	public Seller findByPhoneno(String phoneNumber);

}
