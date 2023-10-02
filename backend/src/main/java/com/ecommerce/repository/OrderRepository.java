package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT o FROM Order o WHERE o.user.id = :userId AND (o.orderStatus = 'Placed' OR o.orderStatus = 'Confirmed' OR o.orderStatus = 'Shipped' OR o.orderStatus = 'Delivered')")
    public List<Order> getUsersOrders(@Param("userId") Long userId);

}
