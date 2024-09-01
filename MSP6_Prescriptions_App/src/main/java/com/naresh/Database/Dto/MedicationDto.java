package com.naresh.Database.Dto;

import java.util.List;

import com.naresh.Database.Entity.Dispensation;
import com.naresh.Database.Entity.Prescriptions;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class MedicationDto {
	
    //private int medicationId;
	
    private String medicationName;
	
	private String dosage;
	
	private String frequency;
	 
	private List<Dispensation> dispensations ;

 
	public MedicationDto(String medicationName, String dosage, String frequency, List<Dispensation> dispensations) {
		super();
		this.medicationName = medicationName;
		this.dosage = dosage;
		this.frequency = frequency;
		this.dispensations = dispensations;
	}



	public String getMedicationName() {
		return medicationName;
	}



	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}



	public String getDosage() {
		return dosage;
	}



	public void setDosage(String dosage) {
		this.dosage = dosage;
	}



	public String getFrequency() {
		return frequency;
	}



	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}



	public List<Dispensation> getDispensations() {
		return dispensations;
	}



	public void setDispensations(List<Dispensation> dispensations) {
		this.dispensations = dispensations;
	}


 

	@Override
	public String toString() {
		return "MedicationDto [medicationName=" + medicationName + ", dosage=" + dosage + ", frequency=" + frequency
				+ ", dispensations=" + dispensations + "]";
	}



	public MedicationDto() {
		super();
	}
	
	

}
