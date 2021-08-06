import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Test {
	public static void main(String[] args) {

		try {
			//add email and password in info.properties
			InputStream resourceStream = ClassLoader.getSystemClassLoader().getResourceAsStream("../info.properties");

			Properties props = new Properties();
			props.load(resourceStream);

			String userid = props.getProperty("email");
			String password = props.getProperty("password");

			String to = "kannan@swabhavtechlabs.com";

			Session session = Session.getInstance(props, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userid, password);
				}
			});

			Message message = new MimeMessage(session);
			try {
				message.setFrom(new InternetAddress(userid));
				message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
				message.setSubject("Testing");
				message.setText("Message Sent From java mail app. hello");
				Transport.send(message);
				System.out.println("Message sent Successfully");

			} catch (AddressException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
