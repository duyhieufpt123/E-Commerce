package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.ecommerce.exception.OrderException;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.Address;
import com.ecommerce.model.Order;
import com.ecommerce.model.User;
import com.ecommerce.service.OrderService;
import com.ecommerce.service.UserService;

public class OrderController {

    @Autowired
    private OrderService orderService;

    private UserService userService;

    @PostMapping(value = "/")
    public ResponseEntity<Order> createOrder(
            @RequestBody Address shippingAddress,
            @RequestHeader("Authorization") String jwt) throws UserException {

        User user = userService.findUserProfileByJwt(jwt);

        Order order = orderService.createOrder(user, shippingAddress);

        System.out.println("Order " + order);

        return new ResponseEntity<Order>(order, HttpStatus.CREATED);
    }

    public ResponseEntity<List<Order>> usersOrderHistory(@RequestHeader("Authorization") String jwt)
            throws UserException {

        User user = userService.findUserProfileByJwt(jwt);

        List<Order> orders = orderService.usersOrderHistory(user.getId());

        return new ResponseEntity<List<Order>>(orders, HttpStatus.CREATED);
    }

    public ResponseEntity<Order> findOrderById(
            @PathVariable("Id") Long orderId,
            @RequestHeader("Authorization") String jwt) throws UserException, OrderException {
        User user = userService.findUserProfileByJwt(jwt);

        Order order = orderService.findOrderById(orderId);

        return new ResponseEntity<Order>(order, HttpStatus.CREATED);
    }
}