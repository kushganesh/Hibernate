package ManyToMnay_Bidirectional_Mapping;



import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Phone_Number {

	@Id
	private int id;
	private String phone_no;
	
	@ManyToMany
	private List<Phone_Company> phone_company;

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

	public List<Phone_Company> getPhone_company() {
		return phone_company;
	}

	public void setPhone_company(List<Phone_Company> s) {
		this.phone_company = s;
	}



}
