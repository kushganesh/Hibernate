package hibernate_basic.Enbedding_Object;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Table")
public class Employee {

	@Id
	private int id;
	private String name;
	private String compy;
	
	@Embedded
	private Emp_Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompy() {
		return compy;
	}

	public void setCompy(String compy) {
		this.compy = compy;
	}

	public Emp_Address getAddress() {
		return address;
	}

	public void setAddress(Emp_Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", compy=" + compy + ", address=" + address + "]";
	}

}
