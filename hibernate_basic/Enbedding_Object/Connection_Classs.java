package hibernate_basic.Enbedding_Object;

import org.hibernate.Session;

import hibernate_basic.FactoryProvider;

public class Connection_Classs {

	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();

		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Ganesh");
		emp.setCompy("Railworld India Pvt");

		Emp_Address address = new Emp_Address();
		address.setWord(12);
		address.setVillage("Mohanpuer");
		address.setMakan_No(191);
		address.setBlock("Pandhana");
		address.setDistrict("Khandwa");

		emp.setAddress(address);
		
		session.persist(emp);
		session.getTransaction().commit();
		session.close();

	}
}
