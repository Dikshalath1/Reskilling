package com.infosys.oms.dto;

import com.infosys.oms.entity.ProductsOrdered;

public class ProductsOrderedDTO {
	String buyerId;
	String prodId;
	String sellerId;
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

	//Converts Entity into DTO
	public static ProductsOrderedDTO valueOf(ProductsOrdered productsOrdered) {
		ProductsOrderedDTO productsOrderedDTO = new ProductsOrderedDTO();
		productsOrderedDTO.setBuyerId(productsOrdered.getBuyerId());
		productsOrderedDTO.setProdId(productsOrdered.getProdId());
		productsOrderedDTO.setQuantity(productsOrdered.getQuantity());
		productsOrderedDTO.setSellerId(productsOrdered.getSellerId());
		
		return productsOrderedDTO;
	}
	@Override
	public String toString() {
		return "ProductsOrderedDTO [buyerId=" + buyerId + ", prodId=" + prodId + ", sellerId=" + sellerId
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
