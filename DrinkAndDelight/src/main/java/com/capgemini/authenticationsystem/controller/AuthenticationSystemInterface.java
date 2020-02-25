package com.capgemini.authenticationsystem.controller;

import com.capgemini.authenticationsystem.beans.AuthenticationSystemBean;
import com.capgemini.authenticationsystem.dao.AuthenticationSystemDAO;

public interface AuthenticationSystemInterface {
	public String checkEmailId(AuthenticationSystemBean myDetail, AuthenticationSystemDAO database);
	public String checkPassword(AuthenticationSystemBean myDetail, AuthenticationSystemDAO database);
	public void changePassword(AuthenticationSystemBean myDetail, AuthenticationSystemDAO database);
	public void logOut();
}
