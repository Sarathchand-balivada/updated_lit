package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpAddressInfo {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	// address info 
     private String presentAddress;
     private String permenentAddress;
     private String mobileNo;
     private String personalEmailId;
     
     //NoArgConstructor
	 public EmpAddressInfo() {	}
	 
	 //CoonstructorWithFields
	 public EmpAddressInfo(String presentAddress, String permenentAddress, String mobileNo, String personalEmailId) {
		super();
		this.presentAddress = presentAddress;
		this.permenentAddress = permenentAddress;
		this.mobileNo = mobileNo;
		this.personalEmailId = personalEmailId;
	}

	 //Getters
	public Long getId() {
		return id;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public String getPermenentAddress() {
		return permenentAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getPersonalEmailId() {
		return personalEmailId;
	}

	
    //Setters
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public void setPermenentAddress(String permenentAddress) {
		this.permenentAddress = permenentAddress;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}
	 
	 
	 
     
    
     
}
