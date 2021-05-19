package com.infosys.userMS.entity;

import java.io.Serializable;

public class WishlistId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String buyerId;
	
	String productId;
	
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	

	
}
