package com.internousdev.template.dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto2.BuyItemDTO;
import com.internousdev.template.util2.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo() {
		DBConnector db = new DBConnector();
		Connection conn = db.getConnection();
		BuyItemDTO buyItemDTO = new BuyItemDTO();

		String sql = "select id, item_name, item_price from item_info_transaction";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		return buyItemDTO;
	}

}
