package hibernate_basic;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class FactoryProvider {

	public static SessionFactory sessionFactory;

	public static SessionFactory getFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();
		}

		return sessionFactory;
	}
 
	public static void closeFactory()
	{
		if(sessionFactory.isOpen())
		{
			sessionFactory.isClosed();
		}
		
	}
}
