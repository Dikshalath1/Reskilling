package com.infosys.userMS.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infosys.userMS.dto.BuyerDTO;
import com.infosys.userMS.entity.Buyer;
import com.infosys.userMS.repository.BuyerRepository;
import com.infosys.userMS.validator.Validator;

@Service
@Transactional
public class BuyerServiceImpl implements BuyerService{
	
	@Autowired
	BuyerRepository buyerRepository;
	
	public String registerUser(BuyerDTO buyerdto) throws Exception {
		try {
		Validator.validateRegisterUser(buyerdto);
		Buyer buyer=new Buyer();
		buyer.setEmail(buyerdto.getEmail());
		buyer.setName(buyerdto.getName());
		buyer.setPhoneno(buyerdto.getPhoneno());
		buyer.setPassword(buyerdto.getPassword());
		buyer.setIsprivileged(buyerdto.getIsprivileged());
		buyer.setIsactive(buyerdto.getIsactive());
		buyer.setRewardpoints(buyerdto.getRewardpoints());
		buyerRepository.save(buyer);
		return buyerdto.getName();
		}catch(Exception e)
		{
			//return e.getMessage();
			throw e;
		}
	}

	@Override
	public String loginBuyer(String phoneNumber, String password) throws Exception {
		try {
		Buyer buyer=buyerRepository.findByPhoneno(phoneNumber);
		if(buyer==null)
		{
			throw new Exception("Invalid Credentials");
		}
		String passwd=buyer.getPassword();
		if(passwd!=null)
		{
			if(passwd.equals(password))
			{
				return "Login succssfully done";
			}
			
		}
		
		}catch(Exception e)
		{
			throw e;
		}
		return "Login successfully done";
		
	}
}
