package com.capgemini.authenticationsystem.beans;

public class AuthenticationSystemBean {
		  
		public String emailId;
		public String password;
		public String newPassword;
		
		public String getEmailId() 
		{
			return emailId;
		}
		public void setEmailId(String emailId) 
		{
			this.emailId = emailId;
		}
		public String getPassword() 
		{
			return password;
		}
		public void setPassword(String password) 
		{
			this.password = password;
		}
		public String getForgotPassword()
		{
			return newPassword;
		}
		public void setForgotPassword(String newPassword)
		{
			this.newPassword = newPassword;
		}
} 