package com.sky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sky.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
