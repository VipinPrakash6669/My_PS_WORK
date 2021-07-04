package com.CartManagement.CartManagement.Services;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CartManagement.CartManagement.OrderRepository.IOrderRepository;
import com.CartManagement.CartManagement.OrderRepository.OrderRepository;
import com.CartManagement.CartManagement.Orders.Order;
import com.sapient.springsession.model.User;
import com.sapient.springsession.repository.IUserRepository;
@Service
//providing implementation
public class OrderService {
	@Autowired
    private OrderRepository orderRepository;

	@Autowired
    private IOrderRepository repository;

    public List<Order> fetchAllOrders() {

        List<Order> orders = orderRepository.fetchAllOrders();

        return orders;
    }
	public List<Order> fetchAllOrdersByType(String type) {
		
		List<Order> ordersByType = orderRepository.AllOrdersByType(type);

        return ordersByType;
	}
	public void addOrder(Order order) {
		orderRepository.addorder(order);
	}

    @Transactional
    public Order addUser(Order order){
        order.getAddress().stream().forEach(address -> address.setUser(order));
        Order save = repository.save(order);
        return save;
    }
	
}
