package hibernate_basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.DynamicUpdate;


public class Update_In_DataBase {
	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();
		Student1 student = session.get(Student1.class, 1);
		session.beginTransaction();
		String name="Bholea nath";
		student.setName(name);
		session.update(student);
		session.getTransaction().commit();
	}
}
