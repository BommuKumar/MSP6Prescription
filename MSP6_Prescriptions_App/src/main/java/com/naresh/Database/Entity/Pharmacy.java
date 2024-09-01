package com.naresh.Database.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="Pharmacy")
public class Pharmacy {
	
	
	@Id
	@SequenceGenerator(name="Pharmacy_seq_gen",sequenceName ="Pharmacy_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Pharmacy_seq_gen")
	private int pharmacyId;
	
	private String pharmacyName;
	
	private String address;
	
	private String  contactNumber;
	
	private String email;
	
	private String openingHours;
	
	
	
	@OneToMany(mappedBy = "pharmacy")
	private List<Dispensation> dispensation;

	public Pharmacy(int pharmacyId) {
		super();
		this.pharmacyId = pharmacyId;
	}

	public int getPharmacyId() {
		return pharmacyId;
	}

	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

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

	 
	 

	public Pharmacy(int pharmacyId, String pharmacyName, String address, String contactNumber, String email,
			String openingHours, List<Dispensation> dispensation) {
		super();
		this.pharmacyId = pharmacyId;
		this.pharmacyName = pharmacyName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.openingHours = openingHours;
		this.dispensation = dispensation;
	}

	@Override
	public String toString() {
		return "Pharmacy [pharmacyId=" + pharmacyId + ", pharmacyName=" + pharmacyName + ", address=" + address
				+ ", contactNumber=" + contactNumber + ", email=" + email + ", openingHours=" + openingHours
				+ ", dispensation=" + dispensation + "]";
	}

	public List<Dispensation> getDispensation() {
		return dispensation;
	}

	public void setDispensation(List<Dispensation> dispensation) {
		this.dispensation = dispensation;
	}

	public Pharmacy() {
		super();
	}
	
	
} 
