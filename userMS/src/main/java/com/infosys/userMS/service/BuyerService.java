package com.infosys.userMS.service;

import com.infosys.userMS.dto.BuyerDTO;

public interface BuyerService {
	public String registerUser(BuyerDTO buyerdto) throws Exception;
	public String loginBuyer(String phoneNumber,String password) throws Exception;
}
