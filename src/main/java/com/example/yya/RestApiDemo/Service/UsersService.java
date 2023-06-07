package com.example.yya.RestApiDemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.yya.RestApiDemo.Models.Users;
import com.example.yya.RestApiDemo.Repository.UserRepository;

@Service
@Transactional
public class UsersService {
	@Autowired
	UserRepository userRepository;
	public List<Users> getAllUsers() {
		List<Users> users = userRepository.findAll();
		return users;
		}
	
		/*
		 * //display one student by id public Users getStudentById(int id) { return
		 * userRepository.findById(id); }
		 * 
		 * //save student in database public void saveStudent(Users student) { try{
		 * userRepository.save(student); } catch(Exception e){ e.printStackTrace(); } }
		 * //delete stuednt by id public void deleteStudent(int id) { try{
		 * userRepository.deleteById(id); }catch(Exception e){ e.printStackTrace(); } }
		 */
}
