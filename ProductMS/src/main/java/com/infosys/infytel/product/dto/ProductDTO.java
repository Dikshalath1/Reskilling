package com.infosys.infytel.product.dto;

import com.infosys.infytel.product.entity.Product;

public class ProductDTO {

	String prodId;
	String productName;	
	Double price;
	Integer stock;
	String description;
	String image;
	Integer sellerId;
	String category;
	String subCategory;
	Integer rating;
	
	
	public String getProductname() {
		return productName;
	}
	public void setProductname(String productname) {
		this.productName = productname;
	}
	public String getProdid() {
		return prodId;
	}
	public void setProdid(String prodid) {
		this.prodId = prodid;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getSellerid() {
		return sellerId;
	}
	public void setSellerid(Integer sellerid) {
		this.sellerId = sellerid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subCategory;
	}
	public void setSubcategory(String subcategory) {
		this.subCategory = subcategory;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	// Converts Entity into DTO
	public static ProductDTO valueOf(Product product) {
		ProductDTO productDTO= new ProductDTO();
		productDTO.setProdid(product.getProdId());
		productDTO.setProductname(product.getProductName());
		productDTO.setPrice(product.getPrice());
		productDTO.setStock(product.getStock());
		productDTO.setDescription(product.getDescription());
		productDTO.setImage(product.getImage());
		productDTO.setSellerid(product.getSellerId());
		productDTO.setCategory(product.getCategory());
		productDTO.setSubcategory(product.getSubCategory());
		productDTO.setRating(product.getRating());
		return productDTO;
	}
	//convert dto to entity
	public Product createEntity() {
		Product product= new Product();
		product.setProdId(this.getProdid());
		product.setProductName(this.getProductname());
		product.setPrice(this.getPrice());
		product.setStock(this.getStock());
		product.setDescription(this.getDescription());
		product.setImage(this.getImage());
		product.setSellerId(this.getSellerid());
		product.setCategory(this.getCategory());
		product.setSubCategory(this.getSubcategory());
		product.setRating(this.getRating());
		return product;
		
	}
	@Override
	public String toString() {
		return "ProductDTO [ prodId=" + prodId + "  , category=" + category + " , description="
				+ description + " , image="+ image + " , price=" + price +" , productName=" + productName + " , rating=" 
				+ rating +" , sellerId=" + sellerId + ", stock=" + stock + " , subCategory=" + subCategory + "]";
	}


}
