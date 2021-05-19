
package com.infosys.userMS.dto;

import com.infosys.userMS.entity.Wishlist;

public class WishlistDTO {

		String buyerid;
		
		String productId;
		

		public String getBuyerid() {
			return buyerid;
		}

		public void setBuyerid(String buyerid) {
			this.buyerid = buyerid;
		}

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public WishlistDTO() {
			super();
		}

		public WishlistDTO(String buyerid, String prodid) {
			this();
			this.buyerid = buyerid;
			
			
		}



		// Converts Entity into DTO
		public static WishlistDTO valueOf(Wishlist wishlist) {
			WishlistDTO wishlistDTO = new WishlistDTO();
			wishlistDTO.setBuyerid(wishlist.getBuyerid());
			wishlistDTO.setProductId(wishlist.getProdid());
			return wishlistDTO;
		}

		public Wishlist createEntity() {
			Wishlist wishlist = new Wishlist();
			wishlist.setBuyerid(this.getBuyerid());
			wishlist.setProdid(this.getProductId());
			return wishlist;
		}
		
		@Override
		public String toString() {
			return "WishlistDTO [buyerid=" + buyerid + ", prodid=" +productId + "]";
		}

	}

