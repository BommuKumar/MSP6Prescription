package com.naresh.Database.Dto;

import java.util.List;

import com.naresh.Database.Entity.Dispensation;

import jakarta.persistence.OneToMany;

public class PharmacyDto {
	
    //private int pharmacyId;
	
	private String pharmacyName;
	
	private String address;
	
	private String  contactNumber;
	
	private String email;
	
	private String openingHours;
	
	
	private List<Dispensation> dispensation;


 

	public String getPharmacyName() {
		return pharmacyName;
	}


	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getOpeningHours() {
		return openingHours;
	}


	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}


	public List<Dispensation> getDispensation() {
		return dispensation;
	}


	public void setDispensation(List<Dispensation> dispensation) {
		this.dispensation = dispensation;
	}

 

	 


	@Override
	public String toString() {
		return "PharmacyDto [pharmacyName=" + pharmacyName + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", email=" + email + ", openingHours=" + openingHours + ", dispensation=" + dispensation + "]";
	}


	public PharmacyDto(String pharmacyName, String address, String contactNumber, String email, String openingHours,
			List<Dispensation> dispensation) {
		super();
		this.pharmacyName = pharmacyName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.openingHours = openingHours;
		this.dispensation = dispensation;
	}


	public PharmacyDto() {
		super();
	}
	
	

}
