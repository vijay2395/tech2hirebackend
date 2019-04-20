package com.spendinaday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spendinaday.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

	public UserEntity findByuserid(int id);
	
	
}
