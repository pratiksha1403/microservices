package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/user/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> createUser(@Valid @RequestBody User user)
	{
		return new ResponseEntity<User>(userService.createUser(user),HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/user/read/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<User>> readData()
	{
		return new ResponseEntity<List<User>>(userService.readAllUser(),HttpStatus.OK);
	}
	
	@PutMapping(value = "/user/update",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User>updateUserData(@RequestBody User user)
	{
		return new ResponseEntity<User>(userService.updateUser(user),HttpStatus.OK);		
	}
	
	@DeleteMapping(value = "/user/delete/{id}")
	public ResponseEntity<Void>deleteUserData(@PathVariable("id") Long id)
	{
		userService.deleteUserById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping(value = "/user/read/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<User>> readUserById(@PathVariable("id") Long id)
	{
		return new ResponseEntity<Optional<User>>(userService.readUserById(id),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/user/delete/all")
	public ResponseEntity<Void>deleteAllUser(@PathVariable("id") Long id)
	{
		userService.deleteAllUser();
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
