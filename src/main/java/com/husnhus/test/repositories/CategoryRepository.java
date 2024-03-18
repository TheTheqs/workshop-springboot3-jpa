package com.husnhus.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.husnhus.test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
