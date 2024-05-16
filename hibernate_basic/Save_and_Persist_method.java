package hibernate_basic;

import java.util.Calendar;

import org.hibernate.Session;

public class Save_and_Persist_method {
	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();

//		Student1 s1 = new Student1();
//		s1.setId(102);
//		s1.setName("moghite");
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(2020, Calendar.FEBRUARY, 9);
//		s1.setDate(calendar.getTime());
//		session.getTransaction().commit();
//		session.save(s1);
//		session.close();

		Student1 s1 = new Student1();
		s1.setName("gggg");
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, Calendar.FEBRUARY, 7);
		s1.setDate(calendar.getTime());
		
		session.getTransaction().commit();
		session.persist(s1);

		session.close();;

	}

}
