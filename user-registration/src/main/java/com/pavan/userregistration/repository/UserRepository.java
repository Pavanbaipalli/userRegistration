package com.pavan.userregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.userregistration.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	//Custom finder method for login
	User findByUsername(String username);
}
