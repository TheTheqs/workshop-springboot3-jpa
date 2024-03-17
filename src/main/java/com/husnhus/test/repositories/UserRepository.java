package com.husnhus.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.husnhus.test.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
