package com.techlab.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.techlab.models.AccountHolder;

public class AccountRepository {
	private final String DbURL = "jdbc:mysql://localhost:4040/";
	private final String DbName = "bank";
	private final String DbUsername = "root";
	private final String DbPassword = "1234";
	private Connection con = null;

	public boolean createAccount(AccountHolder acc) {
		boolean isAccountCreated = false;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DbURL + DbName, DbUsername, DbPassword);
			con.setAutoCommit(false);

			PreparedStatement stmt = con.prepareStatement("INSERT INTO bankmaster VALUES(?,?,?,?)");
			stmt.setString(1, acc.getId());
			stmt.setString(2, acc.getName());
			stmt.setDouble(3, acc.getBalance());
			stmt.setString(4, acc.getPassword());

			PreparedStatement transQuery = con.prepareStatement("INSERT INTO banktransactions VALUES(?,?,?,?)");
			transQuery.setString(1, acc.getId());
			transQuery.setDouble(2, acc.getBalance());
			transQuery.setString(3, String.valueOf('D'));
			transQuery.setString(4, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

			if (stmt.executeUpdate() == 0 || transQuery.executeUpdate()==0) {
				throw new Exception("Creation Query Failed");
			}
			con.commit();
			System.out.println("Created Account Successfully");
			isAccountCreated = true;

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return isAccountCreated;
	}

	public double getBalance(String id) {
		Double balance = 0.0;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DbURL + DbName, DbUsername, DbPassword);
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select balance from bankmaster WHERE id = \"" + id + "\"");
			if (rs.next()) {
				balance = rs.getDouble(1);
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
		return balance;

	}

	public void updateAccount(AccountHolder acc) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DbURL + DbName, DbUsername, DbPassword);
			con.setAutoCommit(false);

			PreparedStatement stmt = con
					.prepareStatement("UPDATE bankMaster SET name = ?,balance = ?,password=? WHERE id = ?");
			stmt.setString(1, acc.getName());
			stmt.setDouble(2, acc.getBalance());
			stmt.setString(3, acc.getPassword());
			stmt.setString(4, acc.getId());

			if (stmt.executeUpdate() == 0) {
				throw new Exception("Update Account Query Failed");
			}
			con.commit();
			System.out.println("Updated Account Successfully");

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
