package hibernate_basic;

import java.util.Calendar;

import org.hibernate.Session;

public class marge_and_update {
	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();

		

		Student1 s1 = session.get(Student1.class, 3);
	
		session.getTransaction().commit();
		session.close();
		
		s1.setName("Rajesh");
		
		
		
		Session session1 = FactoryProvider.getFactory().openSession();
		Student1 s2 = session1.get(Student1.class, 3);
		session1.beginTransaction();
		s1.setName("Bhopali Bhai");
//		session1.update(s1);
		session1.merge(s1);
		session1.getTransaction().commit();
		session1.close();

	}

}
