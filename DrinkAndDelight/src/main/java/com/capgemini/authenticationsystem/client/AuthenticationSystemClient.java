package com.capgemini.authenticationsystem.client;
import java.util.*;

import com.capgemini.authenticationsystem.beans.*;
import com.capgemini.authenticationsystem.dao.*;
import com.capgemini.authenticationsystem.service.*;
public class AuthenticationSystemClient {

	public static void main(String[] args) {
	AuthenticationSystemBean myDetail = new AuthenticationSystemBean();
    AuthenticationSystemService service = new AuthenticationSystemService(); 
    AuthenticationSystemDAO database = new AuthenticationSystemDAO();
    
      Scanner s = new Scanner(System.in);
//    Verification of email Id
      System.out.println("Enter your emailID:");
	  String emailId = s.nextLine();
	  myDetail.setEmailId(emailId);
	  service.checkEmailId(myDetail, database);
	  
//	  Verification of password
	  System.out.println("Enter your password");
	  String password = s.nextLine();
	  myDetail.setPassword(password);
	  service.checkPassword(myDetail, database);
	  
//  Changing the password
	  System.out.println("do you want to change the password(y/n):");
	  String ch = s.nextLine();
	  switch(ch)
	  {
	   case "y": System.out.println("Enter the new passsword");
	            String newPassword = s.nextLine();
	            myDetail.setForgotPassword(newPassword);
	            service.changePassword(myDetail, database);
	            break;
	   case "n" : System.out.println("You are logged out"); 
	              break;
	   default : System.out.println("OOPS you chose wrong choice");
	             break;
	  }
//	  Logout
	  service.logOut();
	  s.close();
}
}