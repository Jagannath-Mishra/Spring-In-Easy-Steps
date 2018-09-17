package com.jagan.spring.springcore.dependancy.check;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Pescription {
	
	private int id;
	private String name;
	List<String> medicines;
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
	@Override
	public String toString() {
		return "Pescription [id=" + id + ", name=" + name + ", medicines=" + medicines + "]";
	}
	
	
	
}
