// package com.ecommerce.service.impl;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.ecommerce.exception.OrderException;
// import com.ecommerce.model.Address;
// import com.ecommerce.model.Order;
// import com.ecommerce.model.User;
// import com.ecommerce.repository.CartRepository;
// import com.ecommerce.service.CartItemService;
// import com.ecommerce.service.CartService;
// import com.ecommerce.service.OrderService;
// import com.ecommerce.service.ProductService;

// @Service
// public class OrderServiceImpl implements OrderService {

// @Autowired
// private CartRepository CartRepository;
// private CartService cartService;
// private ProductService productService;

// public OrderServiceImpl(CartRepository CartRepository, CartItemService
// cartItemService,
// ProductService productService) {
// this.CartRepository = CartRepository;
// this.cartService = cartService;
// this.productService = productService;
// }

// @Override
// public Order createOrder(User user, Address shippingAddress) {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'createOrder'");
// }

// @Override
// public List<Order> getAllOrders() {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'getAllOrders'");
// }

// @Override
// public Order findOrderById(Long orderId) throws OrderException {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'findOrderById'");
// }

// @Override
// public List<Order> usersOrderHistory(Long userId) {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'usersOrderHistory'");
// }

// @Override
// public Order placedOrder(Long orderId) throws OrderException {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'placedOrder'");
// }

// @Override
// public Order confirmedOrder(Long orderId) throws OrderException {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'confirmedOrder'");
// }

// @Override
// public Order shippedOrder(Long orderId) throws OrderException {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'shippedOrder'");
// }

// @Override
// public Order deliveredOrder(Long orderId) throws OrderException {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'deliveredOrder'");
// }

// @Override
// public Order canceledOrder(Long orderId) throws OrderException {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'canceledOrder'");
// }

// @Override
// public Order deleteOrder(Long orderId) throws Exception {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'deleteOrder'");
// }

// }
