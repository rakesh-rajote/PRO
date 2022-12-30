package com.jpaproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpaproject.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	
	public List<User>findByName(String name);
	
	public List<User>findByCity(String city);
	
	@Query("select u from User u")
	public List<User>getAllUser();
	
	@Query("select u from User u WHERE u.name=:n")
	public List<User> getUserByName(@Param("n") String name);

}
