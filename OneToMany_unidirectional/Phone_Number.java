package OneToMany_unidirectional;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

@Entity
public class Phone_Number {

	@Id
	private int id;
	private String phone_no;

	@ManyToOne
	@JoinColumn(name = "phone_no_id")
	private Phone_Company phone_Company;

	public Phone_Company getPhone_Company() {
		return phone_Company;
	}

	public void setPhone_Company(Phone_Company phone_Company) {
		this.phone_Company = phone_Company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

}
