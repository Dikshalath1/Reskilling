
package com.infosys.userMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.infosys.userMS.entity.Wishlist;
import com.infosys.userMS.entity.WishlistId;



@Repository
public interface WishlistRepository extends CrudRepository<Wishlist,WishlistId>{
	//public List<Integer> findByBuyerId(String buyerId);

}