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
import com.naresh.Database.Dto.DispensedResDto;
import com.naresh.Database.Entity.Dispensation;
import com.naresh.Database.Entity.Prescriptions;

@RestController
public class DispensionController {

	@Autowired
	com.naresh.Database.service.DispensionService dispensionService;
	
	@PostMapping("dispense/medicine")
	public ResponseEntity<String>  dispenseMedicine(@RequestBody DispensationDto dispensationDto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(dispensionService.dispenceMedicine(dispensationDto));
		
	}
	

	@PostMapping("get/dispense/{patientId}")
	public ResponseEntity<List<DispensedResDto>>  getDispense(@PathVariable("patientId") int patientId)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(dispensionService.getAllDespentions(patientId));
		
	}
}
