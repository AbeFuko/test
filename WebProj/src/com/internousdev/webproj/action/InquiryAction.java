package com.internousdev.webproj.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class InquiryAction
 */
@WebServlet("/InquiryAction")
public class InquiryAction extends ActionSupport {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public String execute() {
    	return SUCCESS;
        // TODO Auto-generated constructor stub
    }
}
