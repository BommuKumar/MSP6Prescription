package com.naresh.Database.FeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MSP3-Doctor-App")
public interface DoctorFeignClient {

@GetMapping(path="/doctor/is/doctor/exists/{doctorId}")
public ResponseEntity<Boolean> isDocotorExists(@PathVariable("doctorId") int doctorId);

}