package com.pratu.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratu.Exception.UserNotFoundException;
import com.pratu.dao.UserDao;
import com.pratu.model.User;
@Service
@Transactional
public class UserService {
	@Autowired
	UserDao userdao;
	public User createUserData(User reg)
	{
		return userdao.save(reg);
	}
	public List<User>getalldata()
	{
		return userdao.findAll();
	}
	public User updateData(User reg)
	{
		return userdao.save(reg);
	}
	public void deleteUser( Long id)
	{
		Optional<User> usr=userdao.findById(id);

		if(usr.get()==null)
		{
			throw new UserNotFoundException("user not found with id ="+id);
		}
		else {
			userdao.deleteById(id);
		}
	}
	public Optional <User> getOne(Long id)
	{  Optional<User> usr=userdao.findById(id);
	if(!usr.isPresent())
	{
		throw new UserNotFoundException("user not found with id ="+id);
	}
	else {
	return usr;
	}}
}
