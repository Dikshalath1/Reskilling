package com.infosys.infytel.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,name = "Prodid")
	String prodId;
	@Column(nullable = false , name="Productname")
	String productName;
	@Column(nullable = false)
	Double price;
	@Column(nullable = false) 
	Integer stock;
	@Column(nullable = false, name="descr")
	String description;
	@Column(nullable = false)
	String image;
	@Column(nullable = false,name="sellerid")
	Integer sellerId;
	@Column(nullable = false)
	String category;
	@Column(nullable = false , name= "subcategory")
	String subCategory;
	@Column(nullable = false ,name= "productrating")
	Integer rating;
	
	
	// parameterless constructor
	public Product() {
		super();
	}
	
	

	
	//getter and setter
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	
	

	
}
