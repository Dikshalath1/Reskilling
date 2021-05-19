package com.infosys.userMS.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "cart")
@IdClass(CartId.class)
public class Cart  {

    @Id
    @Column(name="buyerid",nullable = false, length=11)
    private String buyerId;
    @Id
    @Column(name="prodid",nullable = false, length=11)
    private String prodId;
    
    @Column(nullable = false, length=11)
    private Integer quantity;

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