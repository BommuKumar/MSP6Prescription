package com.naresh.Database.Dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.naresh.Database.Entity.Dispensation;
import com.naresh.Database.Entity.Medications;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

public class PrescriptionDto {

	
	  private int prescriptionId;
		
		private int  patientId;  // fk but in diffrent app sotake as normal property
		
		private int  doctorId;  // fk but in diffrent app sotake as normal property
		
		private int appointmentId;  // fk but in diffrent app sotake as normal property
		
		private LocalDate prescriptionDate;
		
		
		private List<MedicationDto> medications;
		
	 		 
		private List<DispensationDto> dispensations;

 
 		public int getPrescriptionId() {
 			return prescriptionId;
 		}
//
//
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


		public List<MedicationDto> getMedications() {
			return medications;
		}


		public void setMedications(List<MedicationDto> medications) {
			this.medications = medications;
		}


		public List<DispensationDto> getDispensations() {
			return dispensations;
		}


		public void setDispensations(List<DispensationDto> dispensations) {
			this.dispensations = dispensations;
		}

 
 

		 


		public PrescriptionDto(int prescriptionId, int patientId, int doctorId, int appointmentId,
				LocalDate prescriptionDate, List<MedicationDto> medications, List<DispensationDto> dispensations) {
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
			return "PrescriptionDto [prescriptionId=" + prescriptionId + ", patientId=" + patientId + ", doctorId="
					+ doctorId + ", appointmentId=" + appointmentId + ", prescriptionDate=" + prescriptionDate
					+ ", medications=" + medications + ", dispensations=" + dispensations + "]";
		}
		public PrescriptionDto() {
			super();
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
