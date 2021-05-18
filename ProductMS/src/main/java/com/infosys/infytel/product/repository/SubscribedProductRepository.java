package com.infosys.infytel.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.product.entity.SubscribedProduct;

public interface SubscribedProductRepository extends JpaRepository<SubscribedProduct,Integer> {
	

}
