package com.naresh.Database.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.naresh.Database.CustomException.InvalidDetails;
import com.naresh.Database.Dto.AppointmentResponseDto;
import com.naresh.Database.Dto.PrescriptionDto;
import com.naresh.Database.Dto.UserResponseDto;
import com.naresh.Database.Entity.Medications;
import com.naresh.Database.Entity.Prescriptions;
import com.naresh.Database.FeignClients.AppointmentFeignClient;
import com.naresh.Database.FeignClients.PatientFeignClient;

@Service
public class PrescriptionsServiceImpl implements PrescriptionsService {

	
	ModelMapper modelMapper= new ModelMapper();
	
	@Autowired
	PatientFeignClient patientFeignClient;
	
	@Autowired
	AppointmentFeignClient  appointmentFeignClient;
 
	
	@Autowired
	com.naresh.Database.Repository.PrescriptionsRepository prescriptionsRepository;
	
	
	@Override
	public String createPrescription(PrescriptionDto prescriptionDto) {

  
		UserResponseDto user=(UserResponseDto) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		
		ResponseEntity<Boolean> isPatientExist=patientFeignClient.isPatientExist(prescriptionDto.getPatientId());
		
		
		
		  List<AppointmentResponseDto> appointments=appointmentFeignClient.getAllAppointments().getBody();
		
		  
		       boolean isValidAppointment=Optional.ofNullable(appointments).filter(appointList->
		    		   
		                          appointList.stream().anyMatch(appoint->appoint.getAppointmentId()==prescriptionDto.getAppointmentId()&&appoint.getPatientId()==prescriptionDto.getPatientId())).isPresent();
		 
		 //boolean isValidAppointment=appointments.stream().anyMatch(appoint->appoint.getAppointmentId()==prescriptionDto.getAppointmentId()&&appoint.getPatientId()==prescriptionDto.getPatientId());
		  
		  
		if(isPatientExist!=null &&isPatientExist.getStatusCode().is2xxSuccessful()&& isValidAppointment)
		{
		 
			Prescriptions prescriptions =modelMapper.map(prescriptionDto, Prescriptions.class);
			
			prescriptions.setDoctorId(user.getDoctorId());
			
			prescriptions.setPrescriptionDate(LocalDate.now());
			
			Optional.ofNullable(prescriptions.getMedications())
			     .ifPresent(medication->
			             {
			    			 medication.stream().forEach(medi->medi.setPrescriptions(prescriptions));
			    		 });
			
			prescriptionsRepository.save(prescriptions);
			
			return "Prescriptions created sucessfuly";	
		}
		
		else
		{
			throw new InvalidDetails("please entter a valid appointment details ");
		}
 	 
//          /*  Optional.ofNullable(prescriptionDto)
//                           .ifPresent(prescription->
//                        		   {
//                        			   prescription.setDoctorId(user.getDoctorId());
//                        			   prescription.setPrescriptionDate(LocalDateTime.now());
//                        		   });
//                           Optional.ofNullable(prescriptions).map(pres->pres.getMedications())
// 			                   .ifPresent(list->
// 				                     {
// 			                      	list.stream().forEach(mediaction->mediaction.setPrescriptions(prescriptions)); 
//  			                      prescriptionsRepository.save(prescriptions);
//  				                     }); */
// 	
		 
		 
          
        //  prescriptions.getMedications().stream().forEach(pres->pres.setPrescriptions(prescriptions));
		
		//prescriptionsRepository.save(prescriptions);
 		 
	}

}
