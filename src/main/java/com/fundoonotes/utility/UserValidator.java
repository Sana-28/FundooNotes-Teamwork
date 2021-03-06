package com.fundoonotes.utility;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.fundoonotes.userservice.User;
import com.fundoonotes.userservice.UserDto;
@Component
public class UserValidator implements Validator {

	public boolean supports(Class<?> clazz) {

		return User.class.equals(clazz);
	}

	public void validate(Object obj, Errors err) {

		ValidationUtils.rejectIfEmpty(err, "name", "user.name.empty");
		ValidationUtils.rejectIfEmpty(err, "email", "user.email.empty");
		ValidationUtils.rejectIfEmpty(err, "password", "user.password.empty");
		ValidationUtils.rejectIfEmpty(err, "mobileNumber", "user.mobileNumber.empty");

		UserDto userDto = (UserDto) obj;

		Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+", Pattern.CASE_INSENSITIVE);
		if (!(pattern.matcher(userDto.getName()).matches())) {
			err.rejectValue("name", "user name invalid");
		}
		Pattern pattern1 = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$", Pattern.CASE_INSENSITIVE);
		if (!(pattern1.matcher(userDto.getEmail()).matches())) {
			err.rejectValue("email", "user email invalid");
		}

		Pattern pattern2 = Pattern.compile("[A-Za-z0-9]{8}");
		if (!(pattern2.matcher(userDto.getPassword()).matches())) {
			err.rejectValue("password", "user password empty");
		}
		Pattern pattern3 = Pattern.compile("^[0-9]{10}$");
		if (!(pattern3.matcher(userDto.getMobileNumber()).matches())) {
			err.rejectValue("mobileNumber", "user mobileNumber empty");
		}

	}

}
