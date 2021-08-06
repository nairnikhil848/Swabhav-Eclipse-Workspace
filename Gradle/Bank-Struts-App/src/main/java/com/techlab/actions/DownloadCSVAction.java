package com.techlab.actions;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.modelView.BankTransactionView;
import com.techlab.models.BankTransaction;

public class DownloadCSVAction extends ActionSupport implements SessionAware {

	private SessionMap<String, Object> session;
	private InputStream fileInputStream;

	public InputStream getFileInputStream() {
		return fileInputStream;
	}

	public String execute() throws Exception {
//		fileInputStream = new FileInputStream(new File("C:\\Users\\nairn\\Downloads\\Passbook.csv"));

		List<BankTransactionView> transactionList = (List<BankTransactionView>) this.getSession()
				.get("transactionList");

		StringBuilder sb = new StringBuilder();
		sb.append("Amouont");
		sb.append(',');
		sb.append("Type");
		sb.append(',');
		sb.append("Date");
		sb.append('\n');

		for (BankTransactionView t : transactionList) {
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

		byte[] bytes = sb.toString().getBytes();

		fileInputStream = new ByteArrayInputStream(bytes);

		return SUCCESS;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

}
