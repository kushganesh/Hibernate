package hibernate_basic;

import java.util.Date;
import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp")
public class Emp {
	@Id
	private int id;
	private String name;
	private String sem;
	private Date date;

	public Emp() {
		super();
		id = new Random().nextInt(100);
	}

	public Emp(int id, String name, String sem, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.date = date;
	}

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

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
