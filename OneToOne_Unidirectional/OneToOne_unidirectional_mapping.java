package OneToOne_Unidirectional;

import org.hibernate.Session;

import OneToMany.FactoryProvider;

public class OneToOne_unidirectional_mapping {
	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();

		Capital c1 = new Capital();
		c1.setName("lacknow");

		Capital c2 = new Capital();
		c2.setName("gandhiNagar");

		Capital c3 = new Capital();
		c3.setName("Patna");

		Capital c4 = new Capital();
		c4.setName("Raipur");

		Capital c5 = new Capital();
		c5.setName("Bhopal");

		State s1 = new State();
		s1.setName("Madhya Pradesh");
		s1.setCapital(c5);

		State s2 = new State();
		s2.setName("Bihar");
		s2.setCapital(c3);

		State s3 = new State();
		s3.setName("Gujarat");
		s3.setCapital(c2);

		State s4 = new State();
		s4.setName("Chhattishghar");
		s4.setCapital(c4);

		State s5 = new State();
		s5.setName("Uttar Pradesh");
		s5.setCapital(c1);

		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		session.getTransaction().commit();
		session.close();
	}

}
