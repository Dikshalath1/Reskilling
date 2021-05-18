package com.infosys.oms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.oms.entity.Order;
import com.infosys.oms.entity.ProductsOrdered;
import com.infosys.oms.entity.ProductsOrderedId;
@Repository
public interface ProductsOrderedRepository extends JpaRepository<ProductsOrdered, ProductsOrderedId>{

//	@Query("")
	List<ProductsOrdered> findByProdId(String prodId);
	

}
