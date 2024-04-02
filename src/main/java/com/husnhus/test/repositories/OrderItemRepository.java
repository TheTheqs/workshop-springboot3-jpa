package com.husnhus.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.husnhus.test.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
