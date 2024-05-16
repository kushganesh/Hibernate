package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class Connection {
	public static void main(String[] args) {
		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Ganesh");
		s1.setSem("7th");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Mohit");
		s2.setSem("8th");

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Rajesh");
		s3.setSem("6th");

		Collage c1 = new Collage();
		c1.setId(1);
		c1.setClgName("Technocreats Instituted of Technology");

		List<Student> ans = new ArrayList<>();
		ans.add(s1);
		ans.add(s2);
		ans.add(s3);

		c1.setStudents(ans);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(c1);

		session.getTransaction().commit();
		session.close();
	}
}
