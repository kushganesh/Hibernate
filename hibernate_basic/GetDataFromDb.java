package hibernate_basic;

import org.hibernate.Session;

public class GetDataFromDb {
	public static void main(String[] args) {
		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();
		Student1 student = session.load(Student1.class, 1);
		System.out.println(student.getId());
		System.out.println(student);
		session.getTransaction().commit();

	}

}
