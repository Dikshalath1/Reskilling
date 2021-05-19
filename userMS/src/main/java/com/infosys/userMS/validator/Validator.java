package com.infosys.userMS.validator;

import com.infosys.userMS.dto.BuyerDTO;
import com.infosys.userMS.dto.SellerDTO;

public class Validator {
	
		public static Boolean validateRegisterUser(BuyerDTO buyerDto) throws Exception
		{
//			System.out.println(validatePhoneNo(buyerDto.getPhoneNumber()));
//			System.out.println(validatePassword(buyerDto.getPassword()));
//			System.out.println(validateName(buyerDto.getName()));
//			System.out.println(validateEmailId(buyerDto.getEmailId()));
//			
			if(!validatePhoneNo(buyerDto.getPhoneno()))
			{
				throw new Exception("UserValidator.Invalid_Phone_Number_Format");
			}
			if(!validatePassword(buyerDto.getPassword()))
			{
				throw new Exception("UserValidator.Invalid_Password_Format");
			}
			if(!validateName(buyerDto.getName()))
			{
				throw new Exception("UserValidator.Invalid_Name_Format");
			}
			if(!validateEmailId(buyerDto.getEmail()))
			{
				throw new Exception("UserValidator.Invalid_EmailId_Format");
			}
			return true;
		}
		
		public static Boolean validateRegisterSeller(SellerDTO sellerdto) throws Exception
		{
//			System.out.println(validatePhoneNo(buyerDto.getPhoneNumber()));
//			System.out.println(validatePassword(buyerDto.getPassword()));
//			System.out.println(validateName(buyerDto.getName()));
//			System.out.println(validateEmailId(buyerDto.getEmailId()));
//			
			if(!validatePhoneNo(sellerdto.getPhoneno()))
			{
				throw new Exception("UserValidator.Invalid_Phone_Number_Format");
			}
			if(!validatePassword(sellerdto.getPassword()))
			{
				throw new Exception("UserValidator.Invalid_Password_Format");
			}
			if(!validateName(sellerdto.getName()))
			{
				throw new Exception("UserValidator.Invalid_Name_Format");
			}
			if(!validateEmailId(sellerdto.getEmail()))
			{
				throw new Exception("UserValidator.Invalid_EmailId_Format");
			}
			return true;
		}
			public static Boolean validatePassword(String password)
			{
				if(password==null)
				{
					return false;
				}
				Boolean flag=false;
				if(password.length()>=7 && password.length()<=20)
				{
					if(password.matches(".*[A-Z]+.*"))
						if(password.matches(".*[a-z]+.*"))
							if(password.matches(".*[A-Z]+.*"))
								if(password.matches(".*[0-9]+.*"))
									if(password.matches(".*[!@#$%^&*]+.*"))
										flag=true;
					
						
				}
				return flag;
			}
			
			public static Boolean validatePhoneNo(String phoneNo)
			{
				if(phoneNo==null)
				{
					return false;
				}
				Boolean flag=false;
				if(phoneNo.matches("[6-9][0-9]{9}"))
					flag=true;
				return flag;
			}
			
			public static Boolean validateName(String name)
			{
				if(name==null || name.trim().length()!=name.length())
					return false;
				return name.matches("[A-Za-z ]+");
			}
			
			public static Boolean validateEmailId(String emailId)
			{
				if(emailId==null)
					return false;
				return emailId.matches("[A-Za-z]+@[A-za-z]+(.com)");
			}
			
			
		}

