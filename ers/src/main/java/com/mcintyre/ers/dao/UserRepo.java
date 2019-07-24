package com.mcintyre.ers.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mcintyre.ers.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByUsernameOrEmail(String username, String email);
	
}