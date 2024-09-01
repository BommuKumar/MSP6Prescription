package com.naresh.Database.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Medications")
public class Medications {
	
	
	@Id
	@SequenceGenerator(name="Medications_seq_gen",sequenceName = "Medications_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Medications_seq_gen")
	private int medicationId;
	
	 
	
	private String medicationName;
	
	private String dosage;
	
	private String frequency;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="prescription_id")
	private Prescriptions prescriptions; 
	 
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "medications")
	private List<Dispensation> dispensations;
	
	
	 
   public Medications(int medicationId) {
		super();
		this.medicationId = medicationId;
	}
public List<Dispensation> getDispensations() {
		return dispensations;
	}
	public void setDispensations(List<Dispensation> dispensations) {
		this.dispensations = dispensations;
	}
public Prescriptions getPrescriptions() {
		return prescriptions;
	}
	public void setPrescriptions(Prescriptions prescriptions) {
		this.prescriptions = prescriptions;
	}
public int getMedicationId() {
		return medicationId;
	}
	public void setMedicationId(int medicationId) {
		this.medicationId = medicationId;
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
	
 
 
 
public Medications(int medicationId, String medicationName, String dosage, String frequency,
			Prescriptions prescriptions, List<Dispensation> dispensations) {
		super();
		this.medicationId = medicationId;
		this.medicationName = medicationName;
		this.dosage = dosage;
		this.frequency = frequency;
		this.prescriptions = prescriptions;
		this.dispensations = dispensations;
	}
@Override
public String toString() {
	return "Medications [medicationId=" + medicationId + ", medicationName=" + medicationName + ", dosage=" + dosage
			+ ", frequency=" + frequency + ", prescriptions=" + prescriptions + ", dispensations=" + dispensations
			+ "]";
}
public Medications() {
	super();
}

 
}
 
