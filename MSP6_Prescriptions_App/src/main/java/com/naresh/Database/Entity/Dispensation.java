package com.naresh.Database.Entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Dispensation")
public class Dispensation {
	
	@SequenceGenerator(name = "Dispensation_seq_gen",sequenceName = "Dispensation_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="Dispensation_seq_gen")
	@Id
	private int dispensationId;
	
	
	private int dispensedQuantity; 
	
	private LocalDate dispensationDate;
	
	private String dispensedBy;
	
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="medication_id")
	private Medications medications;


	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="prescription_id")
	private Prescriptions  prescriptions;
	
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="pharmacy_id")
	private Pharmacy  pharmacy;
 

	 

 

	public int getDispensationId() {
		return dispensationId;
	}




	public Dispensation(int dispensationId) {
		super();
		this.dispensationId = dispensationId;
	}




	public void setDispensationId(int dispensationId) {
		this.dispensationId = dispensationId;
	}




	public int getDispensedQuantity() {
		return dispensedQuantity;
	}


 

	public void setDispensedQuantity(int dispensedQuantity) {
		this.dispensedQuantity = dispensedQuantity;
	}


	public LocalDate getDispensationDate() {
		return dispensationDate;
	}


	public void setDispensationDate(LocalDate dispensationDate) {
		this.dispensationDate = dispensationDate;
	}


	public String getDispensedBy() {
		return dispensedBy;
	}


	public void setDispensedBy(String dispensedBy) {
		this.dispensedBy = dispensedBy;
	}


	public Prescriptions getPrescriptions() {
		return prescriptions;
	}


	public void setPrescriptions(Prescriptions prescriptions) {
		this.prescriptions = prescriptions;
	}


	public Medications getMedications() {
		return medications;
	}


	public void setMedications(Medications medications) {
		this.medications = medications;
	}


	 

	public Dispensation() {
		super();
	}


	public Pharmacy getPharmacy() {
		return pharmacy;
	}


	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}




	@Override
	public String toString() {
		return "Dispensation [dispensationId=" + dispensationId + ", dispensedQuantity=" + dispensedQuantity
				+ ", dispensationDate=" + dispensationDate + ", dispensedBy=" + dispensedBy + ", medications="
				+ medications + ", prescriptions=" + prescriptions + ", pharmacy=" + pharmacy + "]";
	}




	public Dispensation(int dispensationId, int dispensedQuantity, LocalDate dispensationDate, String dispensedBy,
			Medications medications, Prescriptions prescriptions, Pharmacy pharmacy) {
		super();
		this.dispensationId = dispensationId;
		this.dispensedQuantity = dispensedQuantity;
		this.dispensationDate = dispensationDate;
		this.dispensedBy = dispensedBy;
		this.medications = medications;
		this.prescriptions = prescriptions;
		this.pharmacy = pharmacy;
	}

 

	 

	 
 
	
	

}
 
 
 
 