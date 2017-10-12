package com.arms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arms.domain.entity.User;


@Repository
public interface UserRepository extends JpaRepository<com.arms.domain.entity.User, Integer>{
	User findByEmail(String email);
}
