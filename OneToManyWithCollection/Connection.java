package OneToManyWithCollection;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import OneToMany.FactoryProvider;

public class Connection {
	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();

		session.beginTransaction();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setAge(17);
		e1.setName("Ganesh");
		e1.setSalary("20003");

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setAge(24);
		e2.setName("Mohit");
		e2.setSalary("2045");

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setAge(45);
		e3.setName("Yashpal");
		e3.setSalary("2078");

		Employee e4 = new Employee();
		e4.setId(4);
		e4.setAge(80);
		e4.setName("Yogash");
		e4.setSalary("28923");

		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);

		Railworld r1 = new Railworld();
		Set<Employee> ans = new HashSet<>();
		ans.add(e1);
		ans.add(e2);
		ans.add(e3);
		ans.add(e4);

		r1.setEmp(ans);
		r1.setRagistration_no("101");
		r1.setType_of_company("Information Technology");
		session.save(r1);
		session.getTransaction().commit();
		
		session.close();

	}

}
