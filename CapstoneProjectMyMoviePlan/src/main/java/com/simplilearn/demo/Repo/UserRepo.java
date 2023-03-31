package com.simplilearn.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.simplilearn.demo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
