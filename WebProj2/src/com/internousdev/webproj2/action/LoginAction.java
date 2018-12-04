package com.internousdev.webproj2.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.internousdev.webproj2.dao.LoginDAO;
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
    	String ret = ERROR;
    	LoginDAO dao = new LoginDAO();
    	boolean b = dao.select(username, password);

    	if(b==true) {
    		ret = SUCCESS;
    	} else {
    		ret = ERROR;
    	}

    	return ret;
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
