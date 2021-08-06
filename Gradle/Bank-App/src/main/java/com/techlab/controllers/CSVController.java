package com.techlab.controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.models.BankTransaction;

@WebServlet("/exportCSV")
public class CSVController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CSVController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		List<BankTransaction> transactionList = (List<BankTransaction>) session.getAttribute("transactionList");
		response.setContentType("text/csv");
		response.setHeader("Content-Disposition", "attachment; filename=\"Passbook.csv\"");

		try {
			StringBuilder sb = new StringBuilder();
			sb.append("Amouont");
			sb.append(',');
			sb.append("Type");
			sb.append(',');
			sb.append("Date");
			sb.append('\n');

			for (BankTransaction t : transactionList) {
				sb.append(String.valueOf(t.getAmount()));
				sb.append(',');
				String type = "Deposit";
				if (t.getType() == 'W') {
					type = "Withdraw";
				}
				sb.append(type);
				sb.append(',');
				sb.append(t.getDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
				sb.append('\n');
			}

			OutputStream outputStream = response.getOutputStream();
			outputStream.write(sb.toString().getBytes());
			outputStream.flush();
			outputStream.close();

			System.out.println("Csv file Successfully created.");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
