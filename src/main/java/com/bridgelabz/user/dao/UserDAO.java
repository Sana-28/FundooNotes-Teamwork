package com.bridgelabz.user.dao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bridgelabz.user.model.User;
@Repository(value = "userDao")
public interface UserDAO extends CrudRepository<User,Long> {

	 @Query("select u from User u where u.email = :email")
	 User getUserByEmailId(@Param("email") String email);
	    
	 @Query("select u from User u where u.userId = :userId")
	 User getUserById(@Param("userId") int userId);
		
    
	    }
