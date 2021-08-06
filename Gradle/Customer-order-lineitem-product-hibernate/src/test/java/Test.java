import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Customer;
import com.techlabs.model.LineItem;
import com.techlabs.model.Order;
import com.techlabs.model.Product;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		System.out.println(configuration);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();

		Customer cust = new Customer();
		cust.setId(1);
		cust.setName("Customer1");
//
		Order o1 = new Order(1);
		o1.setCust(cust);
//		Order o2 = new Order(2);
//
		Set<Order> orders = new HashSet<Order>();
		orders.add(o1);
//		orders.add(o2);
		cust.setOrders(orders);
//

		Product p1 = new Product(1, "Apple");
		Product p2 = new Product(2, "Orange");

		LineItem item1 = new LineItem(1, 10);
		item1.setProduct(p1);
		item1.setOrder(o1);
		p1.setLineItem(item1);

		LineItem item2 = new LineItem(2, 20);
		item2.setProduct(p2);
		item2.setOrder(o1);
		p2.setLineItem(item2);
//
		Set<LineItem> lineitems = new HashSet<LineItem>();
		lineitems.add(item1);
		lineitems.add(item2);
		o1.setLineItems(lineitems);
//

		session.save(cust);
//		session.save(p1);

		txn.commit();

		session.close();
		factory.close();

	}
}
