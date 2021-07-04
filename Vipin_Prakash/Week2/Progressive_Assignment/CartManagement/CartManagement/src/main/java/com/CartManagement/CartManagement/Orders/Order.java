package com.CartManagement.CartManagement.Orders;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Orders")
public class Order {
	@Id
	private String OrderId;
	private String date_created;
	private int Total_price;
	private String Custromer_Name;
	private String Type;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(String orderId, String date_created, int total_price, String custromer_Name, String type) {
		super();
		OrderId = orderId;
		this.date_created = date_created;
		Total_price = total_price;
		Custromer_Name = custromer_Name;
		Type = type;
	}
	
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}

	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public int getTotal_price() {
		return Total_price;
	}
	public void setTotal_price(int total_price) {
		Total_price = total_price;
	}
	
	
	public String getDate_created() {
		return date_created;
	}
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	
	public String getCustromer_Name() {
		return Custromer_Name;
	}
	public void setCustromer_Name(String custromer_Name) {
		Custromer_Name = custromer_Name;
	}
	
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", date_created=" + date_created + ", Custromer_Name=" + Custromer_Name + "]";
	}
	
	
}
