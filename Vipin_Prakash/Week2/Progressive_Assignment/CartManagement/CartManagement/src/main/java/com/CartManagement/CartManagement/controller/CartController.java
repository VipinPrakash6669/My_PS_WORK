package com.CartManagement.CartManagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CartManagement.CartManagement.Orders.Order;
import com.CartManagement.CartManagement.Services.OrderService;
import com.sapient.springsession.model.User;

import java.util.List;

@RestController
public class CartController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/home")
	public String home()
	{
		return "Manage Your Cart with this App";
	}
	//@PostMapping()
	
	@GetMapping("/order")
    public ResponseEntity<List<Order>> showListOfProducts(){
        List<Order> orders =orderService.fetchAllOrders();
        return new ResponseEntity(orders, HttpStatus.OK);
    }
	
	@GetMapping("/order/{Type}")
    public ResponseEntity<Object> fetchTheDetailOfSpecificProductByType
    (@PathVariable("Type") String type){
		List<Order> orders =orderService.fetchAllOrdersByType(type);
		if(orders.size()!=0)
        return new ResponseEntity(orders, HttpStatus.OK);
		else
		{
			String str="No Items of This Category";
			return new ResponseEntity(str, HttpStatus.OK); 
		}
    }
	
	@PostMapping("/add")
    public ResponseEntity addOrder( @RequestBody Order order){
        orderService.addOrder(order);
        return new ResponseEntity("Order has been Placed successfully", HttpStatus.CREATED);

    }
	
	@PostMapping("/add-order")
    public ResponseEntity addNewOrder(@RequestBody Order order){
		Order Savedorder = orderService.addNewOrder(order);
        return new ResponseEntity(Savedorder, HttpStatus.OK);
    }
}
