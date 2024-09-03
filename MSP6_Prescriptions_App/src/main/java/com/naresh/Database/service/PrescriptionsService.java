package com.naresh.Database.service;

import java.util.List;

import com.naresh.Database.Dto.PrescriptionDto;
import com.naresh.Database.Entity.Prescriptions;

public interface PrescriptionsService {
	
 	
	public String createPrescription(PrescriptionDto prescriptionDto);
	
	// Generate Prescription History for Patients
	
	public List<Prescriptions> PrescriptionHistoryForPatients(int patientId);

 
}
