package com.CartManagement.CartManagement.OrderRepository;

import org.springframework.data.repository.CrudRepository;

import com.CartManagement.CartManagement.Orders.Order;

public interface IOrderRepository extends CrudRepository<Order, Long> {

}
