package com.internousdev.template.action2;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginID;
	private String loginPass;
	private String userName;
	private String errorMessage;
	public Map<String, Object> session;

	public String execute() {

		String result = SUCCESS;

		if(!(loginID.equals(""))
			&& !(loginPass.equals(""))
			&& !(userName.equals(""))) {

			session.put("loginID", loginID);
			session.put("loginPass", loginPass);
			session.put("userName", userName);

		} else {

			setErrorMessage("未入力の項目があります。");
			result = ERROR;

		}

		return result;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID ;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass ;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName ;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session ;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage ;
	}


}
