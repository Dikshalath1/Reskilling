package com.infosys.userMS.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

	@Entity
	@Table(name = "wishlist")
	@IdClass(WishlistId.class)
	public class Wishlist {

	    @Id
	    @Column (name="buyerid")
	   String buyerId;
	    @Id
	    @Column(nullable = false, name="prodid")
	    String productId;
	    

	    public Wishlist() {
	    }

	    public Wishlist(String buyerid, String prodid) {
	        this.buyerId = buyerid;
	        this.productId = prodid;
	    }

		public String getBuyerid() {
			return buyerId;
		}

		public void setBuyerid(String buyerid) {
			this.buyerId = buyerid;
		}

		public String getProdid() {
			return productId;
		}

		public void setProdid(String prodid) {
			this.productId = prodid;
		}
	    
	}

