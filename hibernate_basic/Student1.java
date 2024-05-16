package hibernate_basic;


import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "student_table")
@DynamicUpdate
public class Student1 {

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", date=" + date + ", x=" + x + "]";
	}

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Name", length = 244, nullable = true, unique = false)
	private String name;

	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Transient
	private int x;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public Student1()
	{
		super();
	}
	
	
}
