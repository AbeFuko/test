package com.internousdev.webproj2.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.internousdev.webproj2.dao.HelloStrutsDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Servlet implementation class HelloStrutsAction
 */
@WebServlet("/HelloStrutsAction")
public class HelloStrutsAction extends ActionSupport {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public String execute() {
        String ret = ERROR;
        HelloStrutsDAO dao = new HelloStrutsDAO();
        boolean b = dao.select();

        if(b==true) {
        	ret = SUCCESS;
        } else {
        	ret = ERROR;
        }

        return ret;
    }

}
