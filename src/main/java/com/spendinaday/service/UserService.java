package com.spendinaday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spendinaday.dto.UserEntityToUserDTO;
import com.spendinaday.entity.UserEntity;
import com.spendinaday.model.User;
import com.spendinaday.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserEntityToUserDTO userDto;
	

		
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
		
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
	UserEntity userentity=userRepo.findByuserid(id);
	
	User user=userDto.convertUserEntityToUser(userentity);
	
	return user;
	}

	
	
}
