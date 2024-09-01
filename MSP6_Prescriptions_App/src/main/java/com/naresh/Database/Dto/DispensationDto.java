package com.naresh.Database.Dto;

import java.time.LocalDate;

import com.naresh.Database.Entity.Medications;
import com.naresh.Database.Entity.Pharmacy;
import com.naresh.Database.Entity.Prescriptions;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class DispensationDto {
	
 //   private int dispensationId;
	
	
	private int dispensedQuantity;
 
	private int  prescriptionId;
	
	private int medicationId;
	
	private int pharmacyId;

//	public int getDispensationId() {
//		return dispensationId;
//	}
//
//	public void setDispensationId(int dispensationId) {
//		this.dispensationId = dispensationId;
//	}

	public int getDispensedQuantity() {
		return dispensedQuantity;
	}

	public void setDispensedQuantity(int dispensedQuantity) {
		this.dispensedQuantity = dispensedQuantity;
	}
 
	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public int getMedicationId() {
		return medicationId;
	}

	public void setMedicationId(int medicationId) {
		this.medicationId = medicationId;
	}

	public int getPharmacyId() {
		return pharmacyId;
	}

	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

 

	 

	public DispensationDto(int dispensedQuantity, int prescriptionId, int medicationId, int pharmacyId) {
		super();
		this.dispensedQuantity = dispensedQuantity;
		this.prescriptionId = prescriptionId;
		this.medicationId = medicationId;
		this.pharmacyId = pharmacyId;
	}

	@Override
	public String toString() {
		return "DispensationDto [dispensedQuantity=" + dispensedQuantity + ", prescriptionId=" + prescriptionId
				+ ", medicationId=" + medicationId + ", pharmacyId=" + pharmacyId + "]";
	}

	public DispensationDto() {
		super();
	}
	
	
	
	


}
