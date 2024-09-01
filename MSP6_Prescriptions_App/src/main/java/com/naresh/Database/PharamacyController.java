package com.naresh.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.Database.Entity.Pharmacy;
import com.naresh.Database.Entity.Prescriptions;
import com.naresh.Database.service.PharmacyService;

import jakarta.ws.rs.core.MediaType;

@RestController
public class PharamacyController {
	
	@Autowired
	PharmacyService pharmacyService;
	
	@PostMapping(path="create/pharmacy",consumes = MediaType.APPLICATION_JSON,produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<String>  createPharmacy(@RequestBody Pharmacy  pharmacy)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(pharmacyService.addPharamacy(pharmacy));
		
	}

}
