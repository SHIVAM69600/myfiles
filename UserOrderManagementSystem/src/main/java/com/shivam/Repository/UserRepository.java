package com.shivam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.Entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
