package com.infosys.infytel.product.dto;

import com.infosys.infytel.product.entity.SubscribedProduct;

public class SubscribedProductDTO {
	Integer prodId;
	Integer buyerId;
	Integer quantity;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public static SubscribedProductDTO valueOf(SubscribedProduct subscribedproduct, SubscribedProductDTO SubscribedProductDTO) {
		SubscribedProductDTO subscribedProductDTO= new SubscribedProductDTO();
		subscribedProductDTO.setProdId(subscribedproduct.getProdId());
		subscribedProductDTO.setBuyerId(subscribedproduct.getBuyerId());
		subscribedProductDTO.setQuantity(subscribedproduct.getQuantity());
		return subscribedProductDTO;
		}

	@Override
	public String toString() {
		return "SubscribedProductDTO [ prodId=" + prodId + "  , buyerId=" + buyerId + " ,quantity=" + quantity +  "]";
	}
}
