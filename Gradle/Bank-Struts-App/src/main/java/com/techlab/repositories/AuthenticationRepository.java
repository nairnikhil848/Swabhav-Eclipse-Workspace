package com.techlab.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.techlab.models.AccountHolder;

public class AuthenticationRepository {
	private final String DbURL = "jdbc:mysql://localhost:4040/";
	private final String DbName = "bank";
	private final String DbUsername = "root";
	private final String DbPassword = "1234";
	private Connection con = null;

	public AccountHolder searchUserWithName(String name) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DbURL + DbName, DbUsername, DbPassword);
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from bankmaster WHERE name = \"" + name + "\" ");
			if (rs.next()) {
				AccountHolder acc = new AccountHolder(rs.getString(2), rs.getDouble(3), rs.getString(4));
				acc.setId(rs.getString(1));
				con.close();
				return acc;
			}

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

}
