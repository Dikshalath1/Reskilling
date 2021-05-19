package com.infosys.userMS.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.userMS.dto.SellerDTO;
import com.infosys.userMS.entity.Seller;
import com.infosys.userMS.repository.SellerRepository;
import com.infosys.userMS.validator.Validator;

@Service
@Transactional
public class SellerServiceImpl implements SellerService{

	@Autowired
	SellerRepository sellerRepo;
	@Override
	public String registerSeller(SellerDTO sellerdto)throws Exception {
		// TODO Auto-generated method stub
		try {
		Validator.validateRegisterSeller(sellerdto);
		Seller seller=new Seller();
		seller.setEmail(sellerdto.getEmail());
		seller.setName(sellerdto.getName());
		seller.setPassword(sellerdto.getPassword());
		seller.setPhoneno(sellerdto.getPhoneno());
		seller.setIsactive(sellerdto.getIsactive());
		sellerRepo.save(seller);
		return sellerdto.getName();
	}catch(Exception e)
		{
		throw e;
		}
	}
	
	@Override
	public String loginSeller(String phoneNumber, String password) throws Exception {
		try {
		Seller buyer=sellerRepo.findByPhoneno(phoneNumber);
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