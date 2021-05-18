package com.infosys.infytel.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscribedproduct")
public class SubscribedProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int buyerId;
	@Column(nullable = false)
	int prodId;
	@Column(nullable = false)
	int quantity;
	// parameterless constructor
		public SubscribedProduct() {
			super();
		}
		//parameterized constructor
		public SubscribedProduct(int prodId, int buyerId ,int quantity) {
			super();
			this.prodId=prodId;
			this.buyerId=buyerId;
			this.quantity=quantity;
		}
		public int getBuyerId() {
			return buyerId;
		}
		public void setBuyerId(int buyerId) {
			this.buyerId = buyerId;
		}
		public int getProdId() {
			return prodId;
		}
		public void setProdId(int prodId) {
			this.prodId = prodId;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		

}
