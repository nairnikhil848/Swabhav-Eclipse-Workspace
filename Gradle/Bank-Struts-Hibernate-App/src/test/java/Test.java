
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlab.models.Account;
import com.techlab.models.BankTransaction;
import com.techlab.services.AccountService;

public class Test {
	public static void main(String[] args) {

		AccountService service = new AccountService();

		Account account = new Account("Shivam", 4500, "1234");

		service.createAccount(account);

	}
}
