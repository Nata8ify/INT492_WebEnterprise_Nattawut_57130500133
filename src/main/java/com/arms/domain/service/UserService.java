package com.arms.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.arms.domain.entity.User;
import com.arms.domain.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public User findByEmail(String email){
		return repository.findByEmail(email);
	}
	
	public User findById(int id){
		return repository.findOne(id);
	}
	
	public void deleteById(int id){
		repository.delete(id);
	}
	
	public Page<User> findAll(Pageable pageable){
		return repository.findAll(pageable);
	}
}
