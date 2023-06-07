package com.example.yya.RestApiDemo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.yya.RestApiDemo.Models.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	List<Users> findAll();
	
	Users findById(int id);
	
	int deleteById(int id);

	

}
