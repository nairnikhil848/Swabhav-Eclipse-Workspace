package com.techlab.db.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class StatementTest {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dept_emp_db", "root", "1234");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getDate(5) + "  " + rs.getInt(6) + "  " + rs.getInt(7) + "  " + rs.getInt(8));
			}

			String updateSql = "UPDATE emp " + "SET ENAME = 'NIKHIL' WHERE JOB = 'PRESIDENT'";
			stmt.executeUpdate(updateSql);

//			String insertSql = "INSERT INTO emp VALUES (7936, 'Zara', 'CLERK',NULL,'1983-01-23',1000,NULL,10)";
//	        stmt.executeUpdate(insertSql);

			String deleteSql = "DELETE FROM emp " + "WHERE EMPNO = 7936";
			stmt.executeUpdate(deleteSql);

			rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getDate(5) + "  " + rs.getInt(6) + "  " + rs.getInt(7) + "  " + rs.getInt(8));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}
}
