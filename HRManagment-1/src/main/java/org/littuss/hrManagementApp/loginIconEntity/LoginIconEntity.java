package org.littuss.hrManagementApp.loginIconEntity;

import java.time.LocalDateTime;

import org.springframework.aot.generate.GeneratedTypeReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userInfo")

public class LoginIconEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	  private Long id;

    private String email;
    private String fullName;
    private String lastLoginTime;
	public LoginIconEntity() {

	}
	public LoginIconEntity(Long id, String email, String fullName, String lastLoginTime) {
		super();
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.lastLoginTime = lastLoginTime;
	}
	public Long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getFullName() {
		return fullName;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	@Override
	public String toString() {
		return "LoginIconEntity [id=" + id + ", email=" + email + ", fullName=" + fullName + ", lastLoginTime="
				+ lastLoginTime + "]";
	}
    
    
    

	

}
