package com.infosys.userMS.service;

import com.infosys.userMS.dto.SellerDTO;

public interface SellerService {

	public String registerSeller(SellerDTO sellerdto) throws Exception;
	public String loginSeller(String phoneNumber, String password) throws Exception;
}
