
package com.infosys.userMS.dto;

import com.infosys.userMS.entity.Cart;

public class CartDTO {

	String buyerId;	
	String prodId;	
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

	// Converts Entity into DTO
	public static CartDTO valueOf(Cart cart) {
		CartDTO cartDTO = new CartDTO();
		cartDTO.setBuyerId(cart.getBuyerId());
		cartDTO.setProdId(cart.getProdId());
		cartDTO.setQuantity(cart.getQuantity());
		return cartDTO;
	}

	// Converts DTO into Entity
				public Cart createEntity() {
					Cart cart = new Cart();
					cart.setBuyerId(this.getBuyerId());
					cart.setProdId(this.getProdId());
					cart.setQuantity(this.getQuantity());
					return cart;
				}
	
				@Override
				public String toString() {
					return "CartDTO [buyerId=" + buyerId + ", prodId=" + prodId + ", quantity=" + quantity + "]";
				}
}