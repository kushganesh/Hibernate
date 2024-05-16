package hibernate_basic;

import java.util.Calendar;

import org.hibernate.Session;

public class Save_and_SaveAndUpdate {
	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();
//		session.beginTransaction();
//		Student1 s1 = new Student1();
//		s1.setId(3);
//		s1.setName("BholaRam");
//		s1.setX(34);
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(1970, Calendar.AUGUST, 23);
//		s1.setDate(calendar.getTime());
//		session.save(s1);
//		session.getTransaction().commit();
		
		
		session.beginTransaction();
		Student1 s1 = new Student1();
		s1.setId(3);
		s1.setName("BholaRam");
		s1.setX(34);
		Calendar calendar = Calendar.getInstance();
		calendar.set(1970, Calendar.AUGUST, 23);
		s1.setDate(calendar.getTime());
		session.saveOrUpdate(s1);
		session.getTransaction().commit();
	}

}
