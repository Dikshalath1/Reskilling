package com.infosys.oms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ProductsOrderedId.class)
@Table(name = "productsordered")
public class ProductsOrdered {
	@Id
	@Column(name="buyerid", nullable = false)
	String buyerId;
	
	@Id
	@Column(name="prodid", nullable = false)
	String prodId;
	@Column(name="sellerid", nullable = false)
	String sellerId;
	@Column(name="quantity", nullable = false)
	Integer quantity;
	
	
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}
