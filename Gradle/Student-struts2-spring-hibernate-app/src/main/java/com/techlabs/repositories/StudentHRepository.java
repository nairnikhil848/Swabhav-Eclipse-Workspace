package com.techlabs.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository
public class StudentHRepository {

	@Autowired
	private SessionFactory factory;

	private Session session;
	private Transaction transaction;
	private List<Student> studentList;

	public boolean AddStudent(Student stud) {
		session = factory.openSession();
		transaction = session.beginTransaction();
		session.save(stud);
		transaction.commit();
		session.close();
		return true;
	}

	public List<Student> getStudentsList() {

		session = factory.openSession();
		transaction = session.beginTransaction();

		studentList = new ArrayList<Student>();
		Query query = session.createQuery("FROM Student");
		studentList = (List<Student>) query.list();
		transaction.commit();
		session.close();
		return studentList;
	}

	public boolean deleteStudent(int id) {

		System.out.println("Id inside delete " + id);
		System.out.println("Id" + id);
		session = factory.openSession();
		transaction = session.beginTransaction();
		String hql = "DELETE FROM Student WHERE id = :id";
		Query q = session.createQuery(hql).setParameter("id", id);
		if (q.executeUpdate() == 0) {
			transaction.rollback();
			session.close();
			return false;
		}
		transaction.commit();
		session.close();
		return true;
	}

	public Student getStudent(int id) {

		session = factory.openSession();
		transaction = session.beginTransaction();
		String hql = "FROM Student WHERE id = :id";
		Query query = session.createQuery(hql).setParameter("id", id);
		Student student = (Student) query.uniqueResult();
		session.close();

		return student;
	}

	public boolean updateStudent(Student student) {

		session = factory.openSession();
		transaction = session.beginTransaction();
		session.saveOrUpdate(student);
//		session.update(student);

		transaction.commit();
		session.close();
		return true;

	}

}
