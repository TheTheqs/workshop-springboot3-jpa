package com.husnhus.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.husnhus.test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
