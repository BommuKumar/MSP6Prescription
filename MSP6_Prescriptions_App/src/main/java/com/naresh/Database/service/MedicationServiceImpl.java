package com.naresh.Database.service;

import java.util.ArrayList;
import java.util.List;import java.util.function.Function;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.Database.Dto.MedicationDto;
import com.naresh.Database.Dto.MedicationUpdatedDto;
import com.naresh.Database.Entity.Medications;
import com.naresh.Database.Entity.Prescriptions;
import com.naresh.Database.Repository.MedicationsRepository;
import com.naresh.Database.Repository.PrescriptionsRepository;

@Service
public class MedicationServiceImpl implements MedicationService {
	
	@Autowired
	MedicationsRepository medicationsRepository;
	
	@Autowired
	PrescriptionsRepository prescriptionsRepository;

	ModelMapper modelMapper= new ModelMapper();
	
	
	@Override
	public List<MedicationDto> getmedicationsDetails(int patientId) {


		List<Prescriptions> prescriptions=prescriptionsRepository.findByPatientId(patientId);
		
		List<Medications> result=new ArrayList<>();
		
	
		
		prescriptions.stream().forEach(prescription->
		      {
		    	  prescription.getMedications().stream().forEach(medi->result.add(medi));
		       });
		
		
		 
	//	List<Integer>  pids=prescriptions.stream().map(pres->pres.getPrescriptionId()).collect(Collectors.toList());
		
		//System.out.println(pids);  
		
		//List<Medications> allMedications=medicationsRepository.findAllById(pids);

		
		//  for(Medications me:allMedications)
		//  {
			//System.out.println(me.toString());  
		  //}
		//
		
		return result.stream().map(med->
		{
			return modelMapper.map(med, MedicationDto.class);
		}).collect(Collectors.toList());
		
 	}


	@Override
	public String upadatedmedicationsDetails(int medicationID,MedicationUpdatedDto medicationUpdatedDto) {

		
		System.out.println(medicationUpdatedDto.getMedicationName());
		
		System.out.println(medicationUpdatedDto.getDosage());

		
		System.out.println(medicationUpdatedDto.getFrequency());


		Medications  medication=medicationsRepository.findById(medicationID).get();
		
		medication.setMedicationName(medicationUpdatedDto.getMedicationName());
		
		medication.setDosage(medicationUpdatedDto.getDosage());
		
		medication.setFrequency(medicationUpdatedDto.getFrequency());
		
		medicationsRepository.save(medication);
		
		return "medications detiled updated scessfully";
	}

}
