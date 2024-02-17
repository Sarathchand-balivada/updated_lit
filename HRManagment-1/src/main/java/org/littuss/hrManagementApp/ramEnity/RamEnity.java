package org.littuss.hrManagementApp.ramEnity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="rama")
public class RamEnity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String name;
	public RamEnity() {
		
		
	}
	public long getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public void setId(long id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RamEnity(long id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	
	
	

}
