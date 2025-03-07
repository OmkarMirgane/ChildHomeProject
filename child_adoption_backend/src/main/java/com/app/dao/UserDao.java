package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.User;

public interface UserDao extends JpaRepository<User, Long>{
	User findByEmailAndPassword(String email,String password);
	Optional<User> findByEmail(String email);
}
