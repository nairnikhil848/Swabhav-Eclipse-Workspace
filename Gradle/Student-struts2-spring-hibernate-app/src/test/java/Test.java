import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Student;
import com.techlabs.repositories.StudentHRepository;

public class Test {
	public static void main(String[] args) {

		
		StudentHRepository repo = new StudentHRepository();
		
		repo.AddStudent(new Student("123",4,4.5,"Address null"));

	}
}
