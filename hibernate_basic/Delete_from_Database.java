package hibernate_basic;

import org.hibernate.Session;
public class Delete_from_Database {
	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();
		Student1 student = session.get(Student1.class, 2);
		session.beginTransaction();
//		session.delete(student);
		session.remove(student);
		session.getTransaction().commit();
		
	}
}
