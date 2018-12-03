package com.internousdev.webproj.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/LoginAction")
public class LoginAction extends ActionSupport {
	private String username;
	private String password;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public String execute() {
        return SUCCESS;
        // TODO Auto-generated constructor stub
    }

    public String getUsername() {
    	return username;
    }

    public void setUsername(String username) {
    	this.username = username;
    }

    public String getPassword() {
    	return password;
    }

    public void setPassword(String password) {
    	this.password = password;
    }

}
