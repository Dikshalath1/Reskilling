package com.infosys.oms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.oms.entity.Cart;
import com.infosys.oms.entity.CartId;
@Repository
public interface CartRepository extends JpaRepository<Cart, CartId>{
//	@Query("delete from cart c where c.prodId= ?1")
	void deleteByProdId( String prodId);
	
}
