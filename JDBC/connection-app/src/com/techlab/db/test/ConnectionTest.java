package com.techlab.db.test;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

public class ConnectionTest {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dept_emp_db", "root", "1234");

			System.out.println(con.getClass());
			System.out.println(con.getCatalog());
			System.out.println(con.getHost());
			System.out.println(con.getConnectTimeout());

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}
}
