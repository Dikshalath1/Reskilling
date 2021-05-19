package com.infosys.userMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "seller")
public class Seller {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, length=11)
	String sellerid;
	@Column(nullable = false, length=45)
	String name;
	@Column(nullable = false, length=45)
	String email;
	@Column(nullable = false, length=45)
	String phoneno;
	@Column(nullable = false, length=45)
	String password;
	@Column(length=1)
	String isactive;
	
	public Seller() {
		super();
	}

	public Seller(String sellerid, String name, String email, String phoneno, String password, String isactive) {
		super();
		this.sellerid = sellerid;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
		this.isactive = isactive;
	}
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String string) {
		this.sellerid = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIsactive() {
		return isactive;
	}
	public void setIsactive(String string) {
		this.isactive = string;
	}
	
	
	
	

}
