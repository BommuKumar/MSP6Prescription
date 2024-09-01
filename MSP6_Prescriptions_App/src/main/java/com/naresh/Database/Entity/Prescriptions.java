package com.naresh.Database.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Prescriptions")
public class Prescriptions {
	
	 @Id	
	 @SequenceGenerator(name = "prescriptions_seq_gen",sequenceName = "prescriptions_seq",allocationSize = 1)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "prescriptions_seq_gen")
	 private int prescriptionId;
	
	private int  patientId;  // fk but in diffrent app sotake as normal property
	
	private int  doctorId;  // fk but in diffrent app sotake as normal property
	
	private int appointmentId;  // fk but in diffrent app sotake as normal property
	
	private LocalDate prescriptionDate;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "prescriptions")
	List<Medications> medications;
	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "prescriptions")
	private List<Dispensation> dispensations;
	
	

	public Prescriptions(int prescriptionId) {
		super();
		this.prescriptionId = prescriptionId;
	}

	public List<Dispensation> getDispensations() {
		return dispensations;
	}

	public void setDispensations(List<Dispensation> dispensations) {
		this.dispensations = dispensations;
	}

	public List<Medications> getMedications() {
		return medications;
	}

	public void setMedications(List<Medications> medications) {
		this.medications = medications;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	 
	 

	 

	public LocalDate getPrescriptionDate() {
		return prescriptionDate;
	}

	public void setPrescriptionDate(LocalDate prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}
 
 
 
	public Prescriptions(int prescriptionId, int patientId, int doctorId, int appointmentId, LocalDate prescriptionDate,
			List<Medications> medications, List<Dispensation> dispensations) {
		super();
		this.prescriptionId = prescriptionId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentId = appointmentId;
		this.prescriptionDate = prescriptionDate;
		this.medications = medications;
		this.dispensations = dispensations;
	}

	@Override
	public String toString() {
		return "Prescriptions [prescriptionId=" + prescriptionId + ", patientId=" + patientId + ", doctorId=" + doctorId
				+ ", appointmentId=" + appointmentId + ", prescriptionDate=" + prescriptionDate + ", medications="
				+ medications + ", dispensations=" + dispensations + "]";
	}

	public Prescriptions() {
		super();
	}

	
	
	
}
 