package com.infosys.oms.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CartId.class)
public class Cart  {
	@Id
	@Column(name="buyerid" , nullable = false)
	String buyerId;
	@Id
	@Column(name="prodid" , nullable = false)
	String prodId;
	@Column(name="quantity" , nullable = false)
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
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
