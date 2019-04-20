package com.spendinaday.dto;

import org.springframework.stereotype.Component;

import com.spendinaday.entity.UserEntity;
import com.spendinaday.model.User;

@Component
public class UserEntityToUserDTO {

	
	public User convertUserEntityToUser(UserEntity userentity)
	{
		User user=new User();
		
		user.setUsername(userentity.getUsername());
		user.setBudget(userentity.getBudget());
		user.setEmail(userentity.getEmail());
		return user;
		
		
	}
}
