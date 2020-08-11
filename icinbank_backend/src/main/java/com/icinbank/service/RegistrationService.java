package com.icinbank.service;

import com.icinbank.model.RegisterResponse;
import com.icinbank.model.User;

public interface RegistrationService {
	
	public RegisterResponse createAccount(User details); //main method
	public boolean usernameAlreadyExists(String username);
//	public boolean emailAlreadyExists(String email);
//	public boolean panAlreadyExists(String pan);
//	public boolean phoneNumberAlreadyExists(String phone);
	//These all can be called inside main method

}
