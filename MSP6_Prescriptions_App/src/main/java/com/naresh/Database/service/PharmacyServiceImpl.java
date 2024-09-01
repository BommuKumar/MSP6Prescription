package com.naresh.Database.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.Database.Entity.Pharmacy;
import com.naresh.Database.Repository.PharmacyRepository;

@Service
public class PharmacyServiceImpl implements PharmacyService{

	@Autowired
	PharmacyRepository pharmacyRepository;
	
	
	@Override
	public String addPharamacy(Pharmacy pharmacy) {

		Pharmacy savedParmacy=pharmacyRepository.save(pharmacy);
		
		
	       return Optional.ofNullable(savedParmacy)
	                    .map(pah->"pharamacy registerd with "+pah.getPharmacyId())
	                    .orElse("something went wrong");
	}

	 

}
