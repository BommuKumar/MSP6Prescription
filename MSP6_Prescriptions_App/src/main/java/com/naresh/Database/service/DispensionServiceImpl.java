package com.naresh.Database.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.Database.CustomException.InvalidDetails;
import com.naresh.Database.Dto.DispensationDto;
import com.naresh.Database.Dto.DispensedResDto;
import com.naresh.Database.Entity.Dispensation;
import com.naresh.Database.Entity.Medications;
import com.naresh.Database.Entity.Pharmacy;
import com.naresh.Database.Entity.Prescriptions;
import com.naresh.Database.Repository.DispenseRepository;
import com.naresh.Database.Repository.MedicationsRepository;
import com.naresh.Database.Repository.PharmacyRepository;
import com.naresh.Database.Repository.PrescriptionsRepository;

@Service
public class DispensionServiceImpl implements DispensionService {

	@Autowired
	DispenseRepository dispenseRepository;
	
	@Autowired
	MedicationsRepository medicationsRepository ;
	
	@Autowired
	PrescriptionsRepository  prescriptionsRepository;
	
	@Autowired
	PharmacyRepository pharmacyRepository;
	
	@Override
	public String dispenceMedicine(DispensationDto dispensationdto) {

          ModelMapper modelMapper=new ModelMapper();
		
    
         // Dispensation dispensation =modelMapper.map(dispensationdto, Dispensation.class);


          Dispensation dispensation=new Dispensation();
          
          
          boolean isMedicineExist=medicationsRepository.existsById(dispensationdto.getMedicationId());
          
          boolean isPrescriptionExist=prescriptionsRepository.existsById(dispensationdto.getPrescriptionId());
          
          Pharmacy isPharmacyExist =pharmacyRepository.findById(dispensationdto.getPharmacyId()).get();
          
         
          if(isMedicineExist && isPrescriptionExist && isPharmacyExist!=null) {
          
          dispensation.setMedications(new Medications(dispensationdto.getMedicationId()));
          dispensation.setPharmacy(new Pharmacy(dispensationdto.getPharmacyId()));
          dispensation.setPrescriptions(new Prescriptions(dispensationdto.getPrescriptionId()));
          
          dispensation.setDispensationDate(LocalDate.now());
          dispensation.setDispensedBy(isPharmacyExist.getPharmacyName());
          
          dispensation.setDispensedQuantity(dispensationdto.getDispensedQuantity());
          
		 dispenseRepository.save(dispensation);
		 
			return "mediactions dispensed successfully";

		 
          }else {
        	  throw new InvalidDetails("Invalid Details ");
          }
		 
	 	
 	}

	@Override
	public List<DispensedResDto> getAllDespentions(int patientId) {

		ModelMapper modelMapper=new ModelMapper();

		List<Prescriptions> prescriptions=prescriptionsRepository.findByPatientId(patientId);
		
		List<Dispensation> result= new ArrayList<>();
		
		List<DispensationDto> res = new ArrayList<>();
		
		prescriptions.stream().forEach(prescription->
		{
			prescription.getMedications().stream().forEach(Medication->
			{
				result.addAll(Medication.getDispensations());
			});
			
		});
		
		
		return result.stream().map(dis->
		     {
		      return  modelMapper.map(dis, DispensedResDto.class);
		    }
	 	).collect(Collectors.toList());
	}

}




