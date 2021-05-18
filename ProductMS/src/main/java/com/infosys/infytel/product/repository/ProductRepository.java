package com.infosys.infytel.product.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.infytel.product.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
	
	List<Product> findByCategory(String category);
	List<Product> findByProductName(String productName);
	List<Product> findByProdId(String prodId);

}
