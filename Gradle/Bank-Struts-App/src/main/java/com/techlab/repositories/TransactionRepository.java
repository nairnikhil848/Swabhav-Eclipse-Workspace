package com.techlab.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.techlab.models.BankTransaction;

public class TransactionRepository {
	private final String DbURL = "jdbc:mysql://localhost:4040/";
	private final String DbName = "bank";
	private final String DbUsername = "root";
	private final String DbPassword = "1234";
	private Connection con = null;

	public boolean createTransaction(BankTransaction trans) {

		return true;
	}

	public List<BankTransaction> getTransactionsList(String id) {
		List<BankTransaction> list = new ArrayList<BankTransaction>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DbURL + DbName, DbUsername, DbPassword);
			Statement stmt = con.createStatement();
			System.out.println(id);
			ResultSet rs = stmt
					.executeQuery("select * from banktransactions WHERE id = \"" + id + "\" ORDER BY date DESC");
			while (rs.next()) {

				BankTransaction trans = new BankTransaction(rs.getString(1), rs.getDouble(2), rs.getString(3).charAt(0),
						rs.getTimestamp(4).toLocalDateTime());
				list.add(trans);
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
		return list;
	}

	public boolean isTransactionSuccessfull(BankTransaction transaction) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DbURL + DbName, DbUsername, DbPassword);
			con.setAutoCommit(false);

			PreparedStatement transQuery = con.prepareStatement("INSERT INTO banktransactions VALUES(?,?,?,?)");
			transQuery.setString(1, transaction.getId());
			transQuery.setDouble(2, transaction.getAmount());
			transQuery.setString(3, String.valueOf(transaction.getType()));
			transQuery.setString(4, transaction.getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

			PreparedStatement AccountQuery = con
					.prepareStatement("UPDATE bankmaster SET balance = balance + ? WHERE id = ?");
			if (transaction.getType() == 'W') {
				AccountQuery = con.prepareStatement("UPDATE bankmaster SET balance = balance - ?  WHERE id = ?");
			}
			AccountQuery.setDouble(1, transaction.getAmount());
			AccountQuery.setString(2, transaction.getId());

			if (transQuery.executeUpdate() == 0 || AccountQuery.executeUpdate() == 0) {
				throw new Exception("Transfer Query Failed");
			}
			con.commit();
			System.out.println("Transfer  Successfully");
			con.close();
			return true;

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			try {
				con.rollback();
				con.close();
				return false;
			} catch (SQLException e1) {
				e1.printStackTrace();
				return false;
			}

		}
	}

}
