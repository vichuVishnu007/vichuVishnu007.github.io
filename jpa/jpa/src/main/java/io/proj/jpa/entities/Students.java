package io.proj.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long id;
	private String name;
	private String course;
	
	protected Students(){
		
	}
	public Students(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}
