package com.infosys.oms.dto;

import java.time.LocalDate;

import com.infosys.oms.entity.Order;

public class OrderDTO {
	String orderId;
	String buyerId;
	Integer amount;
	LocalDate orderDate;
	String address;
	String orderStatus;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	// Converts Entity into DTO
	public static OrderDTO valueOf(Order order) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderId(order.getOrderId());
		orderDTO.setBuyerId(order.getBuyerId());
		orderDTO.setAmount(order.getAmount());
		orderDTO.setOrderDate(order.getOrderDate());
		orderDTO.setAddress(order.getAddress());
		orderDTO.setOrderStatus(order.getOrderStatus());
		return orderDTO;		
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", buyerId=" + buyerId + ", amount=" + amount + ", orderDate="
				+ orderDate + ", address=" + address + ", orderStatus=" + orderStatus + "]";
	}
	
	
}
