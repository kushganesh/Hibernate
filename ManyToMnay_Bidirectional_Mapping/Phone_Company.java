package ManyToMnay_Bidirectional_Mapping;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Phone_Company {

	@Id
	private int id;
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "Common_Table", joinColumns = @JoinColumn(name = "id"))
	private List<Phone_Number> phoneNo;

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

	public List<Phone_Number> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<Phone_Number> phoneNo) {
		this.phoneNo = phoneNo;
	}
}
