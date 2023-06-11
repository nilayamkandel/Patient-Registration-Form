package com.model;

public class Patient {
	private String Name;
	private String Gender;
	private String Phone;
	private String DOB;
	private String MaritalStatus;
	private String PresentAddress;
	private String CommunicationAddress;
	private String PastMedicalHistory;
	private String OtherDetails;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getPresentAddress() {
		return PresentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		PresentAddress = presentAddress;
	}
	public String getCommunicationAddress() {
		return CommunicationAddress;
	}
	public void setCommunicationAddress(String communicationAddress) {
		CommunicationAddress = communicationAddress;
	}
	public String getPastMedicalHistory() {
		return PastMedicalHistory;
	}
	public void setPastMedicalHistory(String pastMedicalHistory) {
		PastMedicalHistory = pastMedicalHistory;
	}
	public String getOtherDetails() {
		return OtherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		OtherDetails = otherDetails;
	}
	
	
}
