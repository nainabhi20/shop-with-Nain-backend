package com.abhishek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
