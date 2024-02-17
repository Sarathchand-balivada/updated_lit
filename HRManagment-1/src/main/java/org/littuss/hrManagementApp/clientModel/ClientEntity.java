package org.littuss.hrManagementApp.clientModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientRegisterdetials")
public class ClientEntity {
	
	private String slNo;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String date;
	private String clientName;
	private String webSite;
	private String contactPerson;
	private String contactNo;
	private String emailId;
	private String meetingTime;
	private String whoInvolved;
	private String remark;
	
	public ClientEntity() {
		
	}
	public ClientEntity(String slNo, String date, String clientName, String webSite, String contactPerson, String contactNo,
			String emailId, String meetingTime, String whoInvolved, String remark) {
		
		this.slNo = slNo;
		this.date = date;
		this.clientName = clientName;
		this.webSite = webSite;
		this.contactPerson = contactPerson;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.meetingTime = meetingTime;
		this.whoInvolved = whoInvolved;
		this.remark = remark;
	}
	public String getSlNo() {
		return slNo;
	}
	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMeetingTime() {
		return meetingTime;
	}
	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}
	public String getWhoInvolved() {
		return whoInvolved;
	}
	public void setWhoInvolved(String whoInvolved) {
		this.whoInvolved = whoInvolved;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "Entityclass [slNo=" + slNo + ", date=" + date + ", clientName=" + clientName + ", webSite=" + webSite
				+ ", contactPerson=" + contactPerson + ", contactNo=" + contactNo + ", emailId=" + emailId
				+ ", meetingTime=" + meetingTime + ", whoInvolved=" + whoInvolved + ", remark=" + remark + "]";
	}
	

}



