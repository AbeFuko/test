package com.internousdev.webproj.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class InquiryCompleteAction
 */
@WebServlet("/InquiryCompleteAction")
public class InquiryCompleteAction extends ActionSupport {
	private String name;
	private String qtype;
	private String body;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public String execute() {
        return SUCCESS;
        // TODO Auto-generated constructor stub
    }

    public String getName() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public String getQtype() {
    	return qtype;
    }

    public void setQtype(String qtype) {
    	this.qtype = qtype;
    }

    public String getBody() {
    	return body;
    }

    public void setBody(String body) {
    	this.body = body;
    }

}
