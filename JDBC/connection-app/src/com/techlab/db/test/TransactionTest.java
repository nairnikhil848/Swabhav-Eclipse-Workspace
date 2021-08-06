package com.techlab.db.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionTest {
	private static final String DbURL = "jdbc:mysql://localhost/";
	private static final String DbName = "ecommerce";
	private static final String DbUsername = "root";
	private static final String DbPassword = "1234";

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Scanner sc  = new Scanner(System.in);
		try {

//			conn = DriverManager.getConnection(DbURL, DbUsername, DbPassword);
//			Statement stmt1 = conn.createStatement();
//
//			stmt1.execute("CREATE DATABASE " + DbName);
//			System.out.println("Database created successfully...");
//			conn.close();

			conn = DriverManager.getConnection(DbURL + DbName, DbUsername, DbPassword);
			Statement stmt = conn.createStatement();

//			String sql = "";
//			sql = "CREATE TABLE Merchant " + "(id INT PRIMARY KEY,name VARCHAR(10) NOT NULL, " + " balance INT CHECK(balance>0))";
//			stmt.execute(sql);
//			System.out.println("Created table Merchant in given database...");
//
//			sql = "CREATE TABLE Customer " + "(id INT PRIMARY KEY,name VARCHAR(10) NOT NULL, " + " balance INT CHECK(balance>0))";
//			stmt.execute(sql);
//			System.out.println("Created table Customer in given database...");
//
//			sql = "INSERT INTO merchant VALUES (1,'merchant1', 5000)";
//			stmt.execute(sql);
//			sql = "INSERT INTO customer VALUES (1,'customer1', 5000)";
//	        stmt.execute(sql);
	        
	        conn.setAutoCommit(false);
	        
	        System.out.println("Enter the Purchase Amount :");
	        int amount = sc.nextInt();
	        System.out.println("Enter the Customer id : ");
	        int customerId = sc.nextInt();
	        System.out.println("Enter the Merchant id : ");
	        int merchantId = sc.nextInt();
	        
	        
			String updateCustomerQuery = "UPDATE customer " + "SET balance = (balance - "+ amount +")"
					+ "WHERE id = " + customerId;
			String updateMerchantQuery = "UPDATE merchant " + "SET balance = (balance + "+ amount + ")"
					+ "WHERE id = " + merchantId;
			
//			stmt.execute(updateCustomerQuery);
//			stmt.execute(updateMerchantQuery);
			
			if (stmt.executeUpdate(updateCustomerQuery) == 0 || stmt.executeUpdate(updateMerchantQuery) == 0) {
				throw new Exception("Update Query Failed");
			}
			conn.commit();
			System.out.println("Transaction Successfull");

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			conn.rollback();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}
}
