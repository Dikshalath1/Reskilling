package com.infosys.userMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.infosys.userMS.entity.Cart;
import com.infosys.userMS.entity.CartId;

@Repository
public interface CartRepository extends JpaRepository<Cart,CartId >{
	

}
