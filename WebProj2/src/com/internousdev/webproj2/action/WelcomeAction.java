package com.internousdev.webproj2.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class WelcomeAction
 */
@WebServlet("/WelcomeAction")
public class WelcomeAction extends ActionSupport {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public String execute() {
        return SUCCESS;
        // TODO Auto-generated constructor stub
    }

}
