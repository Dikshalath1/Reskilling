package com.infosys.infytel.product.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.product.entity.SubscribedProduct;

public interface SubscribedProductService extends JpaRepository<SubscribedProduct,Integer> {
	

}
