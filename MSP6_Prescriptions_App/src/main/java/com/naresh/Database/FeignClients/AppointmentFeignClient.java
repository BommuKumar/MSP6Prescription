package com.naresh.Database.FeignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.naresh.Database.Dto.AppointmentResponseDto;

@FeignClient("MSP5-Appointment-App")
public interface AppointmentFeignClient {
 
	@GetMapping(path="/Appointment/is/Appointment/exists/{appointmentId}")
		
	  public ResponseEntity<Boolean> isAppointmentExist(@PathVariable("appointmentId") int appointmentId);
 
	 
	    @GetMapping("Appointment/get/Appointments")
		public ResponseEntity<List<AppointmentResponseDto>> getAllAppointments() ;
			
}
