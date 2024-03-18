package com.husnhus.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.husnhus.test.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
