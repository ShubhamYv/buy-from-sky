package com.sky.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sky.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
