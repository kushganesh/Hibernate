package hibernate_basic;

import java.util.Calendar;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	
	public static void main(String[] args) {
		Session session = FactoryProvider.getFactory().openSession();
		Transaction transaction = session.beginTransaction();

//		Emp emp = new Emp();
//		emp.setName("Sneha");
//		emp.setSem("7th");
//		emp.setDate(new Date(2024,5,8));
//		session.persist(emp);
		
		
		Student1 std= new Student1();
		
		std.setName("Rajpal");
		std.setX(23);
		Calendar calendar= Calendar.getInstance();
		calendar.set(2024,Calendar.MAY,8);
		std.setDate(calendar.getTime());
		
		session.save(std);
		transaction.commit();
		session.close();
		FactoryProvider.closeFactory();
		System.out.print("Gahaha");

	}
}
