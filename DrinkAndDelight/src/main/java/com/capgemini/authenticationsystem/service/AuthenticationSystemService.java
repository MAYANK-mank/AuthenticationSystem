package com.capgemini.authenticationsystem.service;

import com.capgemini.authenticationsystem.beans.AuthenticationSystemBean;
import com.capgemini.authenticationsystem.controller.AuthenticationSystemInterface;
import com.capgemini.authenticationsystem.dao.*;

public class AuthenticationSystemService implements AuthenticationSystemInterface {
	
	private int i;
	
//	Verification of the email Id 
	public String checkEmailId(AuthenticationSystemBean myDetail, AuthenticationSystemDAO database) {
		for (i = 0; i < database.emailId.size(); i++) {
			if (myDetail.getEmailId().equals(database.emailId.get(i))) {
				break;
			} 
		}
		if(i == database.emailId.size()) {
			System.out.println("Wrong EmailId");
			System.exit(0);
		}
		
		return database.emailId.get(i);
	}
	
//	Verification of the password
	public String checkPassword(AuthenticationSystemBean myDetail, AuthenticationSystemDAO database) 
	{
		if(myDetail.getPassword().equals(database.password.get(i))){
			System.out.println("You successfully logged in");
			System.exit(0);
		}
		else {
			System.out.println("Your password is incorrect");	
		}
		return database.password.get(i);
	}
	
//	Changing the password
	public void changePassword(AuthenticationSystemBean myDetail, AuthenticationSystemDAO database) {
		database.password.set(i, myDetail.getForgotPassword());
		System.out.println("Your new password is :"  + database.password.get(i));	
	}
	
//	Log out
	public void logOut() {
		System.out.println("You successfully logged out");
		System.exit(0);
	}
}