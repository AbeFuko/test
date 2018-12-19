package com.internousdev.template.action2;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao2.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	private String loginId;
	private String loginPass;
	private String userName;
	private Map<String, Object> session;

	public String execute() throws SQLException {

		UserCreateCompleteDAO uccDAO = new UserCreateCompleteDAO();

		uccDAO.createUser(session.get("loginId").toString(),
			session.get("loginPass").toString(),
			session.get("userName").toString());

		String result = SUCCESS;

		return result;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
