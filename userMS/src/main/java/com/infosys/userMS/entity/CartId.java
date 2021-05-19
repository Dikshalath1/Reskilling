package com.infosys.userMS.entity;

import java.io.Serializable;

public class CartId implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String buyerId;
	
	String prodId;
	
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getProdId() {
		return getProdId();
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
}
