package com.internousdev.webproj2.action;

import javax.servlet.annotation.WebServlet;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class InquiryAction
 */
@WebServlet("/InquiryAction")
public class InquiryAction extends ActionSupport {

	public String execute() {
		return SUCCESS;
	}

}
