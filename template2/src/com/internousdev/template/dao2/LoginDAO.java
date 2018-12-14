package com.internousdev.template.dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto2.LoginDTO;
import com.internousdev.template.util2.DBConnector;

public class LoginDAO {

	public LoginDTO getLoginUserInfo(String LoginId, String loginPass) {

		DBConnector db = new DBConnector();
		Connection conn = db.getConnection();
		LoginDTO loginDTO = new LoginDTO();
		String sql ="select * from login_user_transaction where login_id=? and login_pass=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, LoginId);
			ps.setString(2, loginPass);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {

				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));

				if(!(rs.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return loginDTO;
	}

}
