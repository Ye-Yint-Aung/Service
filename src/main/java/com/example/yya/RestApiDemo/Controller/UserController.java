package com.example.yya.RestApiDemo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.yya.RestApiDemo.Models.Users;
import com.example.yya.RestApiDemo.Repository.UserRepository;

@Controller
public class UserController {

	@Autowired
    UserRepository userRepository;
	
	@RequestMapping(value="/ping", method=RequestMethod.GET)
	@ResponseBody
	public String healthCheck() {
	return "This is working well";
	}
	
	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	@ResponseBody
	public List<Users> getAllStudents() {
		
	return userRepository.findAll();
	}
	
//	@RequestMapping(value="/findstudent", method = RequestMethod.GET)
//	@ResponseBody
//	public Users findStudent(@RequestParam("studentId") int studentId) {
//	return studentRepository.findById(studentId);
//	}
//
//	@RequestMapping(value= "/updatestudent", method = RequestMethod.GET)
//	@ResponseBody
//	public Users updateStudent(@RequestBody Users student){
//	return studentRepository.save(student);
//	}
//
//	@RequestMapping(value="/deletestudent", method = RequestMethod.GET)
//	@ResponseBody
//	public int deleteStudent(@RequestParam("studentId") int studentId) {
//	return studentRepository.deleteById(studentId);
//	}



}
