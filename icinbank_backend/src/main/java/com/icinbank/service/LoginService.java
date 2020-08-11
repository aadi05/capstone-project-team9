package com.icinbank.service;

import com.icinbank.model.LoginDetails;
import com.icinbank.model.LoginResponse;

public interface LoginService {
	
	public LoginResponse customerLogin(LoginDetails details);//main method
//	public boolean checkUsername(String username);
//	public boolean checkRegisteredEntry(String username, String password);
	//These two can be called inside main method

}
