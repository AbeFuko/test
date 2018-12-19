package com.internousdev.template.dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util2.DBConnector;
import com.internousdev.template.util2.DateUtil;

public class UserCreateCompleteDAO {

	private DateUtil dateUtil = new DateUtil();
	private String sql = "insert into login_user_transaction(login_id, login_pass, user_name, insert_date) values(?, ?, ?, ?)";

	public void createUser(String loginId, String loginPass, String userName) throws SQLException {

		DBConnector db = new DBConnector();
		Connection conn = db.getConnection();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, loginId);
			ps.setString(2, loginPass);
			ps.setString(3, userName);
			ps.setString(4, dateUtil.getDate());

			ps.execute();

		} catch(Exception e) {
			e.printStackTrace();

		} finally {
			conn.close();
		}
	}

}
