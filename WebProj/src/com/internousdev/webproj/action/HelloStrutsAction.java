package com.internousdev.webproj.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

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
        return SUCCESS;
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
