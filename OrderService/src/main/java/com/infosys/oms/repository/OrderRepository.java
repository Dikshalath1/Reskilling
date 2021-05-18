package com.infosys.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.oms.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, String>{
	
}
