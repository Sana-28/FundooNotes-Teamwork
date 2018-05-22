package com.bridgelabz.user.service;
import com.bridgelabz.user.model.User;
import com.bridgelabz.user.model.UserDto;
public interface UserService {
	//void register(User user);
	  public void register(UserDto userDto, String requestURL);
	  public String login(UserDto userDto);
	  public User getUserById(int userId);

}
		 
	 
	