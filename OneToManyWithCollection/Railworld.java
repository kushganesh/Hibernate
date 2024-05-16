package OneToManyWithCollection;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class Railworld {

	@Id
	@Column(name = "Ragistration_No")
	private String ragistration_no;

	@Column(name = "Company_Feild")
	private String type_of_company;

//	@OneToMany
	@ElementCollection
	@JoinTable(name = "Emp", joinColumns = @JoinColumn(name = "Ragistration_No"))
	private Set<Employee> emp = new HashSet<>();

	public String getRagistration_no() {
		return ragistration_no;
	}

	public void setRagistration_no(String ragistration_no) {
		this.ragistration_no = ragistration_no;
	}

	public String getType_of_company() {
		return type_of_company;
	}

	public void setType_of_company(String type_of_company) {
		this.type_of_company = type_of_company;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Railworld [ragistration_no=" + ragistration_no + ", type_of_company=" + type_of_company + ", emp=" + emp
				+ "]";
	}

}
