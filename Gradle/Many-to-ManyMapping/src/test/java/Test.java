import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.model.Actor;
import com.techlabs.model.Movie;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		System.out.println(configuration);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		System.out.println(session.getClass());
		Transaction txn = session.beginTransaction();

		Actor a1 = new Actor();
		a1.setId(1);
		a1.setName("Actor1");
		Actor a2 = new Actor();
		a2.setId(2);
		a2.setName("Actor2");

		Movie m1 = new Movie();
		m1.setId(1);
		m1.setName("Movie1");
		Movie m2 = new Movie();
		m2.setId(2);
		m2.setName("Movie2");

		Set<Actor> actors = new HashSet<Actor>();
		actors.add(a1);
		actors.add(a2);

		Set<Movie> movies = new HashSet<Movie>();
		movies.add(m1);
		movies.add(m2);

		a1.setMovies(movies);
		a2.setMovies(movies);
		m1.setActors(actors);
		m2.setActors(actors);

		session.save(a1);
		session.save(a2);
//		session.save(m1);
//		session.save(m2);
//		session.save(e1);
//		session.save(e2);
		txn.commit();

		session.close();

	}
}
