package com.naresh.Database.FeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MSP2-Patient-App")
public interface PatientFeignClient {
	

    @GetMapping(path="/Patient/is/patient/exist/{patientId}")
	
	public ResponseEntity<Boolean> isPatientExist(@PathVariable("patientId") int patientId);
    
}