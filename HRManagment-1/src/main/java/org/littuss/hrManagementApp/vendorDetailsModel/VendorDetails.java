package org.littuss.hrManagementApp.vendorDetailsModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name="VendorDetails")

public class VendorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String vendorName;
	private String rateCard;
	private String location;
	private String jobType;
	private String payRoll;
	private String candidateName;
	private String candidateLocation;
	private String technology;
	private String firstReviewed;
	private String secondReviewed;  
    private String fileName;
    private String fileType;
    
	public VendorDetails() {
	}
	public VendorDetails(Long id, String vendorName, String rateCard, String location, String jobType, String payRoll,
			String candidateName, String candidateLocation, String technology, String firstReviewed,
			String secondReviewed, String fileName, String fileType, byte[] content) {
		super();
		this.id = id;
		this.vendorName = vendorName;
		this.rateCard = rateCard;
		this.location = location;
		this.jobType = jobType;
		this.payRoll = payRoll;
		this.candidateName = candidateName;
		this.candidateLocation = candidateLocation;
		this.technology = technology;
		this.firstReviewed = firstReviewed;
		this.secondReviewed = secondReviewed;
		this.fileName = fileName;
		this.fileType = fileType;
	
	}
	public Long getId() {
		return id;
	}
	public String getVendorName() {
		return vendorName;
	}
	public String getRateCard() {
		return rateCard;
	}
	public String getLocation() {
		return location;
	}
	public String getJobType() {
		return jobType;
	}
	public String getPayRoll() {
		return payRoll;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public String getCandidateLocation() {
		return candidateLocation;
	}
	public String getTechnology() {
		return technology;
	}
	public String getFirstReviewed() {
		return firstReviewed;
	}
	public String getSecondReviewed() {
		return secondReviewed;
	}
	public String getFileName() {
		return fileName;
	}
	public String getFileType() {
		return fileType;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public void setRateCard(String rateCard) {
		this.rateCard = rateCard;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public void setPayRoll(String payRoll) {
		this.payRoll = payRoll;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public void setCandidateLocation(String candidateLocation) {
		this.candidateLocation = candidateLocation;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public void setFirstReviewed(String firstReviewed) {
		this.firstReviewed = firstReviewed;
	}
	public void setSecondReviewed(String secondReviewed) {
		this.secondReviewed = secondReviewed;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	
		
	
   
	
}
