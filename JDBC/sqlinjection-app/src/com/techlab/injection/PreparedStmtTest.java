package com.techlab.injection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStmtTest {
	private static final String DbURL = "jdbc:mysql://localhost:4040/";
	private static final String DbName = "dept_emp_db";
	private static final String DbUsername = "root";
	private static final String DbPassword = "1234";	

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Scanner sc  = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DbURL + DbName, DbUsername, DbPassword);
			PreparedStatement stmt = conn.prepareStatement("SELECT EMPNO,ENAME,JOB from emp WHERE EMPNO =?");
			
			System.out.println("Enter the Employee no :");
	        String no = sc.nextLine();
	        
	        stmt.setString(1, no);
	        ResultSet rs = stmt.executeQuery();
	        
//			ResultSet rs = stmt.executeQuery("SELECT EMPNO,ENAME,JOB from emp "+ "WHERE EMPNO =" + no);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
						

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}
}
