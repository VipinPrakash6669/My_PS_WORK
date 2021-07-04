package com.CartManagement.CartManagement.OrderRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CartManagement.CartManagement.Orders.Order;

import ch.qos.logback.core.net.SyslogOutputStream;

@Repository
public class OrderRepository {

	@Autowired
	Order orderByType1;
	
	private List<Order> orders = new ArrayList<>();
	private List<Order> OrdersByType = new ArrayList<>();
	

    @PostConstruct
    public void populateInitialData(){
        this.orders.add(new Order("Order-1", "01-01-2021", 10,"Customer-1","Electronics"));
        this.orders.add(new Order("Order-2", "02-01-2021", 10,"Customer-2","Clothing"));
        this.orders.add(new Order("Order-3", "03-01-2021", 10,"Customer-3","Clothing"));
        this.orders.add(new Order("Order-4", "04-01-2021", 10,"Customer-4","Electronics"));
        this.orders.add(new Order("Order-5", "05-01-2021", 10,"Customer-5","Electronics"));
        
    }
    
    public void addorder(Order order)
    {
    	orders.add(order);
    }
    public List<Order> fetchAllOrders() {
        return this.orders;
    }

	public List<Order> AllOrdersByType(String type) {
		for(Order orderByType1  : this.orders)
		{
			if(orderByType1.getType().equals(type))
			{
				OrdersByType.add(orderByType1);
			}
		}
		return OrdersByType;
	}
}
