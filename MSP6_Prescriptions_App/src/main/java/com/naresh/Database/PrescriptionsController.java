package com.naresh.Database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.Database.Dto.PrescriptionDto;
import com.naresh.Database.Entity.Prescriptions;
import com.naresh.Database.service.PrescriptionsService;

@RestController
public class PrescriptionsController {
	
	
	@Autowired
	PrescriptionsService prescriptionsService;
	
	@PostMapping("create/prescription")
	public ResponseEntity<String>  createPrescription(@RequestBody PrescriptionDto prescriptionDto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(prescriptionsService.createPrescription(prescriptionDto));
		
	}
	
	@GetMapping("get/patient/pres/history/{patientId}")
	public ResponseEntity<List<Prescriptions>>  getPatientPrescriptionHistory(@PathVariable("patientId") int patientId)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(prescriptionsService.PrescriptionHistoryForPatients(patientId));
		
	}
	
	 

}
