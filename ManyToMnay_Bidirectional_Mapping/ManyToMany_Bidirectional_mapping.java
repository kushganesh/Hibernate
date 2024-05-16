package ManyToMnay_Bidirectional_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import OneToMany.FactoryProvider;

public class ManyToMany_Bidirectional_mapping {
	public static void main(String[] args) {

		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();

		Phone_Number phone_Number = new Phone_Number();
		phone_Number.setId(1);
		phone_Number.setPhone_no("9009481761");

		Phone_Number phone_Number1 = new Phone_Number();
		phone_Number1.setId(2);
		phone_Number1.setPhone_no("6261893367");

		Phone_Number phone_Number2 = new Phone_Number();
		phone_Number2.setId(3);
		phone_Number2.setPhone_no("8120397067");

		Phone_Number phone_Number3 = new Phone_Number();
		phone_Number3.setId(4);
		phone_Number3.setPhone_no("8120397070");

		Phone_Company phone_Company = new Phone_Company();
		phone_Company.setId(1);
		phone_Company.setName("Jio");
		List<Phone_Number> a1 = new ArrayList<>();
		a1.add(phone_Number1);
		a1.add(phone_Number2);
		a1.add(phone_Number3);
		a1.add(phone_Number);
		phone_Company.setPhoneNo(a1);

		Phone_Company phone_Company1 = new Phone_Company();
		phone_Company1.setId(2);
		phone_Company1.setName("VI");
		List<Phone_Number> a2 = new ArrayList<>();
		a2.add(phone_Number3);
		a2.add(phone_Number1);
		a2.add(phone_Number);
		phone_Company1.setPhoneNo(a2);

		Phone_Company phone_Company2 = new Phone_Company();
		phone_Company2.setId(3);
		phone_Company2.setName("Airtel");
		List<Phone_Number> a3 = new ArrayList<>();
		a3.add(phone_Number);
		phone_Company2.setPhoneNo(a3);
		
		
		

		List<Phone_Company> l1= new ArrayList<>();
		l1.add(phone_Company2);
		l1.add(phone_Company1);
		l1.add(phone_Company);
		phone_Number.setPhone_company(l1);
		
		
		

		List<Phone_Company> l2= new ArrayList<>();
		l2.add(phone_Company2);
		l2.add(phone_Company1);
		l2.add(phone_Company);
		phone_Number.setPhone_company(l2);
		
		
	
		List<Phone_Company> l3= new ArrayList<>();
		l3.add(phone_Company2);
		l3.add(phone_Company1);
		l3.add(phone_Company);
		phone_Number.setPhone_company(l3);
		
		

		List<Phone_Company> l4= new ArrayList<>();
		l4.add(phone_Company2);
		l4.add(phone_Company1);
		l4.add(phone_Company);
		phone_Number.setPhone_company(l4);
		
		

		session.save(phone_Number);
		session.save(phone_Number1);
		session.save(phone_Number2);
		session.save(phone_Number3);

		session.save(phone_Company);
		session.save(phone_Company1);
		session.save(phone_Company2);

		session.getTransaction().commit();
		session.close();
	}
}
