package org.littuss.hrManagementApp.empRegisterModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class EmpExperience {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	//Experience History/past enployee details (in reverse chronological order)
     private String nameOfTheCompany1;
     private String designation1;
     private String dateOfJioning1;
     private String dateOfResigning1;
     private String totalYearsOfExperience1;
     private String remarks1;
     
     private String nameOfTheCompany2;
     private String designation2;
     private String dateOfJioning2;
     private String dateOfResigning2;
     private String totalYearsOfExperience2;
     private String remarks2;
     
     private String nameOfTheCompany3;
     private String designation3;
     private String dateOfJioning3;
     private String dateOfResigning3;
     private String totalYearsOfExperience3;
     private String remarks3;
     
     private String nameOfTheCompany4;
     private String designation4;
     private String dateOfJioning4;
     private String dateOfResigning4;
     private String totalYearsOfExperience4;
     private String remarks4;
    
     //NoArgConStructor
	public EmpExperience() {	}

	//ConstructorWithFileds
	public EmpExperience(String nameOfTheCompany1, String designation1, String dateOfJioning1, String dateOfResigning1,
			String totalYearsOfExperience1, String remarks1, String nameOfTheCompany2, String designation2,
			String dateOfJioning2, String dateOfResigning2, String totalYearsOfExperience2, String remarks2,
			String nameOfTheCompany3, String designation3, String dateOfJioning3, String dateOfResigning3,
			String totalYearsOfExperience3, String remarks3, String nameOfTheCompany4, String designation4,
			String dateOfJioning4, String dateOfResigning4, String totalYearsOfExperience4, String remarks4) {
		 
		this.nameOfTheCompany1 = nameOfTheCompany1;
		this.designation1 = designation1;
		this.dateOfJioning1 = dateOfJioning1;
		this.dateOfResigning1 = dateOfResigning1;
		this.totalYearsOfExperience1 = totalYearsOfExperience1;
		this.remarks1 = remarks1;
		this.nameOfTheCompany2 = nameOfTheCompany2;
		this.designation2 = designation2;
		this.dateOfJioning2 = dateOfJioning2;
		this.dateOfResigning2 = dateOfResigning2;
		this.totalYearsOfExperience2 = totalYearsOfExperience2;
		this.remarks2 = remarks2;
		this.nameOfTheCompany3 = nameOfTheCompany3;
		this.designation3 = designation3;
		this.dateOfJioning3 = dateOfJioning3;
		this.dateOfResigning3 = dateOfResigning3;
		this.totalYearsOfExperience3 = totalYearsOfExperience3;
		this.remarks3 = remarks3;
		this.nameOfTheCompany4 = nameOfTheCompany4;
		this.designation4 = designation4;
		this.dateOfJioning4 = dateOfJioning4;
		this.dateOfResigning4 = dateOfResigning4;
		this.totalYearsOfExperience4 = totalYearsOfExperience4;
		this.remarks4 = remarks4;
	}

	//Getters
	public Long getId() {
		return id;
	}

	public String getNameOfTheCompany1() {
		return nameOfTheCompany1;
	}

	public String getDesignation1() {
		return designation1;
	}

	public String getDateOfJioning1() {
		return dateOfJioning1;
	}

	public String getDateOfResigning1() {
		return dateOfResigning1;
	}

	public String getTotalYearsOfExperience1() {
		return totalYearsOfExperience1;
	}

	public String getRemarks1() {
		return remarks1;
	}

	public String getNameOfTheCompany2() {
		return nameOfTheCompany2;
	}

	public String getDesignation2() {
		return designation2;
	}

	public String getDateOfJioning2() {
		return dateOfJioning2;
	}

	public String getDateOfResigning2() {
		return dateOfResigning2;
	}

	public String getTotalYearsOfExperience2() {
		return totalYearsOfExperience2;
	}

	public String getRemarks2() {
		return remarks2;
	}

	public String getNameOfTheCompany3() {
		return nameOfTheCompany3;
	}

	public String getDesignation3() {
		return designation3;
	}

	public String getDateOfJioning3() {
		return dateOfJioning3;
	}

	public String getDateOfResigning3() {
		return dateOfResigning3;
	}

	public String getTotalYearsOfExperience3() {
		return totalYearsOfExperience3;
	}

	public String getRemarks3() {
		return remarks3;
	}

	public String getNameOfTheCompany4() {
		return nameOfTheCompany4;
	}

	public String getDesignation4() {
		return designation4;
	}

	public String getDateOfJioning4() {
		return dateOfJioning4;
	}

	public String getDateOfResigning4() {
		return dateOfResigning4;
	}

	public String getTotalYearsOfExperience4() {
		return totalYearsOfExperience4;
	}

	public String getRemarks4() {
		return remarks4;
	}

	
	//Setters
	public void setNameOfTheCompany1(String nameOfTheCompany1) {
		this.nameOfTheCompany1 = nameOfTheCompany1;
	}

	public void setDesignation1(String designation1) {
		this.designation1 = designation1;
	}

	public void setDateOfJioning1(String dateOfJioning1) {
		this.dateOfJioning1 = dateOfJioning1;
	}

	public void setDateOfResigning1(String dateOfResigning1) {
		this.dateOfResigning1 = dateOfResigning1;
	}

	public void setTotalYearsOfExperience1(String totalYearsOfExperience1) {
		this.totalYearsOfExperience1 = totalYearsOfExperience1;
	}

	public void setRemarks1(String remarks1) {
		this.remarks1 = remarks1;
	}

	public void setNameOfTheCompany2(String nameOfTheCompany2) {
		this.nameOfTheCompany2 = nameOfTheCompany2;
	}

	public void setDesignation2(String designation2) {
		this.designation2 = designation2;
	}

	public void setDateOfJioning2(String dateOfJioning2) {
		this.dateOfJioning2 = dateOfJioning2;
	}

	public void setDateOfResigning2(String dateOfResigning2) {
		this.dateOfResigning2 = dateOfResigning2;
	}

	public void setTotalYearsOfExperience2(String totalYearsOfExperience2) {
		this.totalYearsOfExperience2 = totalYearsOfExperience2;
	}

	public void setRemarks2(String remarks2) {
		this.remarks2 = remarks2;
	}

	public void setNameOfTheCompany3(String nameOfTheCompany3) {
		this.nameOfTheCompany3 = nameOfTheCompany3;
	}

	public void setDesignation3(String designation3) {
		this.designation3 = designation3;
	}

	public void setDateOfJioning3(String dateOfJioning3) {
		this.dateOfJioning3 = dateOfJioning3;
	}

	public void setDateOfResigning3(String dateOfResigning3) {
		this.dateOfResigning3 = dateOfResigning3;
	}

	public void setTotalYearsOfExperience3(String totalYearsOfExperience3) {
		this.totalYearsOfExperience3 = totalYearsOfExperience3;
	}

	public void setRemarks3(String remarks3) {
		this.remarks3 = remarks3;
	}

	public void setNameOfTheCompany4(String nameOfTheCompany4) {
		this.nameOfTheCompany4 = nameOfTheCompany4;
	}

	public void setDesignation4(String designation4) {
		this.designation4 = designation4;
	}

	public void setDateOfJioning4(String dateOfJioning4) {
		this.dateOfJioning4 = dateOfJioning4;
	}

	public void setDateOfResigning4(String dateOfResigning4) {
		this.dateOfResigning4 = dateOfResigning4;
	}

	public void setTotalYearsOfExperience4(String totalYearsOfExperience4) {
		this.totalYearsOfExperience4 = totalYearsOfExperience4;
	}

	public void setRemarks4(String remarks4) {
		this.remarks4 = remarks4;
	}
	
	
     
     
 

}
