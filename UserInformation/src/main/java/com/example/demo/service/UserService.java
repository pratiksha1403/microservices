package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user)
	{
		return userRepository.save(user);
	}
	
	public List<User> readAllUser()
	{
		return userRepository.findAll();
	}
	
	public User updateUser(User user)
	{
		return userRepository.save(user);
	}
	
	public void deleteUserById(Long id)
	{
		Optional<User>usr = userRepository.findById(id);
		if(usr.get()==null)
		{
			throw new UserNotFoundException("User not found with id :"+id);
		}
		else
		{
			userRepository.deleteById(id);
		}
	}
	
	public Optional <User> readUserById(Long id)
	{
		Optional<User> usr = userRepository.findById(id);
		if(!usr.isPresent())
		{
			throw new UserNotFoundException("User not found with id :"+id);
		}
		else {
			return usr;
		}
	}
	
	
	public void deleteAllUser() {
		userRepository.deleteAll();
	}
}

