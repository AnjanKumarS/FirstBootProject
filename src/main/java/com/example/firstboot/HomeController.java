package com.example.firstboot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/hi")
	public String hi() {
		System.out.println("hi Home Controller SOP");
		return "Hi Home Controller Return";
	}
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("hello Home Controller SOP");
		return "Hello Home Controller Return";
	}
	
	@RequestMapping("/save")
	public User save(@RequestBody User user) {
		return user;
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String user,@RequestParam String password) {
		System.out.println(user);
		System.out.println(password);
		return "Login Sucessfully";
	}
	
	@RequestMapping("/find")
	public Person findperson(@RequestBody Person person) {
		return person;
	}
}
