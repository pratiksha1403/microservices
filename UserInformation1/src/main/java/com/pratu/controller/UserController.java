package com.pratu.controller;

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

import com.pratu.model.User;
import com.pratu.service.UserService;
@RestController
public class UserController {
	@Autowired
	UserService userservice;

	@PostMapping(value="/save",headers="Accept=application/json")
	public ResponseEntity<User> saveData(@Valid @RequestBody User reg)
	{
		return new ResponseEntity<User>(userservice.createUserData(reg),HttpStatus.ACCEPTED);
	}
	@GetMapping(value = "/read",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getUserData()
	{
		return new ResponseEntity<List<User>>(userservice.getalldata(),HttpStatus.FOUND);
	}
	@PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User>updateUserData(@RequestBody User reg)
	{
		return new ResponseEntity<User> (userservice.updateData(reg),HttpStatus.OK);	
	}

	@DeleteMapping(value = "/delete/{id}",headers ="Accept=application/json" )
	public ResponseEntity<Void>deletedata(@PathVariable("id") Long id)
	{
		userservice.deleteUser(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	@GetMapping(value = "/read/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<User>>getOne(@PathVariable("id") Long id)
	{
		return new ResponseEntity<Optional<User>>(userservice.getOne(id),HttpStatus.OK);
	}
}
