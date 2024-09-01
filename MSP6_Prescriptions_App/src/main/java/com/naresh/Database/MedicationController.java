package com.naresh.Database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.Database.Dto.DispensationDto;
import com.naresh.Database.Dto.MedicationDto;
import com.naresh.Database.Dto.MedicationUpdatedDto;
import com.naresh.Database.service.MedicationService;

@RestController
public class MedicationController {
	
	@Autowired
	MedicationService medicationService;
	
	@PostMapping("get/medicines/{patientId}")
	
	public ResponseEntity<List<MedicationDto>> getMedicine(@PathVariable("patientId") int patientId)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(medicationService.getmedicationsDetails(patientId));
		
	}
	 
	@PostMapping("update/medicine/{medicationId}")

	public ResponseEntity<String> updateMedicine(@PathVariable("medicationId") int medicationId,@RequestBody MedicationUpdatedDto medicationUpdatedDto )
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(medicationService.upadatedmedicationsDetails(medicationId, medicationUpdatedDto));
		
	}
}
