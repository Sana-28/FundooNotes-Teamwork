package com.fundoonotes.userservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fundoonotes.userservice.User;
@Repository(value = "userDao")
public interface UserDAO extends CrudRepository<User,Long> {


	 User findByEmail(String email);
	 User findByRandomId(String randomId);
	 
	 //User findByuserId(int userId); 
	   
	 /*@Query("select u from User u where u.userId = :userId")
	 User getUserById(@Param("userId") int userId);*/
	 
	/* @Query("select u from User u where u.randomId = :randomId")
	 User getUserByUIID(@Param("randomId") String randomId);*/
	 
	 /* @Query("select u from User u where u.email = :email")
	 User getUserByEmailId(@Param("email") String email);
	 */
	 
	/*@Modifying(clearAutomatically = true)
	 @Query("UPDATE User c SET c.isActive = :isActive WHERE c.email = :email")
	 int activeUser(@Param("email") String email, @Param("isActive") boolean isActive);
	*/
	/*@Modifying(clearAutomatically = true)
	 @Query("UPDATE User c SET c.randomId = :randomId WHERE c.name = :name")
	 int saveUsernameUid(@Param("name") String name, @Param("randomId") String randomId);
	*/
	/*@Modifying(clearAutomatically = true)
	 @Query("UPDATE User c SET c.password = :password WHERE c.email = :email")
	 int resetPassword(@Param("email") String email, @Param("password") String password);
	*/
	

	 
	
	}

    
	    
